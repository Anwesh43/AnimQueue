package com.anwesome.uiview.animationqueue;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/**
 * Created by anweshmishra on 29/11/16.
 */
public class AnimationComponent {
    private View view;
    private boolean started = false,finished = false;
    private AnimationMode mode;
    private float to,from;
    private int duration;
    public AnimationComponent(View view,AnimationMode mode,int duration,float from,float to) {
        this.view = view;
        this.mode = mode;
        this.duration = duration;
        this.from = from;
        this.to = to;
    }
    public void start(final AnimationQueue queue) {

        ValueAnimator valueAnimator = ValueAnimator.ofFloat(from,to);
        valueAnimator.setDuration(duration);
        AnimationHandler animationHandler = new AnimationHandler() {
            public void onAnimationEnd(Animator animator) {
                started = false;
                finished = true;
                queue.process();
            }
            public void onAnimationUpdate(ValueAnimator animator) {
                switch (mode) {
                    case ROTATE_X:
                        view.setRotationX((float)animator.getAnimatedValue());
                        break;
                    case ROTATE_Y:
                        view.setRotationY((float)animator.getAnimatedValue());
                        break;
                    case ROTATE_Z:
                        view.setRotation((float)animator.getAnimatedValue());
                        break;
                    case TRANSLATE_X:
                        view.setTranslationX((float)animator.getAnimatedValue());
                        break;
                    case TRANSLATE_Y:
                        view.setTranslationY((float)animator.getAnimatedValue());
                        break;
                    case TRANSLATE_XY:
                        view.setTranslationX((float)animator.getAnimatedValue());
                        view.setTranslationY((float)animator.getAnimatedValue());
                        break;
                    case SCALE_X:
                        view.setScaleX((float)animator.getAnimatedValue());
                        break;
                    case SCALE_Y:
                        view.setScaleY((float)animator.getAnimatedValue());
                        break;
                    case SCALE_XY:
                        view.setScaleX((float)animator.getAnimatedValue());
                        view.setScaleY((float)animator.getAnimatedValue());
                        break;
                    case FADE_IN:
                        if(view.getVisibility()==View.INVISIBLE) {
                            view.setAlpha((float) animator.getAnimatedValue());

                        }
                        break;
                    case FADE_OUT:
                        if(view.getVisibility()==View.VISIBLE) {
                            view.setAlpha((float) animator.getAnimatedValue());

                        }
                        break;
                    default:
                        break;
                }
            }
        };
        valueAnimator.addUpdateListener(animationHandler);
        valueAnimator.addListener(animationHandler);
        valueAnimator.start();
        started = true;

    }
    public boolean isStarted() {
        return started;
    }
    public boolean isFinished() {
        return finished;
    }
    public int hashCode() {
        return this.view.hashCode()+this.mode.hashCode()+this.duration+(int)this.from+(int)this.to;
    }
}

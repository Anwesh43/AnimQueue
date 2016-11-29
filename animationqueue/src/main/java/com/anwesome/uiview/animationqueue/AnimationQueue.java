package com.anwesome.uiview.animationqueue;

import android.animation.Animator;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by anweshmishra on 29/11/16.
 */
public class AnimationQueue {
    private ConcurrentLinkedQueue<AnimationComponent> animationComponents = new ConcurrentLinkedQueue<>();
    private AnimationComponent currentComponent;
    public void pushAnimation(AnimationComponent animationComponent) {
        if(animationComponents.size() == 0) {
            currentComponent = animationComponent;
        }
        animationComponents.add(animationComponent);
        process();
    }
    public void process() {
        if(!currentComponent.isStarted() && animationComponents.size()>0) {
            if (currentComponent.isFinished()) {
                currentComponent = animationComponents.remove();
            }
            currentComponent.start(this);
        }
    }
}

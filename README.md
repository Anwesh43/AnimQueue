#AnimQueue
##A simple android library to queue up all the animations to run them in sequence.

##Usage
```
    int duration1 = 1000,duration2 = 500,duration3 = 200;
    float to1=360,from1=0,from2 = 0,to2 = 180,to3=270,from3=90;
    AnimationQueue queue = new AnimationQueue();
    AnimationComponent component1 = new AnimationComponent(view1,AnimationMode.ROTATE_X,duration,from1,to1);
    AnimationComponent component2 = new AnimationComponent(view2,AnimationMode.ROTATE_Y,duration,from2,to2);
    AnimationComponent component3 = new AnimationComponent(view3,AnimationMode.ROTATE_XY,duration,from3,to3);
    queue.pushAnimation(component1);
    queue.pushAnimation(component2);
    queue.pushAnimation(component3);
```

##Animation Modes available
```
  AnimationMode.ROTATE_X
  AnimationMode.ROTATE_Y
  AnimationMode.ROTATE_Z
  AnimationMode.SCALE_XY
  AnimationMode.SCALE_X
  AnimationMode.SCALE_Y
  AnimationMode.TRANSLATE_X
  AnimationMode.TRANSLATE_Y
  AnimationMode.TRANSLATE_XY
  AnimationMode.FADE_IN
  AnimationMode.FADE_OUT
```

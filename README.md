#AnimQueue
##A simple android library to queue up all the animations to run them in sequence.

##Usage
```
    int duration = 1000;
    float to=360,from=0;
    AnimationQueue queue = new AnimationQueue();
    AnimationComponent component1 = new AnimationComponent(view1,AnimationMode.ROTATE_X,duration,from,to);
    AnimationComponent component2 = new AnimationComponent(view1,AnimationMode.ROTATE_Y,duration,from,to);
    AnimationComponent component3 = new AnimationComponent(view1,AnimationMode.ROTATE_XY,duration,from,to);
    queue.pushAnimation(component1);
    queue.pushAnimation(component2);
    queue.pushAnimation(component3);
```

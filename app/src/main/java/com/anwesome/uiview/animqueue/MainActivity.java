package com.anwesome.uiview.animqueue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.anwesome.uiview.animationqueue.AnimationComponent;
import com.anwesome.uiview.animationqueue.AnimationMode;
import com.anwesome.uiview.animationqueue.AnimationQueue;

public class MainActivity extends AppCompatActivity {
    private AnimationQueue animationQueue = new AnimationQueue();
    private TextView t1,t2,t3,t4;
    private AnimationComponent c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        animationQueue.pushAnimation(c1);
        animationQueue.pushAnimation(c2);
        animationQueue.pushAnimation(c3);
        animationQueue.pushAnimation(c4);
    }
    public void initUi() {
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        t3 = (TextView)findViewById(R.id.t3);
        t4 = (TextView)findViewById(R.id.t4);
        c1 = new AnimationComponent(t1, AnimationMode.ROTATE_Z,1000,0,360);
        c2 = new AnimationComponent(t2, AnimationMode.ROTATE_X,1000,0,360);
        c3 = new AnimationComponent(t3, AnimationMode.ROTATE_Y,10000,0,360);
        c4 = new AnimationComponent(t4, AnimationMode.ROTATE_Z,10000,0,360);
    }

}

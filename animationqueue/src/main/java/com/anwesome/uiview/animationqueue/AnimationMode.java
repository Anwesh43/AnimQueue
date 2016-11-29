package com.anwesome.uiview.animationqueue;

/**
 * Created by anweshmishra on 29/11/16.
 */
public enum AnimationMode {
    ROTATE_X(1),ROTATE_Y(2),ROTATE_Z(3),SCALE_XY(4),SCALE_X(5),SCALE_Y(6),TRANSLATE_X(7),TRANSLATE_Y(8),TRANSLATE_XY(9),FADE_IN(10),FADE_OUT(11);
    private int mode;
    AnimationMode(int mode) {
        this.mode = mode;
    }
    public int getMode() {
        return mode;
    }
}

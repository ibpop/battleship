package model;

import java.awt.*;

/**
 * Created by Mateo on 2016-06-03.
 */
public class Ship {
    private int size;
    private Point startPoint;

    private static enum lean {
        VERTICAL, HORIZONTAL
    }

    private MyRectangle[] rectangles;

    public Ship(int size) {
        this.size = size;
        rectangles  = new MyRectangle[size];
    }

    public int getSize() {
        return size;
    }

    public MyRectangle[] getRectangles() {
        return rectangles;
    }
}

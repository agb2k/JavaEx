package com.company;

public class Point implements Motion {
    private int x = 1, y = 1;
    int h,v, i, j,c;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    @Override
    public void toTop() {
        this.y = y - 1;
    }

    @Override
    public void toBottom() {
        this.y = y + 1;
    }

    @Override
    public void toLeft() {
        this.x = x - 1;
    }

    @Override
    public void toRight() {
        this.x = x + 1;
    }

    public String toString() {
        if (x < 1)
            this.x = 1;
        if (y < 1)
            this.y = 1;
        return "Point at (" + x + "," + y + ")";
    }

    public void display() {
        for (v = 1; v <= y; v = v + 1) {
            for (h = 1; h <= x; h = h + 1) {
                if (h < x) {
                    System.out.print(" ");
                }
                else {
                    if (v < y) {
                        System.out.println();
                    }
                    else {
                        for (i = 5, c = 0; i >= 1; i--) {
                            if (i % 2 == 1) {
                                for (j = 0; j < c; j++) {
                                    System.out.print(" ");
                                }
                                if (j > 0) {
                                    for (h = 1; h < x; h = h + 1) {
                                        System.out.print(" ");
                                    }
                                }
                                c++;
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }
}
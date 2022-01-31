package com.company;

public class Parabola {
//    public double x0, y0, a;
//
//    public Parabola(double x0, double y0, double a){
//        this.x0 = x0;
//        this.y0 = y0;
//        this.a = a;
//    }
    public double a, b, c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointInParabola(double x, double y){
        return y > a * x * x + b * x +c;
//        return y > a * Math.pow(x - x0, 2) + y0;
    }
    public boolean isPointInParabolaOtr(double x, double y){
//        return y < a * Math.pow(x - x0, 2) + y0;
        return y < a * x * x + b * x +c;
    }
}

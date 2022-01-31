package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Parabola P1 = new Parabola(0.5, 3, 1.5);

    public static final Parabola P2 = new Parabola(-0.25, -3, -5);

    public static final Circle C1 = new Circle(1,-3,3);

    public static final Circle C2 = new Circle(0,-3,5);


    public static SimpleColor getColor(double x, double y) {
        if (C1.isPointInCircle(x, y) && P1.isPointInParabola(x, y) && P2.isPointInParabolaOtr(x, y)){
            return SimpleColor.BLUE;
        }
        if (C1.isPointInCircle(x, y) && !P1.isPointInParabola(x, y) && P2.isPointInParabolaOtr(x, y) && C2.isPointInCircle(x,y)){
            return SimpleColor.ORANGE;
        }
        if (!C1.isPointInCircle(x, y) && P1.isPointInParabola(x, y) && P2.isPointInParabolaOtr(x, y)){
            return SimpleColor.WHITE;
        }
        if (C1.isPointInCircle(x, y) && P1.isPointInParabola(x, y) && !P2.isPointInParabolaOtr(x, y)){
            return SimpleColor.WHITE;
        }
        if (C2.isPointInCircle(x,y) && !C1.isPointInCircle(x, y) && P2.isPointInParabolaOtr(x, y) && !P1.isPointInParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        if (P1.isPointInParabola(x, y) && !P2.isPointInParabolaOtr(x, y) && !C1.isPointInCircle(x, y) && C2.isPointInCircle(x,y)){
            return SimpleColor.GRAY;
        }
        if (!P1.isPointInParabola(x, y) && !P2.isPointInParabolaOtr(x, y) && C1.isPointInCircle(x, y)){
            return SimpleColor.GREEN;
        }
        if ((P1.isPointInParabola(x, y) || P2.isPointInParabolaOtr(x, y)) && (!(P2.isPointInParabolaOtr(x, y) && P1.isPointInParabola(x, y)))) {
            return SimpleColor.ORANGE;
        }
        if (!P1.isPointInParabola(x, y) && !P2.isPointInParabolaOtr(x, y) && x>-3){
            return SimpleColor.BLUE;
        }
        return SimpleColor.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + "; " + y + ") -> " + getColor(x,y));
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        printColorForPoint(-9.0, 6.0);
        printColorForPoint(-3.0, 6.0);
        printColorForPoint(5.0, 6.0);
        printColorForPoint(-5.0, 2.0);
        printColorForPoint(-1.0, 1.0);
        printColorForPoint(1.0, -3.0);
        printColorForPoint(-1.0, -4.0); // 1, -3
        printColorForPoint(-3.0, -5.0);
        printColorForPoint(-8.0, -5.0);
        printColorForPoint(-1.5, -1.5);
        printColorForPoint(-1.2, -1.2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = sc.nextDouble();
        System.out.print("Input Y: ");
        double y = sc.nextDouble();

        printColorForPoint(x, y);
    }
}

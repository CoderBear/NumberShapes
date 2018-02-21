package com.udemy.sbsapps.numbershapes;

/**
 * Created by michaelmallamo on 21/02/2018.
 */

public class Number {
    int number;

    public boolean isSquare(){

        double squareRoot = Math.sqrt(number);
        return squareRoot == Math.floor(squareRoot);
    }

    public boolean isTriangular() {

        int x = 1;

        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber = triangularNumber+x;
        }

        return triangularNumber == number;
    }

}
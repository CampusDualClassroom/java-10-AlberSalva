package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        int goal = 0;
        String ballColor;
        do {
            ballColor = getBall();
            System.out.println("La bola es de color: "+ ballColor);
            if(ballColor.equals("azul")) {
                goal++;
            }
        } while(goal < 2);
    }

    public static String getBall() {
        int colorValue = randomWithRange(1,4);
        switch (colorValue) {
            case 1:
                return "verde";
            case 2:
                return "azul";
            case 3:
                return "rojo";
        }

        return null;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}
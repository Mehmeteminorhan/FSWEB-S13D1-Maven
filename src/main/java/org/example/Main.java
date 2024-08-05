package org.example;

public class Main {
    public static void main(String[] args) {
        boolean isBarking = true;
        int clock = 22;
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23){
            return false;
        }
        if (isBarking && (clock < 8 || clock >=20)){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
       
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return (isSummer && temp >=25 && temp <=45) || (!isSummer && temp >=25 && temp <=35);
    }

    public static double area(double width, double height) {
        double alan;

        if (width < 0 || height < 0){
            alan = -1;
        } else {
            alan = width * height;
        }
        return alan;
    }

    public static double area(double radius) {
       double alan;
        if (radius < 0){
           alan = -1;
       }else{
            alan = radius * radius * Math.PI;
        }
        return alan;
    }
}

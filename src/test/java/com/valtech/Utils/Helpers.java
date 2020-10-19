package com.valtech.Utils;

import java.util.Random;

public class Helpers {
    public int generateRandomNumber(int size){
        Random rand = new Random();
        int value = rand.nextInt(size);
        return value;
    }
}

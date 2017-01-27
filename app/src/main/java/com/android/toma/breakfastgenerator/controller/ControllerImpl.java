package com.android.toma.breakfastgenerator.controller;

import java.util.ArrayList;

public class ControllerImpl<T> implements AbstractController<T> {

    @Override
    public int randomGenerator(int max) {
        int min = 0;
        int random = min + (int)(Math.random()*(max - min));
        return random;
    }

    @Override
    public int indexGenerator(ArrayList<T> list) {
        int index = randomGenerator(list.size());
        return index;
    }

    @Override
    public T getByIndex(ArrayList<T> list, int index) {
        return list.get(index);
    }
}
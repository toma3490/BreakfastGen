package com.android.toma.breakfastgenerator.controller;

import java.util.ArrayList;

public interface AbstractController <T>{

    int randomGenerator(int max);
    int indexGenerator(ArrayList<T> list);
    T getByIndex(ArrayList<T> list, int index);
}
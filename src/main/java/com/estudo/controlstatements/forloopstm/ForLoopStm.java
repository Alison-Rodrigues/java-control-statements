package com.estudo.controlstatements.forloopstm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ForLoopStm {

    String[] fruits = {"Apple", "Banana", "Watermelon"};

    String classPath = getClass().getName();

    public void execute() {

        System.out.println("########### Test For Loop ############");
        System.out.println("Class path: " + classPath);

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }
    }
}

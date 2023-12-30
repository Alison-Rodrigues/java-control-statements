package com.estudo.controlstatements.switchstm;

import org.springframework.stereotype.Component;

@Component
public class SwitchStm {

    char grade = 'G';

    String classPath = getClass().getName();

    public void execute() {

        System.out.println("########### Test Switch ############");
        System.out.println("Class path: " + classPath);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            case 'G':
            case 'D':
                System.out.println("You Passed!");
                break;
            case 'E':
                System.out.println("Try again.");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        System.out.println(String.format("You grade is %s", grade));

    }
}

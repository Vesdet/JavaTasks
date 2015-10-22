package com.epam.SE3.task2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Vesdet on 15.10.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
        StringBuilder numQuest = new StringBuilder("question");
        StringBuilder numAnsw = new StringBuilder("answer");
        int number;
        ResourceQuestion question;
        ResourceAnswer answer;

        System.out.println("(1)Your Locale? / (2)Ваша локаль?");

        try (Scanner in = new Scanner(System.in)) {
            number = in.nextInt();
            if (number != 1 && number != 2) throw new InputMismatchException();
            if (number == 1) {
                question = new ResourceQuestion(new Locale("en", "US"));
                answer = new ResourceAnswer(new Locale("en", "US"));
            } else {
                question = new ResourceQuestion(new Locale("ru", "RU"));
                answer = new ResourceAnswer(new Locale("ru", "RU"));
            }
            for (int i = 1; i < 7; i++) {
                numQuest.append(i);
                System.out.println(question.getValue(numQuest.toString()));
                numQuest.deleteCharAt(8);
            }
            number = in.nextInt();
            if (number < 1 || number > 5) throw new InputMismatchException();
            numAnsw.append(number);
            System.out.println(answer.getValue(numAnsw.toString()));
        } catch (InputMismatchException e) {
            System.out.println("Wrong input, try again.");
        }

    }
}

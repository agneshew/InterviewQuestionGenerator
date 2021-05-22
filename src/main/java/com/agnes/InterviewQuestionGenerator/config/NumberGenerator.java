package com.agnes.InterviewQuestionGenerator.config;

import java.util.Random;

public class NumberGenerator {

    Random generator = new Random();

    private int randomNumberOfQuestion;

    public int drawQuestionNumber(int numberOfQuestions) {
        randomNumberOfQuestion = (generator.nextInt(numberOfQuestions) + 1);
        return randomNumberOfQuestion;
    }
}

package com.agnes.InterviewQuestionGenerator.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @NotNull
    private String question;

    @OneToOne(mappedBy = "")
    @JoinColumn(name = "answer_id")
    private Answer answer;
}

package com.agnes.InterviewQuestionGenerator.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private int answerId;
    @NotNull
    private String answer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    private Question question;
}

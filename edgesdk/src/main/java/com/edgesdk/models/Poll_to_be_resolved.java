package com.edgesdk.models;

public class Poll_to_be_resolved {
    Poll_Question poll_question;
    String selectedAnswer;
    int id;
    int wagered_coins;

    public Poll_Question getPoll_question() {
        return poll_question;
    }

    public void setPoll_question(Poll_Question poll_question) {
        this.poll_question = poll_question;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWagered_coins() {
        return wagered_coins;
    }

    public void setWagered_coins(int wagered_coins) {
        this.wagered_coins = wagered_coins;
    }
}
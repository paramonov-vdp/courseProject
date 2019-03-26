package com.vdp.ES;

public class Operations {

        private String  answer;
        private String finalanswer;


    public int getLeftChild( String string){
        String[] arr = string.split(",");
       int a = Integer.parseInt(arr[0]);

        return a;
    }


    public int getRightChild( String string){
        String[] arr = string.split(",");
        int a = Integer.parseInt(arr[1]);

        return a;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getFinalanswer() {
        return finalanswer;
    }

    public void setFinalanswer(String finalanswer) {
        this.finalanswer = finalanswer;
    }
}

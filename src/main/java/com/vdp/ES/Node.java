package com.vdp.ES;

import java.util.HashMap;
import java.util.Map;

public class Node implements  Runnable {
    private int num;
    private String question;
    private int lefNode;
    private int rightNode;
    private String anwser = "Разговорные навыки - 1; Граматические навыки - 0";
    private Map<Integer , String> QuestionMap ;
    private Map<Integer , String>  NodeMap;
    private   Map<Integer, String> finalNodes;
    private Operations operations;

    private int anInt;


    public Node() {
        QuestionMap = new HashMap<>();
        NodeMap = new HashMap<>();
        finalNodes = new HashMap<>();
        operations = new Operations();
    }


    @Override
    public void run() {
        run(0);
    }

    public void run(int i) {
        anInt = 2;
        num = i;
        question = QuestionMap.get(i);
        if (finalNodes.get(i) == null) {
        lefNode = operations.getLeftChild(NodeMap.get(i));
        rightNode = operations.getRightChild(NodeMap.get(i));
           // System.out.println(question);
            if (i == 31) {
                operations.setAnswer(anwser);
            }

            while (anInt==2){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            run(anInt == 1 ? lefNode : rightNode);

    }
        else {
            operations.setFinalanswer(finalNodes.get(i));
            while (true){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
    }


    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLefNode() {
        return lefNode;
    }

    public void setLefNode(int lefNode) {
        this.lefNode = lefNode;
    }

    public int getRightNode() {
        return rightNode;
    }

    public void setRightNode(int rightNode) {
        this.rightNode = rightNode;
    }

    public Map<Integer, String> getQuestionMap() {
        return QuestionMap;
    }

    public void setQuestionMap(Map<Integer, String> questionMap) {
        QuestionMap = questionMap;
    }

    public Map<Integer, String> getNodeMap() {
        return NodeMap;
    }

    public void setNodeMap(Map<Integer, String> nodeMap) {
        NodeMap = nodeMap;
    }

    public void setFinalNodes(Map<Integer, String> finalNodes) {
        this.finalNodes = finalNodes;
    }

    public Operations getOperations() {
        return operations;
    }
}

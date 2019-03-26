package com.vdp.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Six {

   public Double[][] question1 = new Double[5][6];
   public Double[][] question2 = new Double[5][6];
   public   Double[][] qustion3 = new Double[5][6];

  public   Double[][] tmatrix1 = new Double[5][5];
  public   Double[][] tmatrix2 = new Double[5][5];
  public   Double[][] tmatrix3 = new Double[5][5];

   public List<Double[][]> list;
  public   List<Double[][]> list2 =new ArrayList<Double[][]>();

   public Double[][] MatrixSumRez = new Double[5][5];

  public   Double elementsSum = 0.0;

   public Double firstE = 0.0;
   public Double secondE = 0.0;
    public    Double thirdE = 0.0;
   public Double fourthE = 0.0;
 public    Double fifthE = 0.0;
  public   Double []  notfinalCompetiton;

    //LPR VARIABLES --------------------------------------
    double y1 = 0.05;  double y2 = 0.05; double y3 = 0.1; double y4 = 0.2; double y5 = 0.6;

    double q1 = 2; double q2 =3;




   public void init() throws FileNotFoundException {
        list = new ArrayList<Double[][]>();
        int a = 0;
        list.add(question1); list.add(question2); list.add(qustion3);
        for (Double[][] doubles : list) {
                String path = "E:\\Кпи\\5.2\\снитюк\\лр\\1\\"+a+".txt";
                File file = new File(path);
                Scanner scannerfile = new Scanner(file);
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <6 ; j++) {
                        doubles[i][j]= (double)scannerfile.nextInt();
                    }
                }
                a++;
            }
        for (Double[][] doubles : list) {
            findWi(doubles);
        }

    }

    public Six() throws FileNotFoundException {
        init();
    }

  public   static void findWi(Double[][] arr){
        for (int i = 0; i <5 ; i++) {
             arr[i][5]= (0.5*(arr[i][0]+ arr[i][1])+ 0.25*(Math.abs(arr[i][3]- arr[i][2])) );

        }


    }

    public  Double getMin(Double[][] arr){
        Double min = arr[0][5];
        for (int i = 0; i <5 ; i++) {
            if (arr[i][5]<min) min = arr[i][5];
        }
        return min;
    }

    public Double getMax(Double [][] arr){
        Double max = arr[0][5];
        for (int i = 0; i <5 ; i++) {
            if (arr[i][5]>max) max = arr[i][5];
        }
        return max;

    }

   public   void findTMatrix(){
         list2.add(tmatrix1);  list2.add(tmatrix2);  list2.add(tmatrix3);
         int a = 0;
         for (Double[][] doubles : list) {
             Double znamenatel = (getMax(doubles)- getMin(doubles));
             Double[][] arr = list2.get(a);

             arr[1][0] = Math.abs(doubles[0][5] - doubles[1][5])/znamenatel;
             arr[2][0] = Math.abs(doubles[0][5] - doubles[2][5])/znamenatel;
             arr[2][1] = Math.abs(doubles[1][5] - doubles[2][5])/znamenatel;
             arr[3][0] = Math.abs(doubles[0][5] - doubles[3][5])/znamenatel;
             arr[3][1] = Math.abs(doubles[1][5] - doubles[3][5])/znamenatel;
             arr[3][2] = Math.abs(doubles[2][5] - doubles[3][5])/znamenatel;
             arr[4][0] = Math.abs(doubles[0][5] - doubles[4][5])/znamenatel;
             arr[4][1] = Math.abs(doubles[1][5] - doubles[4][5])/znamenatel;
             arr[4][2] = Math.abs(doubles[2][5] - doubles[4][5])/znamenatel;
             arr[4][3] = Math.abs(doubles[3][5] - doubles[4][5])/znamenatel;
             a++;
         }
         
         
    }


   public   void fill(){

         for (Double[][] doubles : list2) {
             for (int i = 0; i <5 ; i++) {
                 for (int j = 0; j < 5; j++) {
                     if (doubles[i][j] == null) doubles[i][j] = 999.0;
                 }
             }
         }

     }


   public    void findFinalCompetention(){
             notfinalCompetiton = new Double[]{firstE, secondE,thirdE,fourthE,fifthE};
          Double [] LPRCompetention = new Double[] {y1, y2 , y3, y4 , y5};
          double znam ;
          double chis ;
          for (int i = 0; i < 5; i++) {
                  chis = 0.0;
                 znam = 0.0;
                  for (int j = 0; j <5 ; j++) {
                  znam+=  ((3*notfinalCompetiton[j] ) + (2*LPRCompetention[j]));
                    }
              chis = ((3*notfinalCompetiton[i] ) + (2*LPRCompetention[i]));
              notfinalCompetiton[i] = chis/znam;



          }

      }


    public void print2(){
        for (Double[][] doubles : list2) {
            for (int i = 0; i <5 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(doubles[i][j]);
                    System.out.print("|");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("-----------------------");
        }

    }


   public void printCompetention(){
        System.out.println(this.firstE);
        System.out.println(secondE);
        System.out.println(thirdE);
        System.out.println(fourthE);
        System.out.println(fifthE);



    }

  public   void prindFinalCompetention(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(notfinalCompetiton[i]);
        }
    }
}

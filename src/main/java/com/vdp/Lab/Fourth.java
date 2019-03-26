package com.vdp.Lab;

public class Fourth {

  public   int[][] mainmatrix = new int[4][5];;
   public Double s1 [][] = new Double[4][4];
   public Double s2 [][] = new Double[4][4];
  public   Double s3 [][] = new Double[4][4];
   public Double s4 [][] = new Double[4][4];
   public Double s5 [][] = new Double[4][4];
   public Double sumRes[][] = new Double[4][4];

    public final Integer FIRST_TYPE_RANGE = 25;
    public final Integer SECOND_TYPE_RANGE = 5;
    public final Integer THIRD_TYPE_RANGE = 3;
    public final Integer FOURTH_TYPE_RANGE = 50;
    public final Integer FIFTH_TYPE_RANGE = 25000;



    public void initMatrix(int[] one, int j){

         for (int i = 0; i <4  ; i++) {
             mainmatrix[i][j] = one[i];

         }

        /*mainmatrix[0][0] = 45;
        mainmatrix[0][1] = 10;
        mainmatrix[0][2] = 5;
        mainmatrix[0][3] = 20;
        mainmatrix[0][4] = 20000;


        mainmatrix[1][0] = 30;
        mainmatrix[1][1] = 6;
        mainmatrix[1][2] = 7;
        mainmatrix[1][3] = 50;
        mainmatrix[1][4] = 15000;

        mainmatrix[2][0] = 30;
        mainmatrix[2][1] = 8;
        mainmatrix[2][2] = 6;
        mainmatrix[2][3] = 70;
        mainmatrix[2][4] = 25000;

        mainmatrix[3][0] = 20;
        mainmatrix[3][1] = 5;
        mainmatrix[3][2] = 8;
        mainmatrix[3][3] = 60;
        mainmatrix[3][4] = 25000;*/
    }

   public void fill(int i, Double t[][], int mainarr[][], Integer range) {
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                t[j][k] = 999.0;
            }
        }

       t[1][0] = Math.abs((double)(mainarr[0][i]- mainarr[1][i])/range);
        t[2][0] = Math.abs((double)(mainarr[0][i]- mainarr[2][i])/range);
        t[2][1] = Math.abs((double)(mainarr[1][i]- mainarr[2][i])/range);
        t[3][0]  =  Math.abs((double)(mainarr[0][i]-mainarr[3][i])/range);
        t[3][1]  =Math.abs((double)(mainarr[1][i]-mainarr[3][i])/range);
        t[3][2]  = Math.abs((double)(mainarr[2][i]-mainarr[3][i])/range);


    }
}

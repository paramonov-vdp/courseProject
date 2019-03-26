package com.vdp.Lab;

public class Second {
   public Double mainarr2[][] = new Double[4][5];

    public Double s1 [][] = new Double[4][4];
    public Double s2 [][] = new Double[4][4];
    public  Double s3 [][] = new Double[4][4];
    public Double s4 [][] = new Double[4][4];
    public  Double s5 [][] = new Double[4][4];

    public void initArray(Double[] one, int j) {
        for (int i = 0; i <4  ; i++) {
                mainarr2[i][j] = one[i];

            }
    }


    public  static void fill(int i, Double t[][], Double mainarr[][]) {
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                t[j][k] = 999.0;
            }
        }

       t[1][0] = Math.abs(mainarr[1][i] - mainarr[0][i]);
        t[2][0] = Math.abs(mainarr[2][i] - mainarr[0][i]);
        t[2][1] = Math.abs(mainarr[2][i] - mainarr[1][i]);
        t[3][0] = Math.abs(mainarr[3][i] - mainarr[0][i]);
        t[3][1] = Math.abs(mainarr[3][i] - mainarr[1][i]);
        t[3][2] = Math.abs(mainarr[3][i] - mainarr[2][i]);


    }

    public static Double getcompetention(Double  t[][], int i ){
        Double sum = 0.0;

        for (int j = 0; j <4 ; j++) {
            for (int k = 0; k <4 ; k++) {
                if (j==i|k==i){
                    sum+= t[j][k];
                }
            }}

        return sum;
    }

}

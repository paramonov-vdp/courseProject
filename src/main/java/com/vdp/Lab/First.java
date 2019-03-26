package com.vdp.Lab;

public class First {

    public int[][] mainarr = new int[4][5];

   public int t1 [][] = new int[4][4];
    public int t2 [][] = new int[4][4];
   public int t3 [][] = new int[4][4];
   public int t4 [][]= new int[4][4];
   public int t5 [][]= new int[4][4];
    public int res [][] = new int[4][4];


   public void initMAtrix(int[] one, int j){
        for (int i = 0; i <4  ; i++) {
           mainarr[i][j] = one[i];

        }
   }



  public   void    fill(int i,int t[][], int mainarr[][]){
        for (int j = 0; j <4 ; j++) {
            for (int k = 0; k <4 ; k++) {
                t[j][k] = 0;
            }
        }

        if (mainarr[0][i] == mainarr[1][i] ){t[1][0] = 1;} else t[1][0] = 0;
        if (mainarr[2][i] == mainarr[0][i]){ t[2][0] = 1;} else t[2][0] = 0;
        if (mainarr[2][i] == mainarr[1][i]){ t[2][1] = 1;} else t[2][1] = 0;
        if (mainarr[3][i] == mainarr[0][i]){ t[3][0] = 1;} else t[3][0] = 0;
        if (mainarr[3][i] == mainarr[1][i]){ t[3][1] = 1;} else t[3][1] = 0;
        if (mainarr[3][i] == mainarr[2][i]){ t[3][2] = 1;} else t[3][2] = 0;

    }

    void print (int t[][]){
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }


     public int add ( int t1[][], int t2[][], int t3[][], int t4[][], int t5[][], int res[][]){
        int rez = 0;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                res[i][j] = t1[i][j]+ t2[i][j]+ t3[i][j]+ t4[i][j]+t5[i][j];
                rez += res[i][j];
            }
        }
         return rez;
    }




    public int getcompetention(int  t[][], int i ){
        int sum = 0;

        for (int j = 0; j <4 ; j++) {
            for (int k = 0; k <4 ; k++) {
                if (j==i|k==i){
                    sum+= t[j][k];
                }
            }}
         return sum;
            }
        }

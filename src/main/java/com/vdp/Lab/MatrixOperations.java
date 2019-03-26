package com.vdp.Lab;

import java.util.ArrayList;
import java.util.List;

public class MatrixOperations {

    public int addIntMAtrix( int t1[][], int t2[][], int t3[][], int t4[][], int t5[][], int res[][]){
        int rez = 0;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                res[i][j] = t1[i][j]+ t2[i][j]+ t3[i][j]+ t4[i][j]+t5[i][j];
                rez += res[i][j];
            }
        }
        return rez;
    }



    public static Double addDoubleMatrix( Double t1[][], Double t2[][], Double t3[][], Double t4[][], Double t5[][], Double res[][]){
        Double rez = 0.0;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                res[i][j] = t1[i][j]+ t2[i][j]+ t3[i][j]+ t4[i][j]+t5[i][j];
                rez += res[i][j];
            }
        }
        return rez;
    }

    public  static  Double addDoubleSevenType(Double t1[][], Double t2[][], Double t3[][], Double t4[][], Double rez[][]){
        Double rezz = 0.0;
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                rez[i][j] = t1[i][j]+ t2[i][j]+ t3[i][j]+ t4[i][j];
                rezz += rez[i][j];
            }
        }
        return rezz;
    }


    public  static  Double addDoubleSixType(Double t1[][], Double t2[][], Double t3[][], Double rez[][]){
        Double rezz = 0.0;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                rez[i][j] = t1[i][j]+ t2[i][j]+ t3[i][j];
                rezz += rez[i][j];
            }
        }
        return rezz;
    }



   static void print (int t[][]){
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }

    }


    static void printDouble(Double t[][]){
        for (int i = 0; i <t.length ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(t[i][j]);
                System.out.print("|");
            }
            System.out.println();

        }
        System.out.println("---------------------------");
    }




    public    static List<Double> findminElement(List <Double[][]> list){
           List<Double> minlist = new ArrayList<Double>();
           for (Double[][] doubles : list) {

               Double min = 99999.0;
               for (int i = 0; i <4 ; i++) {
                   for (int j = 0; j <4 ; j++) {

                       if (doubles[i][j]< min && doubles[i][j]!= 0.0 ){
                           min= doubles[i][j];
                       }
                   }
               }

               minlist.add(min);
           }
           return minlist;
        }


    public  static void  clearMatrix(List<Double[][]> list, int p, int k){

          for (Double[][] aDouble : list) {
              for (int i = 0; i <p ; i++) {
                  for (int j = 0; j <k ; j++) {
                      if (aDouble[i][j]== 999.0){aDouble[i][j]= 0.0;}}}
          }
      }



    public   static void findBackElements(List<Double[][]> list, int p, int k ){
            List<Double> minList= findminElement(list);
            int a = 0;
            for (Double[][] doubles : list) {
                for (int i = 0; i <p ; i++) {
                    for (int j = 0; j <k ; j++) {
                        if (doubles[i][j]==0){
                         doubles[i][j] = 2/minList.get(a);
                        } else if (doubles[i][j]!= 999.0){doubles[i][j] = 1/doubles[i][j];}

                    }
            }a++;
            }clearMatrix(list,p,k);

        }

    public  static void findBackElementsForDouble(List<Double[][]> list, int p, int k ){
        List<Double> minList= findminElement(list);
        int a = 0;
        for (Double[][] doubles : list) {
            for (int i = 0; i <p ; i++) {
                for (int j = 0; j <k ; j++) {
                    if (doubles[i][j]==0.0){
                        doubles[i][j] = 2/minList.get(a);
                    } else if (doubles[i][j]!= 999.0){doubles[i][j] = 1/doubles[i][j];}

                }
            }a++;
        }clearMatrix(list,p,k);

    }


    public  static Double getcompetentionUniversal(Double  t[][], int i , int p , int q){
        Double sum = 0.0;

        for (int j = 0; j <p ; j++) {
            for (int k = 0; k <q ; k++) {
                if (j==i|k==i){
                    sum+= t[j][k];
                }
            }}

        return sum;
    }


}

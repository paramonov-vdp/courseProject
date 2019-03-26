package com.vdp.Lab;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // ---------------------FIRST TYPE-------------------
        First firstQuestionType = new First();
       // firstQuestionType.initMAtrix();
        firstQuestionType.fill(0,firstQuestionType.t1,firstQuestionType.mainarr);
        firstQuestionType.fill(1,firstQuestionType.t2,firstQuestionType.mainarr);
        firstQuestionType.fill(2,firstQuestionType.t3,firstQuestionType.mainarr);
        firstQuestionType.fill(3,firstQuestionType.t4,firstQuestionType.mainarr);
        firstQuestionType.fill(4, firstQuestionType.t5, firstQuestionType.mainarr);

         int a =   firstQuestionType.add(firstQuestionType.t1,firstQuestionType.t2,firstQuestionType.t3,firstQuestionType.t4,firstQuestionType.t5, firstQuestionType.res);
        a*=2;

         int e1 =  firstQuestionType.getcompetention(firstQuestionType.res,0);
        int e2 =  firstQuestionType.getcompetention(firstQuestionType.res,1);
        int e3 = firstQuestionType.getcompetention(firstQuestionType.res,2);
        int e4 = firstQuestionType.getcompetention(firstQuestionType.res,3);

        System.out.println("competition of experts, first stage:" );
        System.out.println("First:" + e1+"/"+ a);
        System.out.println("Second:" + e2+"/"+ a);
        System.out.println("Third:" + e3+"/"+ a);
        System.out.println("Fifth:" + e4+"/"+ a);
        System.out.println();



//---------------------------------Second method ------------------------------------------

        Second second = new Second();
        List<Double[][]> list = new ArrayList<Double[][]>();
        //.initArray();

        second.fill(0,second.s1, second.mainarr2);
        second.fill(1,second.s2, second.mainarr2);
        second.fill(2,second.s3, second.mainarr2);
        second.fill(3,second.s4, second.mainarr2);
        second.fill(4,second.s5, second.mainarr2);

        list.add(second.s1); list.add(second.s2); list.add(second.s3); list.add(second.s4); list.add(second.s5);
        System.out.println();
            MatrixOperations.findBackElementsForDouble(list, 4, 4);



        Double sumRes[][] = new Double[4][4];

      Double sum =   MatrixOperations.addDoubleMatrix(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4),sumRes);
        sum*= 2;


        Double e12 = Second.getcompetention(sumRes,0);
        Double e22 = Second.getcompetention(sumRes,1);
        Double e32 = Second.getcompetention(sumRes,2);
        Double e42 = Second.getcompetention(sumRes,3);

        System.out.println();
        System.out.println("competition of experts, second stage:" );
        System.out.println("First:" + e12/ sum);
        System.out.println("Second:" + e22/ sum);
        System.out.println("Third:" + e32/ sum);
        System.out.println("Fifth:" + e42/ sum);
        System.out.println();

 //-----------------------end ------------------------------------

        //-----------------fourth method ---------------------


     Fourth fourth = new Fourth();
        //fourth.initMatrix();
        fourth.fill(0, fourth.s1,fourth.mainmatrix, fourth.FIRST_TYPE_RANGE);
        fourth.fill(1, fourth.s2, fourth.mainmatrix, fourth.SECOND_TYPE_RANGE);
        fourth.fill(2, fourth.s3, fourth.mainmatrix, fourth.THIRD_TYPE_RANGE);
        fourth.fill(3, fourth.s4, fourth.mainmatrix, fourth.FOURTH_TYPE_RANGE);
        fourth.fill(4, fourth.s5, fourth.mainmatrix, fourth.FIFTH_TYPE_RANGE);
       List<Double[][]> list1 = new ArrayList<Double[][]>();
        list1.add(fourth.s1); list1.add(fourth.s2); list1.add(fourth.s3); list1.add(fourth.s4); list1.add(fourth.s5);
        MatrixOperations.findBackElementsForDouble(list1, 4 ,4);

       double sum4 =   MatrixOperations.addDoubleMatrix(fourth.s1, fourth.s2, fourth.s3, fourth.s4, fourth.s5, fourth.sumRes);
          sum4*=2;
        Double e14 = Second.getcompetention(fourth.sumRes,0);
        Double e24 = Second.getcompetention(fourth.sumRes,1);
        Double e34 = Second.getcompetention(fourth.sumRes,2);
        Double e44 = Second.getcompetention(fourth.sumRes,3);


        System.out.println();
        System.out.println("competition of experts, fourth stage:" );
        System.out.println("First:" + e14/sum4);
        System.out.println("Second:" + e24/ sum4);
        System.out.println("Third:" + e34/ sum4);
        System.out.println("Fifth:" + e44/ sum4);
        System.out.println();

// seven method -------------------------------------------------------------------------------------------------

       Seven sevenMethod = new Seven();
        List<Double[][]> sevenList = new ArrayList<Double[][]>();
        Second.fill(0,sevenMethod.s1, sevenMethod.mainArray);
        Second.fill(1,sevenMethod.s2, sevenMethod.mainArray);
        Second.fill(2,sevenMethod.s3, sevenMethod.mainArray);
        Second.fill(3,sevenMethod.s4, sevenMethod.mainArray);

        sevenList.add(sevenMethod.s1);  sevenList.add(sevenMethod.s2);  sevenList.add(sevenMethod.s3);  sevenList.add(sevenMethod.s4);
        MatrixOperations.findBackElements(sevenList,4,4);


       double sum7=  MatrixOperations.addDoubleSevenType(sevenList.get(0),sevenList.get(1), sevenList.get(2), sevenList.get(3), sevenMethod.sumRes);
        sum7 *=2;

        double e17 = Second.getcompetention(sevenMethod.sumRes,0);
        double e27 = Second.getcompetention(sevenMethod.sumRes,1);
        double e37 = Second.getcompetention(sevenMethod.sumRes,2);
        double e47 = Second.getcompetention(sevenMethod.sumRes,3);

        System.out.println();
        System.out.println("competition of experts, seven stage:" );
        System.out.println("First:" + e17/sum7);
        System.out.println("Second:" + e27/ sum7);
        System.out.println("Third:" + e37/sum7);
        System.out.println("Fifth:" + e47/sum7);
        System.out.println();



  //---------------------six -------------------------------------------------------------------------------

            Six six = new Six();
             six.findTMatrix();
             six.fill();
             MatrixOperations.findBackElementsForDouble(six.list2,5,5);
                six.elementsSum =   (MatrixOperations.addDoubleSixType(six.tmatrix1, six.tmatrix2, six.tmatrix3, six.MatrixSumRez))*2;

        six.firstE = (MatrixOperations.getcompetentionUniversal(six.MatrixSumRez,0, 5, 5)/six.elementsSum);
        six.secondE = (MatrixOperations.getcompetentionUniversal(six.MatrixSumRez,1, 5, 5)/six.elementsSum);
        six.thirdE = (MatrixOperations.getcompetentionUniversal(six.MatrixSumRez,2, 5, 5)/six.elementsSum);
        six.fourthE = (MatrixOperations.getcompetentionUniversal(six.MatrixSumRez,3, 5, 5)/six.elementsSum);
        six.fifthE = (MatrixOperations.getcompetentionUniversal(six.MatrixSumRez,4, 5, 5)/six.elementsSum);


        six.findFinalCompetention();
        System.out.println();
        six.prindFinalCompetention();



    }

}

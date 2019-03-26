package com.vdp.web.controller;


import com.vdp.ES.MainOP;
import com.vdp.ES.Node;
import com.vdp.Lab.*;
import com.vdp.users.model.Category;
import com.vdp.users.model.Products;
import com.vdp.users.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    MyService myService;


    Node node ;


    // -------------------ADMIN PART  ---------------------------------------
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("categories", myService.listGroups());
        model.addObject("products", myService.displayProducts());
        List<Products> productsList = myService.displayProducts();
        model.setViewName("admin1");
        return model;
    }

    @RequestMapping(value = "/pruductpp")
    public ModelAndView productPP(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("categories", myService.listGroups());
        modelAndView.setViewName("addproduct");
        return modelAndView;
    }

    @RequestMapping(value = "/showall")
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", myService.allUsers());
        modelAndView.addObject("categories", myService.listGroups());
        modelAndView.setViewName("adminmy2");
        return modelAndView;
    }

    @RequestMapping(value = "/showorders")
    public ModelAndView showOrders(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orderlist", myService.viewAllOrders());
        modelAndView.addObject("categories", myService.listGroups());
        modelAndView.setViewName("adminmy2");
        return modelAndView;
    }

    @RequestMapping(value = "/grouppp")
    public ModelAndView groupPp(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("categories", myService.listGroups());
        modelAndView.setViewName("addgroup");
        return modelAndView;
    }


    @RequestMapping(value = "/delproduct")
    public ModelAndView delproduct(@RequestParam(value = "Delete[]") long [] Delete)
    {
        ModelAndView modelAndView = new ModelAndView();
        int i = Delete.length;
        Delete = Arrays.copyOf(Delete, i-2);
        if (Delete != null) {


            myService.deleteManyProducts(Delete);
            modelAndView.addObject("products", myService.displayProducts());
            modelAndView.setViewName("logout");
        }else modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public String addproduct(@RequestParam (value = "category") long categoryID,
                             @RequestParam String description,
                             @RequestParam String price,
                             @RequestParam(value="photo") MultipartFile photo,
                             Model model
    ) throws IOException {


        Category category = myService.find(categoryID);
        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(category);

        Products product = new Products(description, price, photo.getBytes(), categoryList);
        myService.addProduct(product);
        return "redirect:/admin";
    }

    @RequestMapping(value = "/addgroup" , method = RequestMethod.POST)
    public ModelAndView addgroup (@RequestParam (value = "category_name" ) String category_name
    ){
        ModelAndView model = new ModelAndView();
        Category category = new Category(category_name);
        myService.addCategory(category);
        model.addObject("products", myService.displayProducts());
        model.setViewName("adminmy");
        return model;
    }


    //-----------------LAB ----------------------------------------------------------------------
    @RequestMapping(value = "/quiz")
    public ModelAndView showquiz()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("first");
        return  modelAndView;
    }


    @RequestMapping(value = "/post")
    public ModelAndView postone (@RequestParam(value = "one") int[] firstQ,
                                 @RequestParam(value = "two") int[] SecondQ,
                                 @RequestParam(value = "three") int[] ThirdQ,
                                 @RequestParam(value = "four") int[] fourthQ,
                                 @RequestParam(value = "five") int[] fifthQ

    )
    {
        ModelAndView modelAndView = new ModelAndView();
        First firstQuestionType = new First();
        firstQuestionType.initMAtrix(firstQ,0);
        firstQuestionType.initMAtrix(SecondQ,1);
        firstQuestionType.initMAtrix(ThirdQ,2);
        firstQuestionType.initMAtrix(fourthQ,3);
        firstQuestionType.initMAtrix(fifthQ, 4);



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
        double rez1 = (double) e1/(double) a;   double rez3 = (double) e3/(double) a;
        double rez2 = (double) e2/(double) a;     double rez4 = (double) e4/(double) a;

        List<Double> results = new ArrayList<Double>();

        results.add(rez1);
        results.add(rez2);
        results.add(rez3);
        results.add(rez4);
             modelAndView.setViewName("firstResult");
        modelAndView.addObject("result" , results);
        return  modelAndView;
    }

    @RequestMapping(value = "/second")
    public ModelAndView showsec()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("second");
        return  modelAndView;
    }

    @RequestMapping(value = "/postSecond")
    public ModelAndView showquiztwo (@RequestParam(value = "first") Double[] Qone,
                                  @RequestParam(value = "second") Double[] Qtwo,
                                  @RequestParam(value = "third") Double[] Qthree,
                                  @RequestParam(value = "fourr") Double[] Qfourth,
                                  @RequestParam(value = "five") Double[] Qfive

    ){
        ModelAndView modelAndView = new ModelAndView();

        Second second = new Second();
        List<Double[][]> list = new ArrayList<Double[][]>();
        second.initArray(Qone,0);
        second.initArray(Qtwo,1);
        second.initArray(Qthree,2);
        second.initArray(Qfourth,3);
        second.initArray(Qfive,4);

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

        List<Double> rezList = new ArrayList<Double>();
        rezList.add(e12/sum); rezList.add(e22/sum); rezList.add(e32/sum); rezList.add(e42/sum);
        modelAndView.setViewName("secondResults");
             modelAndView.addObject("list", rezList);
        return modelAndView;
    }

    @RequestMapping(value = "/four")
    public ModelAndView showfour()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("four");
        return  modelAndView;
    }


    @RequestMapping(value = "/postfour")
    public ModelAndView showquizfour (@RequestParam(value = "onef") int[] Qone,
                                     @RequestParam(value = "twof") int[] Qtwo,
                                     @RequestParam(value = "threef") int[] Qthree,
                                     @RequestParam(value = "fourf") int [] Qfourth,
                                     @RequestParam(value = "fivef") int [] Qfive

    ){
        ModelAndView modelAndView = new ModelAndView();
        Fourth fourth = new Fourth();
        fourth.initMatrix(Qone, 0);   fourth.initMatrix(Qtwo, 1);
        fourth.initMatrix(Qthree, 2);  fourth.initMatrix(Qfourth, 3);
        fourth.initMatrix(Qfive,4);
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
        List<Double> results = new ArrayList<Double>();
        results.add(e14/sum4); results.add(e24/sum4); results.add(e34/sum4);
        results.add(e44/sum4);
        modelAndView.setViewName("fourresult");
        modelAndView.addObject("result" ,results);

        return modelAndView;
    }


    @RequestMapping(value = "/seven")
    public ModelAndView showseven()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("seven");
        return  modelAndView;
    }



    @RequestMapping(value = "/postseven")
    public ModelAndView postseven (@RequestParam(value = "first") Double[] Qone,
                                      @RequestParam(value = "second") Double[] Qtwo,
                                      @RequestParam(value = "third") Double[] Qthree,
                                      @RequestParam(value = "fourr") Double [] Qfourth


    ){
        ModelAndView modelAndView = new ModelAndView();
        Seven sevenMethod = new Seven();
        sevenMethod.initArray(Qone, 0);
        sevenMethod.initArray(Qtwo,1);
        sevenMethod.initArray(Qthree,2);
        sevenMethod.initArray(Qfourth,3);

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

       ArrayList<Double> result = new ArrayList<Double>();
        result.add(e17/sum7); result.add(e27/sum7);result.add(e37/sum7);
        result.add(e47/sum7);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("sevenresult");
        return modelAndView;

    }

    @RequestMapping(value = "/six")
    public ModelAndView showsix()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("six");
        return  modelAndView;
    }

    @RequestMapping(value = "/postsix")
    public ModelAndView postsix () throws FileNotFoundException {

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

        List <Double> results = new ArrayList<Double>();
       results.add(six.notfinalCompetiton[0]);
        results.add(six.notfinalCompetiton[1]);
        results.add(six.notfinalCompetiton[2]);
        results.add(six.notfinalCompetiton[3]);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sixresult");
        modelAndView.addObject("result", results);
        return modelAndView;

    }

    @RequestMapping(value = "/mainpage")
    public ModelAndView showmain()
    {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mainpage");
        return  modelAndView;


    }


    @RequestMapping(value = "/maines")
    public ModelAndView showmes() throws IOException, InterruptedException {
        MainOP mainOP = new MainOP();
        mainOP.main();
          node = new Node();
        node.setFinalNodes(mainOP.finalNodes);
        node.setNodeMap(mainOP.NodeMap);
        node.setQuestionMap(mainOP.QuestionMap);

        Thread thread = new Thread(node);
        thread.start();
          Thread.sleep(700);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("node", node.getQuestion());
        modelAndView.setViewName("es");
        return  modelAndView;


    }




    @RequestMapping(value = "/postes")
    public ModelAndView es(@RequestParam(value = "oneee" ) int i ) throws InterruptedException {

        node.setAnInt(i);
        Thread.sleep(700);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("node",node.getQuestion());
        modelAndView.addObject("op", node.getOperations());
        modelAndView.setViewName("es");
        return  modelAndView;


    }







}

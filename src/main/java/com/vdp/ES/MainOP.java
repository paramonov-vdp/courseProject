package com.vdp.ES;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainOP {


public     Map<Integer , String> QuestionMap = new HashMap<Integer, String>();
   public  Map<Integer , String>  NodeMap = new HashMap<Integer, String>();

   public Map<Integer, String> finalNodes = new HashMap<>();


   public Node node = new Node();

    public void parseFile(Map<Integer, String> questionMap, String file){
        String[] array = file.split("");
        String begin = ","; String end = ";"; String split = "!";
        String text = "";  String fordigit = "";

        for (int i = 0; i < array.length ; i++) {
           if (array[i].equals(begin)){
               if (!array[i-2].equals(split)) {
                   fordigit += array[i - 2];
                   fordigit += array[i - 1];

               }else fordigit += array[i-1];
               i++;
               while (!array[i].equals(end)){
                   text+=array[i];
                  i++;
               }
               questionMap.put(Integer.parseInt(fordigit), text);
               text = "";

               fordigit = "";
           }
        }

    }

    public   void parseNodes(Map<Integer, String> map ) throws IOException {
        final String PATH  = "E:\\Кпи\\5.2\\экспертные системы\\2\\nodes.txt";
        BufferedReader reader = new BufferedReader(new FileReader(PATH));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        parseEngine(lines,map);

    }

     public   void parseEngine(List<String> list, Map<Integer, String> map){
         String split = "!";
         for (int i = 0; i <list.size() ; i++) {
             String [] array = list.get(i).split("");
             String digit = "";
             if (array[1].equals(split)){
                 digit= array[0];
             }else digit = array[0] +array[1];
             map.put(Integer.parseInt(digit), list.get(i).substring(3,array.length));

         }



     }


    public  void main() throws IOException {
        finalNodes.put(12, "Професиональные письменные навыки, 5000 грн/месяц");
        finalNodes.put(13, "Технический английский, 4500грн/месяц; Юредический английский, 4500грн/месяц");
        finalNodes.put(33, "1100 грн месяц/украинский преподователь");
        finalNodes.put(20, "С носителем языка 2200грн/месяц; 2р/нед - 2000грн/месяц; 2р/нед - 1800 грн/месяц");
        finalNodes.put(25, "2р/нед - 800грн/мес; 10р/мес - 1100/мес; 3р/нед - 1200грн");
        finalNodes.put(32, "2р/нед, с носителем - 1200грн/мес; 3р/нед. - 1500грн/мес");
        finalNodes.put(18, "Письменные навыки - 2500грн/месяц; Разговорные 3000грн/месяц");
        finalNodes.put(777, "До свидания!");
        finalNodes.put(9, "Профессиональный уровень, 4500");
        final String PATH = "E:\\Кпи\\5.2\\экспертные системы\\2\\tree.txt";
        File file1 = new File(PATH);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file1), "UTF8"));
                String  file = "";
        String s = "";
        while ((s = in.readLine())!= null){
                 file+=s;

        }

                    parseFile(QuestionMap,file);
                    parseNodes(NodeMap);


        finalNodes.put(12, "Професиональные письменные навыки, 5000 грн/месяц");
        finalNodes.put(13, "Технический английский, 4500грн/месяц; Юредический английский, 4500грн/месяц");
        finalNodes.put(33, "1100 грн месяц/украинский преподователь");
        finalNodes.put(20, "С носителем языка 2200грн/месяц; 2р/нед - 2000грн/месяц; 2р/нед - 1800 грн/месяц");
        finalNodes.put(25, "2р/нед - 800грн/мес; 10р/мес - 1100/мес; 3р/нед - 1200грн");
        finalNodes.put(32, "2р/нед, с носителем - 1200грн/мес; 3р/нед. - 1500грн/мес");
        finalNodes.put(18, "Письменные навыки - 2500грн/месяц; Разговорные 3000грн/месяц");
        finalNodes.put(777, "До свидания!");
        finalNodes.put(9, "Профессиональный уровень, 4500");




    }

}

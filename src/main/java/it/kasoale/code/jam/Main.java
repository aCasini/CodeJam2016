package it.kasoale.code.jam;

import it.kasoale.code.jam.algorithms.CountingSheep;
import it.kasoale.code.jam.algorithms.RevengePancakes;
import it.kasoale.code.jam.algorithms.TidyNumbers;
import it.kasoale.code.jam.utils.GenerateOutFile;
import it.kasoale.code.jam.utils.InputReader;

import java.util.ArrayList;


/**
 * Created by kasoale on 15/03/2017.
 */
public class Main {


    public static void main(String[] args){



        //InputReader inputReader = new InputReader("src/resources/in/A-large-practice.in");
        //InputReader inputReader = new InputReader("src/resources/in/B-small-practice.in");
        InputReader inputReader = new InputReader("src/resources/in/B-small-attempt0.in");
        inputReader.loadInputFile();

        System.out.println("NUM CASE: "+inputReader.getNumTestCase());

        //Counting Sheep

        CountingSheep countingSheep = new CountingSheep();
        RevengePancakes revengePancakes = new RevengePancakes();

        //2017
        TidyNumbers tidyNumbers = new TidyNumbers();

        ArrayList<String> outputArray = new ArrayList<String>();

        //for (String sheepNum : inputReader.getInputArray()) {
            //outputArray.add(countingSheep.fallAsleep(Integer.valueOf(sheepNum)));

        //}

       // for (String pancakes : inputReader.getInputArray()) {
        //    outputArray.add(revengePancakes.run(pancakes));
        //}

        //2017
        for (String tidyNumber : inputReader.getInputArray()) {
            outputArray.add(tidyNumbers.run(tidyNumber));
        }


        //RevengePancakes revengePancakes = new RevengePancakes();
//        System.out.println("#FLIP COUNT: >> " +revengePancakes.run("--+-"));

        GenerateOutFile generateOutFile = new GenerateOutFile();
        //generateOutFile.generate(outputArray, "A-small-practice.out");
        //generateOutFile.generate(outputArray, "A-large-practice.out");
        //generateOutFile.generate(outputArray, "B-small-practice.out");
        generateOutFile.generate(outputArray, "B-small-practice.out");

        //System.out.println("Size loadArray: " + inputReader.getInputArray().size());

    }

}


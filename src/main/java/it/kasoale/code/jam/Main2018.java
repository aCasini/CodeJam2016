package it.kasoale.code.jam;

import it.kasoale.code.jam.algorithms._2018.SavingUniverse;
import it.kasoale.code.jam.utils.GenerateOutFile;
import it.kasoale.code.jam.utils.InputReader;

import java.util.ArrayList;

/**
 * Created by kasoale on 08/04/2018.
 */
public class Main2018 {

    public static void main(String[] args){
        InputReader inputReader = new InputReader("src/resources/in/2018-save-universe-sample.in");
        inputReader.loadInputFile();

        System.out.println("NUM CASE: "+inputReader.getNumTestCase());

        SavingUniverse savingUniverse = new SavingUniverse();
        ArrayList<String> outputArray = new ArrayList<String>();

        ArrayList<String> inputList = inputReader.getInputArray();
        for (String command : inputList) {
            outputArray.add(savingUniverse.run(command));
            System.out.println(savingUniverse.run(command));
        }

        System.out.println(">>> "+outputArray.size());

        GenerateOutFile generateOutFile = new GenerateOutFile();
        generateOutFile.generate(outputArray, "2018-save-universe.sample.out");

    }
}

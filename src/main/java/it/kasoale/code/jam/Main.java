package it.kasoale.code.jam;

import it.kasoale.code.jam.utils.InputReader;

/**
 * Created by kasoale on 15/03/2017.
 */
public class Main {


    public static void main(String[] args){

        InputReader inputReader = new InputReader("/Users/kasoale/Development/Google_Code_JAM/2016/A-small-practice.in.txt");
        inputReader.loadInputFile();

        System.out.println("Size loadArray: " + inputReader.getInputArray().size());

    }
}

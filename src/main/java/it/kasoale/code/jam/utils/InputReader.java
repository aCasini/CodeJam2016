package it.kasoale.code.jam.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by kasoale on 15/03/2017.
 */
public class InputReader {

    private String fileName;
    private ArrayList<String> inputArray;

    public InputReader(String fileName){
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setInputArray(ArrayList<String> inputArray) {
        this.inputArray = inputArray;
    }

    public ArrayList<String> getInputArray() {
        return inputArray;
    }

    public void loadInputFile(){
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        inputArray = new ArrayList<String>();

        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String currentLine ;

            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
                inputArray.add(currentLine);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {

                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }
}

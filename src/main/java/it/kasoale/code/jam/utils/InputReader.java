package it.kasoale.code.jam.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;

/**
 * Created by kasoale on 15/03/2017.
 */
public class InputReader {

    private String fileName;
    private Integer numTestCase;
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

    public Integer getNumTestCase() {
        return numTestCase;
    }

    public void setNumTestCase(Integer numTestCase) {
        this.numTestCase = numTestCase;
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

            boolean isFirst = true;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
                if(isFirst){
                    setNumTestCase(Integer.parseInt(currentLine));
                    isFirst = false;
                }else{
                    inputArray.add(currentLine);
                }

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

    public String getResourcePath(){
        return getClass().getResource("src/resources/in/A-small-practice.in").toString();
    }
}

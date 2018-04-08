package it.kasoale.code.jam.algorithms;

import java.util.ArrayList;

/**
 * Created by kasoale on 08/04/2017.
 */
public class OversizedPancakeFlipper implements IAlgorithm{

    public static void main(String[] args){
        OversizedPancakeFlipper a = new OversizedPancakeFlipper();
        System.out.println(a.run(""));
    }

    @Override
    public String run(String inputValue) {
        inputValue = "---+-++- 3";
        String pancake = inputValue.split(" ")[0];
        Integer k = Integer.parseInt(inputValue.split(" ")[1]);

        char[] pancakesArray = pancake.toCharArray();

        if(!pancake.contains("--") || !pancake.contains("++")){
            return "IMPOSSIBLE";
        }else if(isAllFaceHappy(pancakesArray)){
                return "0";
        }


        int flipcount = 0;
        for(int i=0; i<k; i++){
            String face = String.valueOf(pancakesArray[i]);
            if(face.equals("-")){
                pancakesArray[i] = '+';
            }else{
                pancakesArray[i] = '-';
            }

            System.out.println(pancakesArray[i]);
        }
        flipcount = 1;

        if(isAllFaceHappy(pancakesArray)){
            return "1";
        }



        return"";

    }

    public boolean isAllFaceHappy(char[] pancakesArray){
        boolean isHappy = true;
        for(int i=0; i<pancakesArray.length; i++){
            if(String.valueOf(pancakesArray[i]).equals("-")){
                isHappy = false;
                break;
            }
        }

        return isHappy;
    }

    public int pancakesCount(String inputString, String faceToFind){
        String str = inputString;
        String findStr = faceToFind;
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        //System.out.println(count);

        return count;
    }
}

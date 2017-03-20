package it.kasoale.code.jam.algorithms;

/**
 * Created by local_admin on 16/03/2017.
 */
public class RevengePancakes implements IAlgorithm {

    @Override
    public String run(String inputValue) {

        int flipCount = 1 + pancakesCount(inputValue, "-+") + pancakesCount(inputValue, "+-");
        if (inputValue.endsWith("+")){
            flipCount = flipCount -1;
        }

        return String.valueOf(flipCount);
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

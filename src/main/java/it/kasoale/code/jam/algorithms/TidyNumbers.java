package it.kasoale.code.jam.algorithms;

import java.math.BigInteger;

/**
 * Created by kasoale on 08/04/2017.
 */
public class TidyNumbers implements IAlgorithm{


    @Override
    public String run(String inputValue) {
        int size = inputValue.length();
        if(inputValue.endsWith("0") && size > 1){
            inputValue = inputValue.replaceAll("[0-9]", "9");
            //System.out.println(inputValue);
        }

        BigInteger tidyNumber = new BigInteger(inputValue);

        boolean isTidy = false;
        int[] num = new int[inputValue.length()];

        do{
            if(inputValue.length() == 1){
                tidyNumber = new BigInteger(inputValue);
                isTidy = true;
            }else{

                num = new int[String.valueOf(tidyNumber).length()];

                for (int i = 0; i < String.valueOf(tidyNumber).length(); i++){
                    num[i] = String.valueOf(tidyNumber).charAt(i) - '0';
                }

                if(num.length == 1){
                    break;
                }

                isTidy = isSorted(num);

                if(!isTidy) {
                    tidyNumber = tidyNumber.subtract(BigInteger.ONE);
                }
            }

        }while(isTidy == false);

        return String.valueOf(tidyNumber);
    }

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }

        return true; // If this part has been reached, the array must be sorted.
    }

    public static void main(String[] args){
        TidyNumbers tidyNumbers = new TidyNumbers();
        System.out.println(tidyNumbers.run("132"));
        System.out.println(tidyNumbers.run("7"));
        System.out.println(tidyNumbers.run("1111111110"));
    }
}

package it.kasoale.code.jam.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kasoale on 15/03/2017.
 */
public class CountingSheep {

    private int T;      //number of iteration
    private int N;      //Start number

    private static final String INSOMNIA = "INSOMNIA";

    private BigInteger bleatrixNumber;

    private ArrayList<String> digits = new ArrayList<String>();
    private int sizeDigit = 10;

    public CountingSheep(){
        initDigits();
    }

    public void initDigits(){
        digits.add("0");
        digits.add("1");
        digits.add("2");
        digits.add("3");
        digits.add("4");
        digits.add("5");
        digits.add("6");
        digits.add("7");
        digits.add("8");
        digits.add("9");
    }

    /**
     * This is the Fall Asleep algotithm
     * @return the last Blatrix Number od INSOMNIA if the number dot exists
     */
    public String fallAsleep(Integer value){

        int iteration = 2;

        Map<Integer, Integer> mapDigit = new HashMap<>();
        BigInteger initValie = BigInteger.valueOf(value);
        BigInteger startNum = BigInteger.valueOf(value);
        do {
            String stringNum = String.valueOf(startNum);

            for (int i = 0; i < digits.size(); i++) {
                if (stringNum.contains(digits.get(i))
                        && !mapDigit.containsKey(Integer.valueOf(digits.get(i)))) {
                    mapDigit.put(Integer.valueOf(digits.get(i)), i);
                    bleatrixNumber = startNum;
                }
            }
            startNum = initValie.multiply(BigInteger.valueOf(iteration));
            iteration++;

            if(mapDigit.size() == 10){
                break;
            }

        }while(iteration < 100) ;

        sizeDigit = 10;

        if (mapDigit.size() == 10) {
            return String.valueOf(bleatrixNumber);
        }
        else {
            return INSOMNIA;
        }
    }

}

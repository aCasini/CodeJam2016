package it.kasoale.code.jam.algorithms._2018;

import it.kasoale.code.jam.algorithms.IAlgorithm;
import it.kasoale.code.jam.utils.InputReader;

import java.util.ArrayList;

/**
 * Created by kasoale on 08/04/2018.
 */
public class SavingUniverse implements IAlgorithm{

    public static void main(String[] args){

        InputReader inputReader = new InputReader("src/resources/in/2018-save-universe-sample.in");
        inputReader.loadInputFile();

        System.out.println("NUM CASE: "+inputReader.getNumTestCase());

        ArrayList<String> inputList = inputReader.getInputArray();
        for (String command : inputList) {
            System.out.println(hackRoboot(command));
            /**
            Integer shieldSupportDamage = Integer.parseInt(command.split(" ")[0]);
            String commandRoboot = command.split(" ")[1];

            Integer numSwap = 0;

            if(!commandRoboot.contains("C")){
                System.out.println(">>> "+command + " ---> IMPOSSIBLE");
            }else if (!commandRoboot.contains("S")){
                System.out.println(">>> "+command + " ---> "+numSwap);
            }else{
                Integer totalDamage = damageCommand(commandRoboot.split(""));

                if(shieldSupportDamage < totalDamage){


                    System.out.println("PRE >>> "+command + " ---> "+numSwap);
                    String[] newCommand = swapElement(commandRoboot.split(""));
                    totalDamage = damageCommand(newCommand);
                    numSwap++;

                    while(shieldSupportDamage < totalDamage){
                        newCommand = swapElement(newCommand);
                        totalDamage = damageCommand(newCommand);
                        numSwap++;
                    }
                    //TODO: calcolo del numero di SWAP


                    System.out.println("POST >>> "+command + " ---> "+ numSwap);


                }else{
                    System.out.println(">>> "+command + " ---> "+numSwap);
                }
            }

            **/


        }

    }

    public static String hackRoboot(String command){
        Integer shieldSupportDamage = Integer.parseInt(command.split(" ")[0]);
        String commandRoboot = command.split(" ")[1];

        Integer numSwap = 0;

        if(!commandRoboot.contains("C")){
            return "IMPOSSIBLE";
        }else if (!commandRoboot.contains("S")){
            return  numSwap.toString();
        }else{
            Integer totalDamage = damageCommand(commandRoboot.split(""));

            if(shieldSupportDamage < totalDamage){

                String[] newCommand = swapElement(commandRoboot.split(""));
                totalDamage = damageCommand(newCommand);
                numSwap++;

                while(shieldSupportDamage < totalDamage){
                    newCommand = swapElement(newCommand);
                    totalDamage = damageCommand(newCommand);
                    numSwap++;
                }


                return numSwap.toString();


            }else{
                return numSwap.toString();
            }
        }
    }

    public static Integer damageCommand(String[] command){
        String[] commandArray = command;
        Integer shoot = 1;
        Integer changeNum = 1;
        Integer damage = 0;

        for (String in : commandArray) {
            if(in.equalsIgnoreCase("S")){
                damage += (shoot * changeNum);
            }else if(in.equalsIgnoreCase("C")){
                changeNum = changeNum * 2;
            }
        }

        return  damage;
    }

    public static String[] swapElement(String[] command){

        //TODO: implement me

        int index = 0;
        for (String element : command) {

            if(element.equalsIgnoreCase("C") && command[index+1].equalsIgnoreCase("S")){
                command[index] = "S";
                command[index+1] = "C";
                break;
            }else{
                index ++;
            }
        }

        return command;
    }

    @Override
    public String run(String inputValue) {
        return hackRoboot(inputValue);
    }
}

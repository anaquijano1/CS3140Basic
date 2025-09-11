package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

//https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String fileName = null;
        int numberR=435;
        boolean methodHamilton=false;

        int numberOfArguments= args.length;
        System.out.println("Number of arguments: " + numberOfArguments);
        switch (numberOfArguments) {
            case 1:
                fileName=args[0];
                break;
            case 2:
                fileName = args[0];
                if (args[1].charAt(2)=='h'){
                    methodHamilton=true;
                }else{
                    numberR=Integer.parseInt(args[1]);
                }
                break;
            case 3:
                fileName = args[0];
                numberR=Integer.parseInt(args[1]);
                if (args[2].charAt(2)=='h'){
                    methodHamilton=true;
                }

        }
        System.out.println("Number of arguments: "+numberOfArguments);
        System.out.println("Method: "+methodHamilton);
        System.out.println("Number of rep: "+numberR);
        System.out.println("File name: "+fileName);



         ArrayList<String> states=new ArrayList<>();
         ArrayList<Integer> population=new ArrayList<>();

        states.add("BC");
        population.add(20);
        states.add("AB");
        population.add(20);
        states.add("AC");
        population.add(20);
        states.add("AD");
        population.add(20);
        states.add("BE");
        population.add(20);
        states.add("CA");
        population.add(20);
        states.add("CD");
        population.add(20);

        System.out.println("Population: "+population);
        System.out.println("States: "+states);
        String [][] both= new String[states.size()][2];



        for (int i=0;i<states.size();i++){
                both[i][0]=states.get(i);
                //https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
                both[i][1]=Integer.toString(population.get(i));
        }

        //SORT HERE


        //https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
        System.out.println(Arrays.deepToString(both));








            for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Car car1= new Car(4,"pink");
        Car car2= new Car(4,"green");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println("HELLO");
        System.out.println("This is attempt");
        System.out.println("commit");


    }


}
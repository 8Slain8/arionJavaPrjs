package telran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println(changeString("Found"));

        System.out.println("Please enter a word");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(startWithNot(userInput) ? removeNot(userInput) : addNot(userInput));
    }
    public static String changeString (String str){
        String newStr;
        if(str.startsWith("not")){
            newStr = str.substring(3) + "not";
        }else{
            newStr = "not" + str;
        }
        return newStr;
    }
    public static boolean startWithNot(String input){
        return input.startsWith("not");
    }
    public  static  String addNot(String input){
        return "not" + input;
    }
    public static String removeNot(String input){
        return input.substring(3) + "not";
    }
}

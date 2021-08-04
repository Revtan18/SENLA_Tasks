import java.util.Scanner;

public class Summe {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi. I can count a sum for every number. Please, write me each number");
        String userNumber = sc.nextLine();
        int counter = 0;
        boolean check = intCheck(userNumber);
        if(check){

            counter = getSum(Integer.parseInt(userNumber));      
            System.out.println("The sum of the number "+ userNumber + " is: " + counter);
        } else{
            System.out.println("I'm sorry, but i cannot get you some sum from a text. ");
            System.out.println("But actually, every text have also a sum. And this sum is 0 :)");
        }      
    }

    public static int getSum(int numberToSum){
        int len = String.valueOf(Math.abs(numberToSum)).length();
        int sum = 0;
        int workValue = numberToSum;
        for (int i = 0; i < len; i++){
            sum += workValue % 10;
            workValue = workValue / 10;
        }
        return sum;
    }

    public static boolean intCheck(String number){
        boolean possibleToInt = false;
        int num = 0;
        try {
            num = Integer.parseInt(number); 

        } catch (Exception e) {
            //TODO: handle exception
        }
        if (num != 0){
            possibleToInt = true;
        }
        return possibleToInt;
    }
}

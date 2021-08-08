import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi. I can get you all prime numbers, which has your number. Please, write me each number");
        float userNumber = sc.nextFloat(); //We use float to avoid Exception with comma

        if (userNumber % 1 != 0){
            System.out.println("I work only with whole numbers.");    
        } else{
            int usNum = (int) userNumber; //User wrote appropriate number. We can work with int-type
            String allPrimeNumbers = getPrimeNumbers(usNum);
            System.out.println("All prime numbers in " + usNum + ": " + allPrimeNumbers);
        }
    }

    public static boolean isPrimeNumber(int number) {
        int factors = -1;
        int j = 2;
        
        //Check of any others divider
        while(j < number){
            if(number % j == 0){
                factors++;
            }
            j++;
        }
        return (factors == -1); // We only want to know, have the number any others divider except 0 and this number
    }
    // Method to get a text-value with all primeNumbers
    public static String getPrimeNumbers(int userNumber) { 
        StringBuilder bid = new StringBuilder();
        for (int i = 1; i < userNumber; i++) {
            if (isPrimeNumber(i)){
                bid.append(i + ", ");
            }
        }
        String text = bid.toString();
        return  text.substring(0, text.length() - 2); // Remove last comma and space 
    }
}
import java.util.Scanner;
/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hi. This Program get you a lenght of vectors and also their product.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's Start. Please, give me a first Vector (format xy, example: 54)");
        String[] userVector1 = sc.nextLine().split("");

        int xCoor =  Integer.parseInt(userVector1[0]);
        int yCoor = Integer.parseInt(userVector1[1]);

        Vector vector1 = new Vector(xCoor, yCoor);
    } 

    public int createX(String[] userVector){
        int x = 0;
        
        return x;
    }
}



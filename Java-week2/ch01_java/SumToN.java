import java.util.Scanner;


public class SumToN {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= num1; i++){
            
            sum = i+sum;
            System.out.println(sum);
        }//end of for

        scanner.close();
    } // end of main
    
}

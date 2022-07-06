public class Factorials {
    public static void main(String[] args) {
        int input = 5;
        int factorial = 1;

        for(int i =1; i<=input; i++){
            factorial = factorial*i;
         } //end of for loop
        System.out.println(factorial);
    }
}

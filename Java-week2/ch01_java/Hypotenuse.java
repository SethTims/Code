import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, height, hypotenuse;
        System.out.println("Mortal! Enter the length of your 'Triangle'");
        length = scanner.nextDouble();
        System.out.println("Mortal! Enter the height of your so called Triangle");
        height = scanner.nextDouble();
        hypotenuse = Math.sqrt((Math.pow(length, 2)) + (Math.pow(height, 2)));
        System.out.println("Mortal! Your hypotenuse is " +hypotenuse +" long. Quite Impressive!");
        
        scanner.close();
    }
}

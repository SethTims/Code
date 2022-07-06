import java.util.Scanner;
import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Movie> top10Movies = new ArrayList<Movie>();

        top10Movies.add(new Movie(1,"Marcell the Shell with Shoes on","Dean Fleischer-Camp",100));
        top10Movies.add(new Movie(2,"Fire of Love","Sarah Dosa",100));
        top10Movies.add(new Movie(3,"Playground","Laura Wendal",100));
        top10Movies.add(new Movie(4,"Writing with Fire","Rintu Thomas",100));
        top10Movies.add(new Movie(5,"The Janes","Tia Lessin",100));
        top10Movies.add(new Movie(6,"Happening","Audrey Diwan",99));
        top10Movies.add(new Movie(7,"Navalny","Daniel Roher",99));
        top10Movies.add(new Movie(8,"PolyStyrine","Celeste Bell",98));
        top10Movies.add(new Movie(9,"The Automat","Lisa Hurwitz",98));
        top10Movies.add(new Movie(10,"Who are We: A Chronicle of Racism in America","Emily Kunstler",98));

       Scanner scanner = new Scanner(System.in);
       System.out.println("Mortal! Which ranked movie dost thou desire to see...");
       int input = scanner.nextInt();
       
       System.out.println(top10Movies.get(input));

       scanner.close();
    }
}

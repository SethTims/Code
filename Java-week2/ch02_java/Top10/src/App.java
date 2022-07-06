import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Song> top10 =  new ArrayList<Song>();
        top10.add(new Song(1, "Running up that hill", "Kate Bush", "Fish People"));
        top10.add(new Song(2, "Afraid to Feel", "LF System", "Warner Records"));
        top10.add(new Song(3, "As it Was", "Harry STyles", "Columbia"));
        top10.add(new Song(4, "Break my Soul", "Beyonce", "Columbia"));
        top10.add(new Song(5, "Green Green Grass", "George Ezra", "Columbia"));
        top10.add(new Song(6, "About Damn Time", "Cat Burns", "RCA/Since 93"));
        top10.add(new Song(7, "About Damn Time", "Lizzo", "Atlantic"));
        top10.add(new Song(8, "Massive", "Drake", "Ovo/Republic Records"));
        top10.add(new Song(9, "IFTK", "Tion Wayne and La Roux", "Atlantic"));
        top10.add(new Song(10, "Late Night Talking", "Harry Styles", "Columbia"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mortal! Tell me which of these so called top 10 songs you require...");
        int input = scanner.nextInt();
        System.out.println(top10.get(input));

       
        


        scanner.close();
    }
}

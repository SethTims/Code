import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageCalc {
    public static void main(String[] args) {
        System.out.println("Enter your number now mortal : ");

       List<Double> dubList = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        String response = "";
        response = scanner.nextLine();
                
        while(!response.equals( "=")){
            //make response a number
            Double num = Double.parseDouble(response);
            dubList.add(num);
            
            System.out.println("Enter your next number mortal! Or press = to exit.");
            response = scanner.nextLine();          

        };
        //end of loop

        double total = 0;
        double average = 0;

        for(double i : dubList){
            total += i;
        }

        average = total/dubList.size();
        System.out.println("Mortal! Your average is : " +average);



        scanner.close();

        
        


        
        

        


    }
}

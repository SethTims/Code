import java.util.Scanner;

class CountToN{

    
    public static void main(String args[]){

        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        for(int i=0; i<=userNum; i++){
            if(i % 3 == 0){
            System.out.println(i);
            }//end of if
            
        } // end of for loop
      scanner.close(); 

    } // end of main
 

}
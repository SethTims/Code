public class CountTo100 {
    public static void main(String[] args) {
        
        for(int counter = 0; counter <=100; counter++){
            if((counter % 9)==0){
                System.out.println("Cat's have 9 lives");
            } else{
                System.out.println(counter);
            }
        }
    }
}

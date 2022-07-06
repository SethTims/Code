public class SevensNotFives {
    public static void main(String[] args) {
        for(int i = 2000; i<=3200; i++){
            if(i % 7 == 0 && i%5 !=0){
                System.out.print(i + ",");
            }

        }// end of for loop
    }
}

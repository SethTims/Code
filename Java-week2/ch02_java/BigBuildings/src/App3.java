import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<FloorArea> floorArea = new ArrayList<FloorArea>();
        ArrayList<Footprint> footPrint = new ArrayList<Footprint>();
        ArrayList<UsableVolume> volume = new ArrayList<UsableVolume>();

        floorArea.add(new FloorArea("Giga Texas","USA",2022, 929000));
        floorArea.add(new FloorArea("Boeing Everett Factory","USA",1967, 398000));
        floorArea.add(new FloorArea("The Palace of Parliament","Romania",1984, 364000));

       //footPrint.add(new Footprint("","",,));
        //footPrint.add(new Footprint("","",,));
       // footPrint.add(new Footprint("","",,));

        
       // volume.add(new UsableVolume("","",,));
      //  volume.add(new UsableVolume("","",,));
       // volume.add(new UsableVolume("","",,));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mortal, tell me how much floor area your 'offspring' require...");
        int input = scanner.nextInt();
        System.out.println(floorArea.get(input));

        scanner.close();
    }
}

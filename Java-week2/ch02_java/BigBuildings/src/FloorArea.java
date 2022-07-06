public class FloorArea extends Building{
    
    int floorArea;

   public FloorArea(String name, String country, int buildDate, int floorArea) {
        super(name, country, buildDate);
        this.floorArea = floorArea;
    }

public int getFloorArea() {
       return floorArea;
   }

   public void setFloorArea(int floorArea) {
       this.floorArea = floorArea;
   }

@Override 
public String toString() {
    return "FloorArea [Name: " +name +" Location: " +country +" Date Built: " +buildDate +" FloorArea: " + floorArea + "]";
}



 
 
      
}
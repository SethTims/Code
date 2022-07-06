
public class Footprint extends Building{
    int footPrint;


    public Footprint(String name, String country, int buildDate, int footPrint) {
        super(name, country, buildDate);
        this.footPrint = footPrint;
    }

    public int getFootPrint() {
        return footPrint;
    }

    public void setFootPrint(int footPrint) {
        this.footPrint = footPrint;
    }

    @Override
    public String toString() {
        return "Footprint [footPrint=" + footPrint + "]";
    }

    
}





public class UsableVolume extends Building{
    
    double UsableVolume;

    

    public UsableVolume(String name, String country, int buildDate, int usableVolume) {
        super(name, country, buildDate);
        this.UsableVolume = usableVolume;
    }

    public double getUsableVolume() {
        return UsableVolume;
    }

    public void setUsableVolume(double usableVolume) {
        UsableVolume = usableVolume;
    }

    @Override
    public String toString() {
        return "UsableVolume [UsableVolume=" + UsableVolume + "]";
    }

    
}

public class Building {
    
    String name, country;
    int buildDate;
    
    public Building(String name, String country, int buildDate) {
        this.name = name;
        this.country = country;
        this.buildDate = buildDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(int buildDate) {
        this.buildDate = buildDate;
    }

    @Override
    public String toString() {
        return "Building [buildDate=" + buildDate + ", country=" + country + ", name=" + name + "]";
    }



    
}




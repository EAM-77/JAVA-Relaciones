package Entity;

public class Perro {
    // Atributos
    private String nameD;
    private String breedD;
    private String ageD;
    private String sizeD;
    
    // Constructores

    public Perro() {
    }

    public Perro(String nameD, String breedD, String ageD, String sizeD) {
        this.nameD = nameD;
        this.breedD = breedD;
        this.ageD = ageD;
        this.sizeD = sizeD;
    }
    
    // Getter & Setter

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getBreedD() {
        return breedD;
    }

    public void setBreedD(String breedD) {
        this.breedD = breedD;
    }

    public String getAgeD() {
        return ageD;
    }

    public void setAgeD(String ageD) {
        this.ageD = ageD;
    }

    public String getSizeD() {
        return sizeD;
    }

    public void setSizeD(String sizeD) {
        this.sizeD = sizeD;
    }

    @Override
    public String toString() {
        return "Perro{" + "nameD=" + nameD + ", breedD=" + breedD + ", ageD=" + ageD + ", sizeD=" + sizeD + '}';
    }
}

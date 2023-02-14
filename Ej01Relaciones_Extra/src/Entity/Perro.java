package Entity;

public class Perro {
    
    private String name;
    private String raza;
    private int age;
    private String tamanho;

    public Perro() {
    }

    public Perro(String name, String raza, int age, String tamanho) {
        this.name = name;
        this.raza = raza;
        this.age = age;
        this.tamanho = tamanho;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return name + ", " + raza + ", age " + age + ", " + tamanho + "\n";
    }
}

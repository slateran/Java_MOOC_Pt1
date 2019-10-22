

public class Birds {

    private String name;
    private String latinName;
    private int observations;


    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void observeCount(){
        this.observations++;

    }

    public String toString(){
        return getName() + " (" + getLatinName() + "): " + this.observations + " observations";
    }


}

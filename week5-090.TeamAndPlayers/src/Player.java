public class Player {

    private String name;
    private int goals;


    public Player(String name){
        this.name = name;
    }

    public Player(String name, int goals){
        this.goals = goals;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    public String toString(){

        return getName() + ", " + goals();


    }
}

public class Reformatory {

    private int count = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.count++;
        return person.getWeight();
        //return -1;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.count;
    }

}

import java.util.ArrayList;

public class Database {

    private ArrayList<Birds> birdsArrayList = new ArrayList<Birds>();

    public void add(String name, String latinName) {

        birdsArrayList.add(new Birds(name, latinName));
    }

    public void observe(String name) {
        for (Birds bird : birdsArrayList) {
            if (bird.getName().equals(name)) {
                bird.observeCount();
            } else {
                System.out.println("Is not a bird! ");
            }
        }
    }

    public void stats() {
        for (Birds b : birdsArrayList) {
            System.out.println(b);
        }
    }

    public void show(String name) {
        for (Birds b : birdsArrayList) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }
}

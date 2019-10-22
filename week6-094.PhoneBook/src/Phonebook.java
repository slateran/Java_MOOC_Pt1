import java.util.ArrayList;

public class Phonebook {


    private ArrayList<Person> personArrayList= new ArrayList<Person>();


    public void add(String name, String number) {

        personArrayList.add(new Person(name, number));
    }

    public void printAll() {

        for (Person p : personArrayList) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name){


        for (Person p : personArrayList){

            if(p.getName().contains(name)){
                return p.getNumber();
            }
        }

        return "number not known";

    }


}

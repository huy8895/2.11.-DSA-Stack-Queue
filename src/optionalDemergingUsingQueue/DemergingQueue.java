package optionalDemergingUsingQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingQueue {

    private static final String MALE = "male";
    private static final String FEMALE = "female";

    public static void main(String[] args) {
        Queue<Person> femaleQueue = new LinkedList<>();
        Queue<Person> maleQueue = new LinkedList<>();

        ArrayList<Person> listStaff = new ArrayList<>();
        listStaff = ListPerson.getPersonList();

        for (Person person : listStaff) {
            switch (person.getGender()) {
                case FEMALE:
                    femaleQueue.add(person);
                    break;
                case MALE:
                    maleQueue.add(person);
            }

        }


    }

}

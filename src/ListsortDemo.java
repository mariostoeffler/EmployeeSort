import java.util.ArrayList;
import java.util.Collections;

public class ListsortDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(6);
        integers.add(7);
        integers.add(4);
        integers.add(9);
        integers.add(3);

        Collections.sort(integers);
        System.out.println(integers);

        ArrayList<Employee> emplList = new ArrayList<>();

        emplList.add(new Employee(34224, "Mark", 3342, "aus"));
        emplList.add(new Employee(14224, "Mark1", 3342, "aus"));
        emplList.add(new Employee(64224, "Mark2", 3342, "aus"));

        Collections.sort(emplList);
        System.out.println(emplList);
    }





}

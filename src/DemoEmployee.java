import java.util.ArrayList;
import java.util.Arrays;

public class DemoEmployee {

    public static void main(String[] args) {
        Employee[] newEmps =
                {
                        new Employee(6342, "Mark", 342, "Sekr"),
                        new Employee(3455, "Swete", 34552, "Yes"),
                        new Employee(3511, "Eric", 3224, "No"),
                };

        Arrays.sort(newEmps);
        System.out.println(Arrays.toString(newEmps));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(6342, "Mark", 342, "Sekr"));
        employees.add(new Employee(3455, "Swete", 34552, "Yes"));
                new Employee(3511, "Eric", 3224, "No"),)

    }
}

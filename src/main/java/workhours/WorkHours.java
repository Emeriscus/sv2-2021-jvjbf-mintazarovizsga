package workhours;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WorkHours {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public String minWork(String file) {
        loadFormFile(file);
        employees.sort(Comparator.comparing(Employee::getWorkHours));
        return employees.get(0).getName() + ": " + employees.get(0).getDate();
    }

    private void loadFormFile(String file) {
        try {
            Scanner scanner = new Scanner(Path.of(file));
            employeesfromLines(scanner);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + file, ioe);
        }
    }

    private void employeesfromLines(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String[] temp = scanner.nextLine().split(",");
            String[] dateTemp = temp[2].split("-");
            employees.add(new Employee(temp[0], Integer.parseInt(temp[1]),
                    LocalDate.of(Integer.parseInt(dateTemp[0]),
                            Integer.parseInt(dateTemp[1]), Integer.parseInt(dateTemp[2]))));
        }
    }
}

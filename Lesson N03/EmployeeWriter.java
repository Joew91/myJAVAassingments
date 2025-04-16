import java.io.*;
import java.util.*;

public class EmployeeWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialID = 1;
        if (args.length > 0) {
            initialID = Integer.parseInt(args[0]);
        }
        Employee.lastIDUsed = initialID;

        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.print("Enter first name (or 'done' to finish): ");
            String firstName = scanner.next();
            if (firstName.equalsIgnoreCase("done"))
                break;

            System.out.print("Enter last name: ");
            String lastName = scanner.next();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(firstName, lastName, Employee.lastIDUsed, salary);
            employees.add(emp);
            Employee.lastIDUsed++;
        }

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"))) {
            out.writeInt(Employee.lastIDUsed);
            out.writeInt(employees.size());

            for (Employee e : employees) {
                out.writeInt(e.getID());
                out.writeUTF(e.getFirstName());
                out.writeUTF(e.getLastName());
                out.writeDouble(e.getSalary());
            }

            System.out.println("Data successfully written to data.bin.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

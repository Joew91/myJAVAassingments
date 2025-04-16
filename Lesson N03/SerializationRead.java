import java.io.*;
import java.util.*;

public class SerializationRead {
    public static void main(String[] args) {
        String filePath = (args.length > 0) ? args[0] : "data.bin";
        ArrayList<Employee> employees = new ArrayList<>();

        try (DataInputStream in = new DataInputStream(new FileInputStream(filePath))) {
            Employee.lastIDUsed = in.readInt();
            System.out.println("Last Used ID: " + Employee.lastIDUsed);

            int numEmployees = in.readInt();

            for (int i = 0; i < numEmployees; i++) {
                int id = in.readInt();
                String firstName = in.readUTF();
                String lastName = in.readUTF();
                double salary = in.readDouble();

                employees.add(new Employee(firstName, lastName, id, salary));
            }

            for (Employee e : employees) {
                e.displayInfo();
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

package company;

public class CompanyTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Jan", "Kowalski", 2000);

        Company company = new Company();
        company.increaseSalary(emp);
        System.out.println(emp.firstName + " " + emp.salary);
    }
}

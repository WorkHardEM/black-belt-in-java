package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Schoolar schoolar3 = new Schoolar("Petya", 13);
        Schoolar schoolar4 = new Schoolar("Misha", 13);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Max", 30);

        Team<Schoolar> schoolarTeam = new Team<>("Schools");
        Team<Schoolar> schoolarTeam2 = new Team<>("Schools2");
        Team<Student> studentTeam = new Team<>("Students");
        Team<Employee> employeeTeam = new Team<>("Employees");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}

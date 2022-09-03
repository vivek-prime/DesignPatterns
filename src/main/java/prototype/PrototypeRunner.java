package prototype;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Nationality nationality = new Nationality("India", "+91");
        Student student = new Student("Vivek", 26, nationality);
        System.out.println(student);

        Student cloneStduent = (Student) student.clone();
        System.out.println(cloneStduent);

        student.getNationality().setCountry("USA");

        System.out.println(student);
        System.out.println(cloneStduent);
    }
}

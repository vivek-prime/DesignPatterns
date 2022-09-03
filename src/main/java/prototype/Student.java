package prototype;

import lombok.Data;

@Data
public class Student implements Cloneable{
    private String name;
    private int age;
    private Nationality nationality;

    public Student(String name, int age, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

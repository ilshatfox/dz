package reflection;

public class SimpleStudent {
    public int age;
    public String name;

    public SimpleStudent(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{age=" + age +
                " name=" + name + "}";
    }
}
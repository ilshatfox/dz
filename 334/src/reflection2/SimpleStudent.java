package reflection2;

public class SimpleStudent {
    private int age;
    private String name;

    public SimpleStudent(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{age=" + age +
                " name=" + name + "}";
    }
}
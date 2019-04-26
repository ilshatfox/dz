package students;

//import equals.PhoneNumber;

public class Students {
    public int id;
    public String name;
    public String secondName;

    public Students(int id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object obj) {
        // исправить
        //покрывается следующим условием (излишне)
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Students)) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        return (((Students) obj).id == id) &
                (name.equals(((Students) obj).name)) &
                (secondName.equals(((Students) obj).secondName));

//        return true;
    }

    public void print() {
        System.out.println("<Students> id: " + id + " name: " + name + " secondName: " + secondName);
    }
}

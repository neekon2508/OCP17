package IOStream;

import java.io.Serializable;

public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    public String name;
    public int year;
    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String toString() {
        return name+": "+year;
    }

}

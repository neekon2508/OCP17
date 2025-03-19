package Exception;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Student {     
    private String name;     private int marks;      

    public Student(String string, int i) {
           this.name = string;
           this.marks =i;
        }
        public void addMarks(int m){         this.marks += m;     }     public void debug(){         System.out.println(name+":"+marks);     } 

        public static void printSum(int a, int b){       System.out.println("In int "+(a+b));   }      public static void printSum(double... a){       System.out.println("In double "+(a[0]+a[1]) );   }   public static void printSum(float a, float b){       System.out.println("In float "+(a+b));   }   public static void printSum(int a, float b){       System.out.println("In intfloat "+(a+b));   }  
        public static void main(String[] args) {
Path p1 = Paths.get("/home/fred/potter.txt");
Path p2 = Paths.get("/home/harry.tat");
System.out.println(p1.relativize(p2));

         }
    }
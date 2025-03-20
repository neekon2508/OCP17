package Exception;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Student {     
    private String name;     private int marks;      
 public Student() {}
    public Student(String string, int i) {
           this.name = string;
           this.marks =i;
        }
        public void addMarks(int m){         this.marks += m;     }     public void debug(){         System.out.println(name+":"+marks);     } 

        public static void printSum(int a, int b){       System.out.println("In int "+(a+b));   }      public static void printSum(double... a){       System.out.println("In double "+(a[0]+a[1]) );   }   public static void printSum(float a, float b){       System.out.println("In float "+(a+b));   }   public static void printSum(int a, float b){       System.out.println("In intfloat "+(a+b));   }  
        public static void main(String[] args) {

            try {
                for( ;; );
              }finally { }         }
         void probe(Object x) { System.out.println("In Object"); } //3 

    void probe(Number x) { System.out.println("In Number"); } //2

    void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Long x) { System.out.println("In Long"); } //4
    }
    class Base{   public List<CharSequence> transform(Set<CharSequence> list){ 
        return null;
     } }  
    class Derived extends Base{  
        Runnable a = () -> {System.out.println("");return;};        
     } 
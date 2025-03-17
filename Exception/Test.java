package Exception;

import java.io.Console;
import java.io.IOException;
import java.util.stream.*;
import javax.management.RuntimeErrorException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class Some extends Throwable {}
class MyThrow extends Some {}
public class Test {

    public static void main(String[] args) throws IOException {
      Path p1 = Paths.get("/home/fred/input.txt");
    Path p2 = p1.resolveSibling("temp");
System.out.println(p2);   }
}

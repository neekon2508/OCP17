package IOStream;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.Callable;
public class test {
    void talk() {

    public static void main(String[] args) {
        Callable c = new Callable() {
            public Object run() {
                System.out.println("X");
                return 10;
            }

            @Override
            public Object call() throws Exception {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'call'");
            }
        }
    }
}
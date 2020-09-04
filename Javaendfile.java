import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Javaendfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
       
        int line_number= 1;  
       while (scanner.hasNext()){
           System.out.println(line_number + " " + scanner.nextLine());
           line_number++;
         }
         scanner.close();
    }
}

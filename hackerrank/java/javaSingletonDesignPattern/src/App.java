import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


class Singleton{
   String str;
   static Singleton singleton;
   private Singleton(){
       
   }
    public static Singleton getSingleInstance(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
    
    

}

package ma.enset.myapp;

import ma.enset.myapp.service.MyService;
import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;


public class MyApp {
       

    public static void main( String[] args )
    {
        if(args.length!=2){
            System.out.println("You must provide two arguments");
            System.exit(0);
        }

        MyService myService=new MyService();
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double result=myService.compute(a, b);
        System.out.println(String.format("Sum of %s and %s is %s", a, b, result));

        //get("/hello", (req, res) -> "Hello World");
        Gson gson = new Gson();
        get("/hello", (request, response) -> {
            Map<String,Object> map = new HashMap<>();
            map.put("test","Mohammed");
            map.put("nom", "Momo");
            response.type("application/json");
            return map;
        }, gson::toJson);
        
    }
    
}

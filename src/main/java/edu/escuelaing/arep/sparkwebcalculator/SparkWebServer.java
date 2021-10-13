/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.sparkwebcalculator;

import spark.Request;
import spark.Response;
import static spark.Spark.port;
import static spark.Spark.*;

/**
 *
 * @author Miguel
 */
public class SparkWebServer {
    public static void main(String[] args) {
        port(getPort());
        get("/ln", (req, res) -> inputFirsOperation(req, res));
        get("/atan", (req, res) -> inputSecondOperation(req, res));

        
    }
    private static String inputFirsOperation(Request req, Response res) {
        
        Double num = Double.parseDouble(req.queryParams("value"));
        CalculatorWebApi calculadora = new CalculatorWebApi();
        
        res.type("application/json");
        
       String pageContent=

                "{"+
                   " \"operation\": \"ln\","+"\n"+
                "\"input\":"+ num +"\n"+
                 " \"output\":" +calculadora.calculateLn(num) +
                "}";
       return pageContent;
       
        
    }
    
    private static String inputSecondOperation(Request req, Response res) {
        Double num = Double.parseDouble(req.queryParams("value"));
        CalculatorWebApi calculadora = new CalculatorWebApi();
        res.type("application/json");
        
       String pageContent=
                "{"+
                   " \"operation\": \"atan\","+"\n"+
                "\"input\":"+ num +"\n"+
                 " \"output\":" +calculadora.calculateAtan(num) +
                "}";

        return pageContent;
    
    
    }

    

    private static int getPort() {
            if (System.getenv("PORT") != null) {
                    return Integer.parseInt(System.getenv("PORT"));
            }
            return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
 }
}

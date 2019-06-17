/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author reroes
 */
public class Demo2 {

    private static int pro;

    public static void leerDatos() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        int pro = 0 ;
        try {
            FileReader reader = new FileReader("data/registros2.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            // object el padre de los elmentos de java 

            JSONArray employeeList = (JSONArray) obj; // se tranforma a JsonaArray
            // System.out.println(employeeList);

            // Iterate over employee array
            for (int i = 0; i < employeeList.size(); i++) {
                // parseEmployeeObject(employeeList.get(i);
                JSONObject registros2 = (JSONObject) employeeList.get(i);
                System.out.println(registros2);
                parseEmployeeObject(registros2);
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private static void parseEmployeeObject(JSONObject employee) {   // Aquie se comvierte los diferentes elementos asu respectivo valor para
        //ser mostrados por el programa
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("estudiante");

        //Get employee first name
        String firstName = (String) employeeObject.get("nombres");
        System.out.println(firstName);

        //Get employee last name
        String lastName = (String) employeeObject.get("asignatura");
        System.out.println(lastName);

        //Get employee website name
        String website = (String) employeeObject.get("calificacion");
        System.out.println(website);
        
        int nota = Integer.parseInt(website);  
        
        pro = (nota + pro)/3; 
        
        System.out.printf("El promedio es: %d\n",pro);
    }
    
}

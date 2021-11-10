package Interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String patch = "C:\\Users\\Usuário\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(patch))){

            String name = br.readLine();
            while ( name !=null){
                String[] fields = name.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                name = br.readLine();
            }
            Collections.sort(list);
            for(Employee emp: list){
                System.out.println(emp.getName() + " : " + emp.getSalary());
            }
        }catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }
    }

}

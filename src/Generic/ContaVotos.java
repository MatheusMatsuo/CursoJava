package Generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ContaVotos{
    public static void main (String[] args) {
        Map<Votos, Integer> qtdVotos = new HashMap<>();
        String patch = "C:\\Users\\Usuário\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(patch))){
            String candidato = br.readLine();
            while (candidato!= null){
                String[] fields = candidato.split(",");
                Votos vt = new Votos(fields[0]);
                Integer aux = Integer.parseInt(fields[1]);
                if(qtdVotos.containsKey(vt)){
                    int aux2 = qtdVotos.get(vt) + aux;
                    qtdVotos.put(vt, aux2);
                }else {
                    qtdVotos.put(vt, aux);
                }
                candidato = br.readLine();
            }
            Set<Votos> setVt = qtdVotos.keySet();
            for(Votos v: setVt){
                System.out.println(v.getNome() + ": " + qtdVotos.get(v));

            }
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

}

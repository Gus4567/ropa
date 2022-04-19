package Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class GuardaRopa {

     int count= 0;
     HashMap<Integer, List>  lista= new HashMap<>();


    public Integer guardarPrendas(List<Prenda> listaDePrenda){
         count++;
         lista.put(count, listaDePrenda);
         return count;
    }

    public void mostrarPrendas(){
         lista.forEach((k, v) -> System.out.println("numero: " + k + " prenda: " + v));


    }

    /*public List<Prenda> devolverPrendas(Integer numero){
        return 1;
    }*/

}

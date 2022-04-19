package Collections;
import java.util.List;
import java.util.HashMap;

public class GuardaRopa {

     int count= 0;
     HashMap<Integer, List>  lista= new HashMap<>();


    public Integer guardarPrendas(List<Prenda> listaDePrenda){
         count++;
         lista.put(count, listaDePrenda);
         return count;
    }

    public void mostrarPrendas(){



    }

    /*public List<Prenda> devolverPrendas(Integer numero){
        return 1;
    }*/

}

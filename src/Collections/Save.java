package Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class Save {
    public static void main(String[] args){

        Prenda vestido= new Prenda("Gucci", "corto");
        //System.out.println(vestido);
        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(vestido);
        System.out.println(prendas);

    }
}

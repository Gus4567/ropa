package Collections;
import java.util.Scanner;

public class Prenda {
    private String marca;
    private String modelo;



    public Prenda(String marca, String modelo){
                this.marca= marca;
                this.modelo= modelo;

           }

    public String toString(){
               return "marca: " + marca + " modelo: " + modelo;
           }




}

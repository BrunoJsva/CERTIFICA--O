import java.util.*;

public class TestaOperadores {
    
    public static void main(String[] args){
        int i = 15;
        long idade = 25;

        idade = i;
        System.out.println(idade);

        //byte -> short -> int -> long
        //float -> double
        //char -> int || long

        //valores literais
        int a = 10;
        long b = 20;
        short c = 5;
        byte d= 4;

        //Ponto flutuante
        double e = 30.0;
        System.out.println(e);
        float f = 40.3f;
        System.out.println(f);
        double g = 40.30f;
        System.out.println(g);
        f = a;
        f = b;
        f = c;
        f = d;

        ArrayList<String> lista = new ArrayList<String>();
        List<String> lista2 = lista; 
        System.out.println(lista2);


        


    }
}

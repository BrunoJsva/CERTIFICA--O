package metodos;

class Calculadora{
    public int soma(int... numeros){

        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma;
    }
}

public class TestaCalculadora {
    
    public static void main(String[] args){
        Calculadora c = new Calculadora();
        System.out.println(c.soma(3,5));
        System.out.println(c.soma(3,5,5,5,5,5));

    }
}
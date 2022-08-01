public class TesteIncrementos {
    public static void main(String[] args){

        //O -- Tira o ++ aumenta ou diminui 1.
        //2 métodos para a mesma implementação. 
        int subtrair = 5;
        //Subtraindo 1 do valor da variável antes do print.
        // subtrair--;
        // System.out.println("Antes do print" + "-" + subtrair);

        //Subtrair o valor da variável no momento do print.
        System.out.println("Durante o Print" + " - " + --subtrair);
        
        int adicionar = 5;
        //Adicionar 1 ao valor da variável antes do print.
        // adicionar++;
        // System.out.println("Antes do print" + "-" + adicionar);

        //Adicionar o valor da variável no momento do print.
        System.out.println("Durante o Print" + " - " + ++adicionar);

        //Abreviando a soma ou subtração no valor da variável.

        adicionar += 2;
        adicionar -= 2;
        adicionar *= 2;
        adicionar /= 2;

        System.out.println(adicionar += 3);


    }
}

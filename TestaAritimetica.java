public class TestaAritimetica {
    public static void main(String[] args){

        byte dois = 2;
        byte dez = 10;

        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez + dois;
        int cinco = dez / dois;

        int restoDaDivisao = 5 % 2;

        System.out.println(doze + oito + vinte + cinco + restoDaDivisao);

        double divisao1 = 5 / 0.0;

        System.out.println(divisao1);

        //Em uma operação o mínimo que se retorna e um int.
        //E o tipo que retorna e sempre o maior dos dois. 

        

    }
}

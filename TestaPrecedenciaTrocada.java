public class TestaPrecedenciaTrocada {
    public static void main(String[] args){

        int a = 15 * 4 + 1;
        System.out.println(a);

        //Sempre será resolvido o que esta dentro dos parênteses.
        //A precedência pode mudar totalmente o resultado da conta.
        int b = 15 * (4 + 1);
        System.out.println(b);

        //15 + 0 é 15 o uso da precedência e indispensável neste caso.
        System.out.println(15 + 0 + " é cento e cinquenta");
        //15 + a concatenação do 0 é cento e cinquenta.
        System.out.println(15 + (0 + " é cento e cinquenta"));

        /*Exemplo de precedência com o length */

        //Somente a contagem do nome
        System.out.println("Bruno".length());

        //contagem do nome e sobrenome sem a precedência
        //No caso aqui e imprimido Bruno5 porque e considerado somente o "Silva"
        System.out.println("Bruno" + "Silva".length());

        //Contagem do nome e sobrenome com a precedência inserida nos parenteses.
        //imprime 10, pois e contado tudo dentro dos parenteses.
        System.out.println(("Bruno" + "Silva").length());

    }

}

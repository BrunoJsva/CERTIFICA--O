public class TestaComparacaoString2 {
    
    public static void main(String[] args){

        String ab = "a" + "b";
        //O Java consegue perceber que o resultado literal e igual o valor literal do banco.
        System.out.println(ab == "ab");

        //Aqui o resultado e false, porque estamos comparando um literal com uma variável.
        String a = "a";
        String bc = a + "bc";
        System.out.println(bc == "abc");

    }
}

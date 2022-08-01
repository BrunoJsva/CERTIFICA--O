public class TestaComparacaoStrings {
    
    public static void main(String[] args){
 
        String nome1 = new String("Bruno");
        String nome2 = new String("Bruno");
        //Aqui e comparado se os dois objetos vem do mesmo lugar, o resultado e false.
        //Não compra a String e sim o objeto, nome1 é diferente do nome2 = false.
        System.out.println(nome1 == nome2);

        String nome3 = "Bruno";
        String nome4 = "Bruno";
        //Aqui e comparado se as duas Strings são iguais = true.
        System.out.println(nome3 == nome4);

        String nome7 = new String("Bruno");
        //O resultado permanece false, pois estamos verificando e uma String e igual a um objeto String.
        System.out.println(nome3 == nome7);

        //Para ter certeza que oque esta sendo comparado e uma String usamos o método equals.
        //Resultado true
        System.out.println(nome3.equals(nome7));
    }
}

public class TestaOperadorDeReferencia {
    
    public static void main(String[] args){

        String nome = "Bruno";

        //Para acessar o valor de um método a partir de uma referencia e preciso adicionar o length - método
        //Importante lembrar que o ponto e o operador de referencia.
        int tamanho = nome.length();
        System.out.println(tamanho);
    }
}

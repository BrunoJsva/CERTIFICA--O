public class TestaComparacaoString3 {
    
    public static void main(String[] args){

        String texto = "Um texto qualquer";
        String txt = texto.substring(3,8);

        //O resultado e false porque o Java pensa que o txt e uma objeto, então como esperado 
        //A comparação de um objeto com um literal sempre e false.
        System.out.println(txt == texto);

        //Aqui o resultado e true porque o java percebe que o uso do toLowerCase e para uma String.
        System.out.println(texto.toLowerCase() == texto);

    }
}

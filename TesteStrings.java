public class TesteStrings {
    public static void main(String[] args){
        /*Método de busca dentro de um texto */
        String texto = "Método de busca dentro de um texto";

        /*Procura a posição da palavra ou letra */
        System.out.println(texto.indexOf("Método"));

        /*Se a palavra não exite ele retorna -1 */
        System.out.println(texto.indexOf("Método"));
        
        /*Procura de traz pra frente */
        System.out.println(texto.lastIndexOf("Método"));

        /*Procura de traz pra frente a partir da posição atribuída */
        System.out.println(texto.lastIndexOf("Método", 5));

        /*Procura de traz pra frente a partir da posição atribuída */
        System.out.println(texto.indexOf("Método", 5));

        /*Ve se a String começa ou termina de uma determinada maneira*/
        System.out.println(texto.startsWith("Método"));

        /*Ve se a String começa ou termina de uma determinada maneira*/
        System.out.println(texto.endsWith("Método"));

        /*Compara a igualdade da String */
        System.out.println("Java".equals("java"));

        /*Ignora letras minusculas e maiúscula */
        System.out.println("Java".equalsIgnoreCase("JAVA"));

        /*Extrair um pedaço da String */
        /*Espaço inesistente da EXCEPTION*/
        String Java = "Java";
        /*A casa começa no numero 0, logo a String ficaria "ava", ela vai iniciar 
         * onde o valor foi definido!*/
        System.out.println(Java.substring(1));

        /*Especifcando o trecho */
        System.out.println(Java.substring(2,4));
        System.out.println(Java.substring(0,3));

        String variosMétodos = "    Tira o espaço e COLoca TuDO em Maiúsculo   ".toUpperCase().trim();
        System.out.println(variosMétodos);

        String s = "Bruno Silva";

        /*Tudo em maiúsculo */
        s = s.toUpperCase();
        System.out.println(s);

        /*Tudo em minusculo */
        s = s.toLowerCase();
        System.out.println(s);

        /*Pega a String da posição desejada!*/
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));

        /*Espaço inexistente da Exepition*/
        //System.out.println(s.charAt(15));

        /*Conta os caracteres a String */
        System.out.println(s.length());

        /*Verifica se a String esta vazia retornando boolean*/
        System.out.println("".isEmpty());

        /*Remove os espaços vazios da esquerda e direita*/
        System.out.println(s.trim());

        /*Adiciona uma nova String na existente */
        System.out.println(s.concat("as"));

        /*Troca o valor da String por outro */
        System.out.println(s.replace(s, "Brunão"));

        String nomeDireto = "Java";
        String nomeIndireto = new String("Java");

        char[] nome = new char[]{'a','b','c'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("java");
        String nome2 = new String(sb1);

        /*Nunca chamar nulo NullPointEXCEPTION  */
        //String nomeNulo = null;

        String nomeDaProva = "Certificação" + "" + "Java";
       // String nomeDaProvaComNulo = nomeDaProva + "" + nomeNulo;
        //System.out.println(nomeDaProvaComNulo);
        System.out.println(1500 + " Certificação");
        System.out.println(15 +(0 + (0 + " Certificação")));
        System.out.println(1 + (5 + (0 + (0 + " Certificação"))));

        System.out.println(nomeDaProva + nome2 + nome1 + nomeIndireto + nomeDireto);

        

    }
}

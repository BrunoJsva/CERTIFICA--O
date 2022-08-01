public class TestaContandoString {
    
    public static void main(String[] args){
        String h = new String ("hello"); // 2 Objetos String foram criados, 1 com o new e o outro literal "hello " - o literal vai para o pool de String
        String h1 = "hello "; // nenhum objeto foi criado, so referenciado pois ja existia no pool de String.
        String w = "word";

        System.out.println("hello "); // nenhum objeto foi criado, so referenciado pois ja existia no pool de String.
        System.out.println(h1 + "word"); // 1 novo objeto foi criado com a junção de 2 que ja existiam.
        System.out.println("Hello " == h1); //1 novo objeto e criado porque o "Hello " esta com h maiúsculo.


        System.out.println(h);
        System.out.println(w);
    }
}

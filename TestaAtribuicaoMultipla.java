public class TestaAtribuicaoMultipla {
    
    public static void main(String[] args){
    
        int a = 10, b = 15, c = 20;

        //Cuidado na atribuição de valor, pois ele não adiciona, apenas substitui
        a = (b = c) + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}

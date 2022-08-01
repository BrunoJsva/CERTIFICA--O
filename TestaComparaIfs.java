public class TestaComparaIfs {
    
    public static void main(String[] args){
        boolean autentico = true;

        // if(autentico){
        //     System.out.println("OK");
        // }else{
        //     System.out.println("Não autorizado!");
        // }

        //O if sempre espera receber um boolean, um exemplo errado seria esse!

        // if(1 + 2){
        //     System.out.println("OK");
        // }else{
        //     System.out.println("Não autorizado!");
        // }

        boolean valor = true;

        // if(valor == false){
        //     System.out.println("false");
        // }
        // //Pode ser declarado apenas o boolean, pois ele ja e true.
        // if(valor){
        //     System.out.println("Valor");
        // }

        // int a = 0, b = 3;

        // //Cuidado com a atribuição ao invés de comparação
        // if(a = b){
        // System.out.println("Iguais");
        // }

        boolean v = true;

        if(v){
            System.out.println("V Verdadeiro");
        }else if(valor){
            System.out.println("Valor Verdadeiro");
        }else{
            System.out.println("False");
        }

        //Construção
        // if(){

        // }else if(){

        // }else if(){

        // }else{

        // }

        if(autentico)
            System.out.println("Autêntico");

        int valor1 = 100;
        if(valor1 > 200)
            if(valor1 < 400)
                if(valor1 > 300)
                    System.out.println("a");
                else
                    System.out.println("b");
            else
                System.out.println("c");

        

    }
}

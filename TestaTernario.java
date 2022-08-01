public class TestaTernario {
    
    public static void main(String[] args){

        //Um operador ternario tem haver com 3 coisas que são elas:
        //(Condição) ? caso_verdadeira : caso_falsa;

        int i = 6;
                    //Condição ? Verdadeiro : Falso
        int resultado = (i == 5 ) ? 100 : 0;
        System.out.println(resultado);
        //Poder ser feito dessa forma também:
        System.out.println(resultado==5 ? 100 : 0);

        
    }
}

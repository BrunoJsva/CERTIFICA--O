public class TestaOperadoresLogicos {
    
    public static boolean metodo(String msg){
        System.out.println(msg);
        return true;
    }

    public static void main(String[] args) {
        /* 
        //Verifica a igualdade do dois lados com o &&
        //short-Circuite
        System.out.println(1 == 1 & 1 > 2);
        //True caso haja almenos 1 valos igual
        //short-Circuite
        System.out.println(1 == 1 | 1 > 2);

        //Verifica se um dos valores e verdadeiro ^
        //O exclusivo sempre olha os 2 lado!
        System.out.println(1 == 1 ^ 1 > 2);
        //Inverte o valor boolean true vira false e vise-versa
        System.out.println(!(1 == 1) );
        */

        //Verifica a igualdade do dois lados com o &
        //true 1 == 1
        //Sempre executa o método mesmo que ja seja suficiente
        System.out.println(1 == 1 & metodo("Primeiro"));

        //Verifica a igualdade de um lado somente, caso o valor não seja suficiente
        //short-Circuite
        //Retorna false e não verifica o outro lado!
        System.out.println(1 != 1 && metodo("Segundo"));

        //Verifica a igualdade de um so lado caso seja suficiente!
        //True caso haja almenos 1 valos igual
        //short-Circuite
        System.out.println(1 == 1 || metodo("Terceiro"));

        //Verifica a igualdade do dois lados
        //true 1 == 1
        //Sempre executa o método mesmo que ja seja suficiente
        System.out.println(1 != 1 | metodo("Quarto"));
        
    }
}

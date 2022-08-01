public class TestaSwitch {
    
    public static void main(String[] args){

        int opcao = 4; 
        switch(opcao){
            case 1:
            System.out.println("Primeira opção!");
            break;
            case 2:
            System.out.println("Segundo opção!");
            break;
            case 3: 
            System.out.println("Terceiro opção!");
            break;
        }

        int opcao1 = 4; 
        final int variavel = 1;
        
        //Pode ser usada uma variável com ou sem parenteses desde de que ela seja "final"
        //Não pode ser usado o null nos case;
        switch(opcao1) {
            case variavel:
            System.out.println("Primeira opção!");
            break;
            case 2:
            System.out.println("Segundo opção!");
            break;
            case 3: 
            System.out.println("Terceiro opção!");
            break;
            //default so é executado se não houver o valor esperado em nenhum outro case.
            default:
            System.out.println("default");
        }
    }
}

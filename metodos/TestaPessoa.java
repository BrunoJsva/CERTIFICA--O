package metodos;

public class TestaPessoa {
    
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.setNome("Bruno" , 27);

        String nome = p.getNome();

        System.out.println(nome);
        System.out.println(p.getNome());

}
}

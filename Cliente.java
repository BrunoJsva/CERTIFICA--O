public class Cliente {
    String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    //Para sobrescrever um método equals sempre precisa receber um Object
    public boolean equals(Object o){
        Cliente outro = (Cliente)o;
        return this.nome.equals(outro.nome);
    }
}

class TestaCamparacaoEquals{
    public static void main(String[] args){
        Cliente c1 = new Cliente("Bruno");
        Cliente c2 = new Cliente("Marli");
        Cliente c3 = new Cliente("Marli");

        System.out.println(c2.equals(c3));
    }
}
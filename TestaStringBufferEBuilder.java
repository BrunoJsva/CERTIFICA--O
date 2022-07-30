class TestaStringBuilderEBuild{

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Caelum");
        sb.append(" - ");
        sb.append("Brunão ");
        System.out.println(sb.toString());
        System.out.println(sb.length());

        StringBuilder sb3 = new StringBuilder(sb);
        sb3.append("Casa do ");
        sb3.append(" Bruno");
        sb3.append('x');
        sb3.append(new Carro());

        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("Bruno de Jesus Silv");
        sb4.insert(19, "2");

        sb4.delete(15, 19);
        System.out.println(sb4);

        System.out.println(new StringBuilder("Bruno").reverse());

        StringBuilder sb5 = new StringBuilder("Bruno de Jesus Silva");
        sb5.substring(5,7);

        System.out.println(sb5.substring(5,7));






    }
}

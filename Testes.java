public class Testes {
    
}


class B{
    void x(int... x) {
        System.out.println(x.length);
    }
}
class A {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("guilherme");
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
        System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
      }
}

class sdf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("guilherme").delete(2,3);
        System.out.println(sb);
    }

    
class Adas{

    public static void main(String [] args){
        String s = "aba";
        for(int i = 0; i < 9; i++) {
            s = s +"aba";
        }
        System.out.println(s.length());
    }
}

class Asdfv {
    public static void main(String[] args) {
        String vazio = null;
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
    }
}





















}
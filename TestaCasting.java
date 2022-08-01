public class TestaCasting {
    public static void main(String[] args){
        double d = 15.3;
        int i = (int) d;
        //Quando o casting e feito no caso de uma variável de maior espaço para o menor
        //É como estar assumindo um risco de perda de tempo e dados durante o processamento
        //O compilado ira tirar o parte do ponto flutuante ate o fim deixando assim o numero inteiro.
        System.out.println(i);

        long l = 151515151515l;
        int i2 = (int) l;
        //Ao converter um long para int ha o risco do numero ser totalmente alterado durante a conversão.
        System.out.println(i2);

        int x = 200;
        byte b = (byte) x;
        //Como esperado o valor não esta correto!
        System.out.println(b);
    }
}

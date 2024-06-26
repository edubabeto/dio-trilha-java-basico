public class Operadores {
    public static void main(String[] args) {
        Operadores op = new Operadores();
        //op.imprimirConcatenar();
        //op.imprimirUnarios();
        op.imprimirRepeticao();
    }

    public void imprimirRepeticao() {
        int numero = 5;
        //x repeticao
        numero = numero + 2;
        System.out.println(numero);
        numero = numero + 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero);

        System.out.println(numero);
        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

    }
    public void imprimirUnarios() {
        int numero = 5;
        System.out.println( - numero);
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        numero = + numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
    }
    public void imprimirConcatenar() {
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + (1+1+1);
        System.out.println(concatenacao);
    }
}

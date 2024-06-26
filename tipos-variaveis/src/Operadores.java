import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        Operadores op = new Operadores();
        //op.imprimirConcatenar();
        //op.imprimirUnarios();
        //op.imprimirRepeticao();
        //op.imprimirTernario();
        //op.imprimirRelacionais();
        op.imprimirLogicos();
    }

    public void imprimirLogicos() {
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if(condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira.");
        }

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras.");
        }
    }
    public void imprimirRelacionais () {
        int numero1 = 1;
        int numero2 = 2;
        String nome1 = "EDUARDO";
        String nome2 = new String("EDUARDO");
        boolean simNao = numero1 == numero2;
        System.out.println("Número um: "+numero1);
        System.out.println("Número dois: "+numero2);
        System.out.println("Número um é igual ao número dois? "+simNao);

        simNao = numero1 != numero2;
        System.out.println("Número um é diferente do número dois? "+simNao);

        simNao = numero1 > numero2;
        System.out.println("Número um é maior que o número dois? "+simNao);

        simNao = numero1 < numero2;
        System.out.println("Número um é menor que o número dois? "+simNao);

        simNao = nome1 == nome2;
        System.out.println("Nome1 é igual ao Nome2? "+simNao);

        simNao = nome1.equals(nome2);
        System.out.println("Nome1 é igual ao Nome2? "+simNao);


    }
    public void imprimirTernario () {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        a = 6;
        resultado = a==b? "verdadeiro":"falso";
        int resultado2 = a==b? 1:0;
        System.out.println(resultado);
        System.out.println(resultado2);
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

import java.util.Iterator;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
  public static void main(String[] args) {
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);
    System.out.println("Ola, me chamo "+nome + " " + sobrenome);
    System.out.println("Tenho "+idade+" anos");
    System.out.println( "Minha altura é: "+altura+"cm");

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite seu nome");
    String nome2 = scanner.next();
    System.out.println("Digite seu sobrenome:");
    String sobrenome2 = scanner.next();
    System.out.println("Digite sua idade: ");
    int idade2 = scanner.nextInt();
    System.out.println("Digite sua altura:");
    double altura2 = scanner.nextDouble();

    //Imprimindo dados obtidos pelo usuario
    System.out.println("Ola, me chamo "+nome2+" "+sobrenome2);
    System.out.println("Tenho "+idade2+" anos");
    System.out.println("Minha altura é "+altura2+"cm ");
  }

 
}

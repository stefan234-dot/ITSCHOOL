import java.util.Locale;
import java.util.Scanner;

public class SecondClass {
   static void main() {
       int age = 20;
       String nume = "Stefan";
       String color = "albastru";
       System.out.println("NUmele meu este" +nume);
       System.out.println("Culoarea mea preferata este" +color);
       System.out.println("varsta mea este" +age);

       int numar = 35;
       double pret = 14.5;
       char caracter = 'a';
       String nume2 = "Dumitru";
       System.out.println(numar);
       System.out.println(pret);
       System.out.println(caracter);
       System.out.println(nume2);

       int a = 8;
       int b = 10;
       int c;
       c = a + b;
       System.out.println(c);

       int d = 30;
       int e = 15;
       int division;
       division = d/e;
       System.out.println(division);


       int x = 3;
       int y = 3;
       int inmultire;
       inmultire = x * y;
       System.out.println(inmultire);

       int z = 90;
       int w = 80;
       int scadere;
       scadere = z - w;
       System.out.println(scadere);

       int q = 30;
       int p = 2;
       int modulus;
       modulus = q % p;
       System.out.println(modulus);


       Scanner scanner = new Scanner(System.in);
       System.out.println("Seteaza valoarea pentru t:");
       int t = scanner.nextInt();
       System.out.println("Seteaza valoarea pentru u:");
       int u = scanner.nextInt();
       int suma = t + u;
       System.out.println("Suma numerelor este " +suma);






   }
}

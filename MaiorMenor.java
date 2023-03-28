import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Informe o valor de X: ");
      int x = sc.nextInt();
      System.out.print("Informe o valor de y: ");
      int y = sc.nextInt();
      
      boolean igual = x == y;
      boolean diferente = x != y;
      boolean maiorque = x > y;
      boolean maiorigual = x >= y;
      boolean menorque = x < y;
      boolean menorigual = x <= y;
      
      System.out.println("O valor " + x + " é igual ao valor de " + y + "? " + igual);
      System.out.println("O valor " + x + " é diferente do valor de " + y + "? " + diferente);
      System.out.println("O valor " + x + " é maior que o valor de " + y + "? " + maiorque);
      System.out.println("O valor " + x + " é maior ou igual ao valor de " + y + "? " + maiorigual);
      System.out.println("O valor " + x + " é menor que o valor de " + y + "? " + menorque);
      System.out.println("O valor " + x + " é menor ou igual ao valor de " + y + "? " + menorigual);
    }
}
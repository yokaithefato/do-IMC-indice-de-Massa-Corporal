
package imc.pkgdo.senaco;

 import java.util.Scanner;

public class ImcDoSenaco {

    
    public static void main(String[] args) {
        
          Scanner sc = new Scanner (System.in);
     
          System.out.println("informe a altura do cidadao colega");   
  double a = sc.nextDouble();
  
  double A = a*a;
  
  System.out.println("informe o peso");
  double P = sc.nextDouble();
  
  double IMC = P/A;
  
  System.out.println("o peso do cidadao e " + IMC);
  

          
    }
    
}

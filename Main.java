import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, p, areaX, areaY;

        System.out.println("Entre as medidas do triângulo X");
        xA = ler.nextDouble();
        xB = ler.nextDouble();
        xC = ler.nextDouble();

        System.out.println("Entre as medidas do triângulo Y");
        yA = ler.nextDouble();
        yB = ler.nextDouble();
        yC = ler.nextDouble();

        /* calculo area de X */
        p = (xA + xB + xC) / 2;
        areaX = Math.sqrt( p * (p -xA) * (p - xB) * (p - xC));

        /* calculo area de Y */
        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt( p * (p -yA) * (p - yB) * (p - yC));

        System.out.println("A area do triângulo X é:" + areaX);
        System.out.println("A area do triângulo Y é:" + areaY);

        if(areaX > areaY){
            System.out.println("A area de X é maior");
        } else {
            System.out.println("A area de Y é maior");
        }
    }
}
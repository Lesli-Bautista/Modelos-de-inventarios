import java,util.Scanner;
//Modelos de inventarios
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion,L,n;
        double y, D, h,le,t0,k,TCU;
        System.out.println(" Modelos de inventarios");
        System.out.println(" \n \n \tMenu");
        System.out.println("1. Modelo CUQ Clasico");
        System.out.println("2.Modelos de inventario con descuento");
        System.out.println("3.Salir");
        System.out.println("Escribe una pcion: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1-> {
                System.out.println("Modelo CUQ Clasico");
                System.out.println("Ingrese el costo del pedido (K)");
                k= scanner.nextDouble ();
                System.out.println("Ingrese el indice de la demanda (D) ");
                D= scanner.nextDouble ();
                System.out.println("Ingrese el costo de almacenamiento (h)");
                h= scanner.nextDouble ();
                System.out.println("Ingrese el tiempo de entrega del pedido (L)");
                L= scanner.nextInt();
                y= Math.sqrt((2*k*D)/h);
                t0= y/D;
                n=(int ) (L/t0);
                le=L-n*t0;
                TCU=(k/y/D)+(h*(y/2));
                System.out.println("Costo total del inventario (TCU): " + TCU);
            }
            case 2-> {

            }
            case 3-> {
                System.out.println("Salir");
            }
        }

    }
}
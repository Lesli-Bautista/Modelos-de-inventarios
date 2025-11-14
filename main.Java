import java,util.Scanner;
//Modelos de inventarios
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion,L,n;
        double y, D, h,le,k,TCU,t0;
        do{
            System.out.println(" Modelos de inventarios");
            System.out.println(" \n \n \tMenu");
            System.out.println("1. Modelo CUQ Clasico");
            System.out.println("2.Modelos de inventario con descuento");
            System.out.println("3.Salir");
            System.out.println("Escribe una pcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1-> {
                    System.out.println("Modelo de inventario EUQ Clasico");
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.println("\n");
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
                    PDR=le*D;
                    TCU = (D / y) * k + (y / 2) * h;
                    System.out.println("\n");
                    System.out.println("Resultados del problema");
                    System.out.println("Cantidad optima de pedido (y): " + y);
                    System.out.println("Tiempo entre pedidos (t0): " + t0);
                    System.out.println("Punto de reorden : " + PDR);
                    System.out.println("Costo total del inventario (TCU): " + TCU);
                    System.out.println("\n");
                    System.out.println("Pedir " + (int) y + " unidades cada " + (int) t0 + " dias, o cuando el nivel de inventario llegue a " + (int) PDR + " unidades.");
                }
                case 2-> {
                    double i,demanda,K,H,l,CC,CO,CM;
                    int n;
                    System.out.println("Modelo de inventario con descuento");
                    System.out.println("Ingrese el costo del pedido (K)");
                    K = scanner.nextDouble ();
                    System.out.println("Ingrese el indice de la demanda (D) ");
                    demanda = scanner.nextDouble ();
                    System.out.println("Ingrese el costo de almacenamiento (h)");
                    H = scanner.nextDouble ();
                    System.out.println("Ingrese el tiempo de entrega del pedido (L)");
                    l = scanner.nextInt();
                    System.out.println("Ingrese el descuento de almacenamiento (i) (ej: 0.12)");
                    i = scanner.nextDouble ();
                    System.out.println("Ingrese el numero de niveles de descuento");
                    nivel = scanner.nextInt();
                    double[] precios = new double[nivel];
                    for (n = 0; n < nivel; n++) {
                        System.out.println("Ingrese el precio para el nivel " + (n + 1));
                        precios[n] = scanner.nextDouble();
                    }
                }
                case 3-> {
                    System.out.println("Salir");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }  
            }      
        }while (opcion != 3) ;
    }

}
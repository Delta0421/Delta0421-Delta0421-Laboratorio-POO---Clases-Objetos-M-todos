import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        BilleteraParque billetera1 = new BilleteraParque(100);
        boolean running = true;
        while(running) {
            
            System.out.println("==Administrador de billeteras para parques temáticos==");
            System.out.println("1. Agregar tickets");
            System.out.println("2. Establecer tickets");
            System.out.println("3. Comprar premio");
            System.out.println("4. Establecer festivo");
            System.out.println("5. Salir");
            System.out.println("Tu billetera tiene " + billetera1.getTickets() + " boletos");

            System.out.println("Ingrese la opción: ");
            Scanner inputScanner = new Scanner(System.in);
            int input = inputScanner.nextInt();

            switch(input){
                case 1:
                    System.out.println("¿Cuántos boletos se desea agregar");

                    Scanner inputScannerTickets = new Scanner(System.in);
                    int inputTickets = inputScannerTickets.nextInt();

                    billetera1.agregarTickets(inputTickets);
                    break;

                case 2:
                    System.out.println("Establecer saldo de tickets en: ");

                    Scanner inputScannerSetTickets = new Scanner(System.in);
                    int inputSetTickets = inputScannerSetTickets.nextInt();

                    billetera1.setTickets(inputSetTickets);
                    break;

                case 3:
                    System.out.println("1. Camiseta (150 tickets)");
                    System.out.println("2. Sombrero (350 tickets)");
                    System.out.println("3. Tenis (600 tickets)");
                    System.out.println("¿Qué premio desea comprar?");

                    Scanner inputScannerPremio = new Scanner(System.in);
                    int inputPremio = inputScannerPremio.nextInt();

                    switch(inputPremio){
                        case 1:
                            if (inputPremio < 150){break;}
                            billetera1.removerTickets(150);
                            break;
                        case 2:
                            billetera1.removerTickets(350);
                            break;
                        case 3:
                            billetera1.removerTickets(600);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa...");
                        running = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;


            }
        }

    }
}

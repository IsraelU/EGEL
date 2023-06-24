import java.util.*;
public class cajeroAutomatico {
    
    private static int pin_correcto = 1234;
    private static double saldo_inicial = 500.00;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    int intentos = 0;
        System.out.println("\033[42m" +"BIENVENIDO AL CAJERO AUTOMATICO");
        
        while (intentos<3){
            System.out.println("POR FAVOR, INGRESE SU PIN: ");
            int pin_ingresado=sc.nextInt();
            
            
            if(pin_ingresado == pin_correcto){
                mostrarMenu(sc);
                return;
            }else{
                intentos ++;
                System.out.println("\n");
                System.out.println("\033[41m PIN INCORRECTO, INTENTO: " +intentos);
            }
            
            
        }//FIN WHILE
        System.out.println("HA EXCEDIDO EL NUMERO MAXIMO DE INTENTOS 😡");
            System.out.println("EL PROGRAMA SE CERRARA");
        
    }
    
    public static void mostrarMenu(Scanner sc){
        
        while(true){
            System.out.println("\n");
            System.out.println("\033[42m ******\t  MENU PRINCIPAL ******");
            System.out.println("1.- CONSULTAR SALDO");
            System.out.println("2.- RETIRAR SALDO");
            System.out.println("3.- SALIR");
            System.out.println("\nSELECIONE UNA OPCION");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                
                case 1: consultaSaldo();
                break;
                
                case 2: retirarSaldo(sc);
                break;
                
                case 3: 
                    System.out.println("\n");
                    System.out.println(" \033[46m 😁 GRACIAS POR SU VISITA 😁");
                return;
                
                default: System.out.println("\033[41m OPCION INVALIDA, SELECCIONE NUEVAMENTE");
                System.out.println("\n");
                break;
                
                
            }
        }
        
    }
    
    public static void consultaSaldo(){
        System.out.println("\n");
        System.out.println("\033[43m SU SALDO ACTUAL ES: $" +saldo_inicial);
    }
    
    public static void retirarSaldo(Scanner sc){
        System.out.println("\n");
        System.out.println(" \033[42m INGRESE LA CANTIDAD A RETIRAR: ");
        double cantidad = sc.nextDouble();
        
        if(cantidad > saldo_inicial){
            System.out.println("\n");
            System.out.println("\033[41m NO CUENTAS CON SUFICIENTES FONDOS");
            System.out.println("\n");
            System.out.println("1.- REGRESAR AL MENU PRINCIPAL");
            System.out.println("2.- SALIR");
            System.out.println("\nSELECIONE UNA OPCION");
            System.out.println("\n");
            
            int opcion = sc.nextInt();
            
            if(opcion == 1){
                return;
            }else if(opcion == 2){
                System.out.println(" \033[46m 😁 GRACIAS POR UTILIZAR NUESTROS SERVICIOS 😁");
                System.exit(0);
            }else{
                System.out.println("\033[41m OPCION INVALIDA, EL PROGRAMA SE CERRARA");
                System.exit(0);
            }
            
        }else{
            saldo_inicial = saldo_inicial - cantidad;
            System.out.println("\n");
            System.out.println("\033[43m RETIRO EXITOSO, SU SALDO ACTUAL ES DE: $"+saldo_inicial);
        }
        
    }


    
}//FIN MAIN


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDeMoneda consulta = new ConsultaDeMoneda();

        int opcion = 0;

        while (opcion != 9) {

            System.out.println("-----------------------------------------------");
            System.out.println("Bienvenido/a al conversor de monedas");
            System.out.println("-----------------------------------------------");
            System.out.println(" Lista de conversiones: \n");
            System.out.println("1) Dolar --> Peso Argentino");
            System.out.println("2) Peso Argentino --> Dolar");
            System.out.println("3) Dolar --> Real Brasileño");
            System.out.println("4) Real Brasileño --> Dolar");
            System.out.println("5) Dolar --> Peso Colombiano");
            System.out.println("6) Peso Colombiano --> Dolar");
            System.out.println("7) Dolar --> Peso Méxicano");
            System.out.println("8) Peso Méxicano --> Dolar");
            System.out.println("9) Salir \n");
            System.out.println(" Ingrese la opción deseada: ");

            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {
                    case 1:
                        ConversorDeMoneda.convertir("USD", "ARS", consulta, lectura);
                        break;
                    case 2:
                        ConversorDeMoneda.convertir("ARS", "USD", consulta, lectura);
                        break;
                    case 3:
                        ConversorDeMoneda.convertir("USD", "BRL", consulta, lectura);
                        break;
                    case 4:
                        ConversorDeMoneda.convertir("BRL", "USD", consulta, lectura);
                        break;
                    case 5:
                        ConversorDeMoneda.convertir("USD", "COP", consulta, lectura);
                        break;
                    case 6:
                        ConversorDeMoneda.convertir("COP", "USD", consulta, lectura);
                        break;
                    case 7:
                        ConversorDeMoneda.convertir("USD", "MXN", consulta, lectura);
                        break;
                    case 8:
                        ConversorDeMoneda.convertir("MXN", "USD", consulta, lectura);
                        break;
                    case 9:
                        System.out.println("Saliendo..");
                        break;
                }
            }  catch (Exception e) {  //Captura cualquier excepción
                System.out.println("(Error: ingresa solamente numeros)");
                lectura.nextLine(); // Limpiar el buffer, evita que coloquemos un break y se cierre la app



            }
        }
    }
}

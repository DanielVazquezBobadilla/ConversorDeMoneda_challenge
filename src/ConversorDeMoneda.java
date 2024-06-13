import java.util.Scanner;

public class ConversorDeMoneda {

    public static void convertir(String monedaBase, String monedaDeseada, ConsultaDeMoneda consulta, Scanner lectura){
        double valor;
        double valorConvertido;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaDeseada); //// Manda a llamar el método buscarMoneda para obtener las tasas de conversión entre las dos monedas

        System.out.println("Ingrese el valor que desea convertir de " + monedaBase + " a " + monedaDeseada);
        valor = Double.parseDouble(lectura.nextLine());
        valorConvertido = valor * monedas.conversion_rate();
        System.out.println("El valor de " + valor + " " + monedaBase + " corresponde al valor final de --> " + valorConvertido + " " + monedas.target_code());

    }
}

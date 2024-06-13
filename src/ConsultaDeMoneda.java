import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaDeMoneda {

    public Monedas buscarMoneda(String monedaBase, String monedaDeseada){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/cee9d958603dd039e04e30cd/pair/"+monedaBase+"/"+ monedaDeseada);
        HttpClient client = HttpClient.newHttpClient();  // Crea un cliente HTTP
        HttpRequest request = HttpRequest.newBuilder() //Construye la solicitud HTTP
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class); // Convierte el cuerpo de la respuesta JSON a un objeto Monedas con Gson
        }
        catch (Exception e){
            throw new RuntimeException("No logre encontrar la Moneda");
        }
    }
}


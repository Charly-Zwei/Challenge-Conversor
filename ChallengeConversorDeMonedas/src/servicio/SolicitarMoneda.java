package servicio;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitarMoneda {
    public Moneda investigarMoneda(String monedaBase, String monedaFin){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/bd6b1540ca07d00aa21d9249/pair/" + monedaBase + "/" + monedaFin);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e){
            throw new RuntimeException("No se pudo encontrar");
        }
    }
}

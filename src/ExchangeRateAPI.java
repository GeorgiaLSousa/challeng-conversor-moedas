import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ExchangeRateAPI {
    private static final String API_KEY = "1ed324ff84370136ba9a8bfe";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        String urlString = API_URL + baseCurrency;
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject jsonResponse = jsonReader.readObject();
        jsonReader.close();
        reader.close();

        JsonObject rates = jsonResponse.getJsonObject("conversion_rates");

        return rates.getJsonNumber(targetCurrency).doubleValue();
    }
}
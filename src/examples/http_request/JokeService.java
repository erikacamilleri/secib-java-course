package examples.http_request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JokeService {
    
    public String getInfo() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://jokeapi-v2.p.rapidapi.com/info?format=json"))
		.header("X-RapidAPI-Key", "9b0a41b783mshc2b3f892cf1daebp197aa5jsnf26dd384f70b")
		.header("X-RapidAPI-Host", "jokeapi-v2.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
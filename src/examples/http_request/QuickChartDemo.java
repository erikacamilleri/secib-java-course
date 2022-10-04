package examples.http_request;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpClient;
import java.net.URISyntaxException;

public class QuickChartDemo {
    public static void main(String[] args) {
        
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(new URI("https://quickchart.io/chart"))
            .version(HttpClient.Version.HTTP_2)
            .headers("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString("{ type:'bar',data:{ labels:[2012,2013,2014,2015,2016], datasets:[{label:'Users',data:[120,60,50,180,120]}]}}"))
            .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (URISyntaxException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {

        } catch (Exception e) {
            System.out.println("here");
            e.printStackTrace();
        }

        System.out.println("here2");
    }
}

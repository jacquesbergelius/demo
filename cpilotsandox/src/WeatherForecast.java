// create a class which retrieves the weather forecast for a given city
//
// The class should have a constructor which takes a city name as a parameter
// and a method which returns the weather forecast for the given city.
//
// The weather forecast should be retrieved from the following URL:
// http://api.openweathermap.org/data/2.5/weather?q=<city name>&appid=<your api key>
//
// You can get an API key by registering at https://openweathermap.org/api
//
// The weather forecast should be returned as a string in the following format:
// "The weather forecast for <city name> is <weather description> with a temperature of <temperature> degrees Celsius."
//

import java.net.*;
import java.io.*;
import java.util.*;

// get a file from the network
public class WeatherForecast {
    private String city;
    private String weather;
    private double temperature;

    public WeatherForecast(String city) {
        this.city = city;
    }

    public String getWeather() {
        return this.weather;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void retrieveWeather() {
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + this.city + "&appid=6c5b0b2b0b0b0b0b0b0b0b0b0b0b0b0b");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int responseCode = con.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Error: " + responseCode);
            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                con.disconnect();

                String json = content.toString();
                int start = json.indexOf("description") + 15;
                int end = json.indexOf("\",", start);
                this.weather = json.substring(start, end);

                start = json.indexOf("temp") + 6;
                end = json.indexOf(",", start);
                this.temperature = Double.parseDouble(json.substring(start, end)) - 273.15;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        WeatherForecast wf = new WeatherForecast("London");
        wf.retrieveWeather();
    }
}



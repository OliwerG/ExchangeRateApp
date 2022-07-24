package pl.kurs.exchangerateapp.config;

public interface AppConfig {

    //https://api.fastforex.io/fetch-all?from=USD&api_key=8b7e286a0a-bd5acbcbc0-rfiyxm
    String BASE_HTTP = "/https://api.fastforex.io";
    String ENDPOINT = "/fetch-all?from=";
    String PRIVATE_API_KEY = "&api_key=8b7e286a0a-bd5acbcbc0-rfiyxm";

}

package starter;

public enum WebServiceEndPoints {
//    STATUS("http://localhost:8083/api/status"),
//    TRADE("http://localhost:8083/api/trade");
    STATUS("https://demo.meddbase.com/patientportalapi/auth/server-state"),
    TRADE("http://localhost:8083/api/trade");

    private final String url;

    WebServiceEndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

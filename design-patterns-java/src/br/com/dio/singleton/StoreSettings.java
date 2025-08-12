package br.com.dio.singleton;

public class StoreSettings {
    private static StoreSettings instance;
    private String paymentApiUrl;
    private String emailServiceApiKey;

    private StoreSettings() {
        this.paymentApiUrl = "https://api.store.com/payment";
        this.emailServiceApiKey = "chave_secreta_do_email";
    }
    public static StoreSettings getInstance() {
        if (instance == null) {
            instance = new StoreSettings();
        }
        return instance;
    }
    public String getPaymentApiUrl() {
        return paymentApiUrl;
    }
    public String getEmailServiceApiKey() {
        return emailServiceApiKey;
    }
}

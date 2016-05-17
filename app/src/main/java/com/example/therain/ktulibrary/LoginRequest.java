package com.example.therain.ktulibrary;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class LoginRequest extends StringRequest {
    //Giriş isteklerinin alındığı link tanımlamaları
    private static final String LOGIN_REQUEST_URL = "http://kutuphaneveri.netau.net/Register.php";//Kutuphane Veri Tabanı
    private Map<String, String> params;


    //Constructor Tanımı--- Login
    public LoginRequest(String username, String password, Response.Listener<String> listener) {

        // Burada projedeki parametreleri database içindeki parametrelere setliyoruz. Giriş işlemleri
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

package com.example.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency") //Bu alan gelen datayla aynı olmak zorunda
    public String currency; //Bu alan gelen datayla farklı isimde olabilir
    @SerializedName("price")
    public String price;

}

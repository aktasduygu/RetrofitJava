package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //get, post, update, delete
    //URL BASE -> www.website.com
    //GET -> price?key=xxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json


    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

        //io.reactivex olanı seçtik
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();


}

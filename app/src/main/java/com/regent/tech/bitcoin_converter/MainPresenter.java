package com.regent.tech.bitcoin_converter;

import android.support.annotation.NonNull;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 11/11/17.
 */

class MainPresenter {
    private MainActivity activity;
    private MainPreference preference;
    public static final String TAG = "MainPresenter";

    MainPresenter(MainActivity activity){
        this.activity = activity;
        this.preference = new MainPreference(activity);
    }

    private Retrofit getRetroInstance(){
        return new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    void updateCardRate(final Card card){
        MainService service = getRetroInstance().create(MainService.class);
        service.exchangeRate(card.getCryptoSymbol(), card.getOtherSymbol())
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(@NonNull Call<ResponseBody> call,
                                           @NonNull Response<ResponseBody> response) {
                        try{
                            JSONObject object = new JSONObject(response.body().string());
                            double rate = object.getDouble(card.getOtherSymbol());
                            Log.d(TAG, "Rate received - " + rate);
                            card.setExchangeRate(rate);
                            activity.addCardToView(card);
                            preference.addCard(card);
                        } catch (JSONException e){
                            e.printStackTrace();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
    }

    List<Card> getAllCards(){
        return preference.getCardList();
    }
}

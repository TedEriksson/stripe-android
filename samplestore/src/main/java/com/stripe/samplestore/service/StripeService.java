package com.stripe.samplestore.service;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * The {@link retrofit2.Retrofit} interface that creates our API service.
 */
public interface StripeService {

    // For simplicity, we have URL encoded our body data, but your code will likely
    // want a model class send up as JSON
    @FormUrlEncoded
    @POST("create_charge")
    Observable<Void> createQueryCharge(
            @Field("amount") long amount,
            @Field("source") String source);

    @FormUrlEncoded
    @POST("ephemeral_keys")
    Observable<ResponseBody> createEphemeralKey(@FieldMap Map<String, String> apiVersionMap);
}

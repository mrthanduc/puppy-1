package com.honguyenthaonguyen.recyclerviewdemo.service;

import com.honguyenthaonguyen.recyclerviewdemo.productcategorymodel.ProductCategoryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NGUYEN on 5/31/2016.
 */
public interface WooCommerceService {
    @GET("products/categories")
    Call<ProductCategoryResponse> getProductCategoryList();
}

package com.example.la_naranjita.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.la_naranjita.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_home, container, false);

    }
}

//package com.example.la_naranjita.fragments;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.fragment.app.Fragment;
//import androidx.viewpager2.widget.ViewPager2;
//
//import com.example.la_naranjita.R;
//import com.example.la_naranjita.api.ApiService;
//import com.example.la_naranjita.api.RetrofitClient;
//import com.example.la_naranjita.models.ImageResponse;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class HomeFragment extends Fragment {
//
//    private ImageAdapter imageAdapter;
//    private ApiService apiService;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//
//        ViewPager2 viewPager = rootView.findViewById(R.id.viewPager);
//        imageAdapter = new ImageAdapter();
//        viewPager.setAdapter(imageAdapter);
//
//        apiService = RetrofitClient.getRetrofit().create(ApiService.class);
//        loadImagesFromApi();
//
//        return rootView;
//    }
//
//    private void loadImagesFromApi() {
//        Call<ImageResponse> call = apiService.getImages(); // Ajusta esto según tu API
//        call.enqueue(new Callback<ImageResponse>() {
//            @Override
//            public void onResponse(Call<ImageResponse> call, Response<ImageResponse> response) {
//                if (response.isSuccessful() && response.body() != null) {
//                    ImageResponse imageResponse = response.body();
//                    imageAdapter.setImageUrls(imageResponse.getImageUrls());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ImageResponse> call, Throwable t) {
//                // Maneja la falla en la solicitud a la API
//            }
//        });
//    }
//}
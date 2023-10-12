//package com.example.mobilelearning.Kursus;
//
//import android.view.KeyEvent;
//import android.view.Window;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.mobilelearning.Mobile_config.ApiInterface;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class KursusService extends AppCompatActivity {
//    private ApiInterface apiInterface;
//
//
//    public void getKursusById(String idJurusan, String userId, Callback<KursusActivity> callback) {
//        Call<KursusResponse> call = apiInterface.getKursus(idJurusan, userId);
//        call.enqueue(new Callback<KursusResponse>() {
//            @Override
//            public void onResponse(Call<KursusResponse> call, Response<KursusResponse> response) {
//                if (response.isSuccessful()) {
//                    KursusActivity kursusActivity = response.body().getData();
//                    //callback.onResponse( kursusActivity);
//                } else{
//                    Toast.makeText(KursusService.this, response.toString(),Toast.LENGTH_SHORT).show();
////                    callback.onFailure(new Exception("Failed to get kursus data"));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<KursusResponse> call, Throwable t) {
////                callback.onFailure (t);
//            }
//        });
//    }
//
//    public void getKursusData(String userId, String idJurusan) {
//
//        ApiInterface apiInterface = ApiInterface.getClient().create(ApiInterface.class);
//
//        Call<KursusResponse> call = apiInterface.getKursus(idJurusan, userId);
//
//        call.enqueue(new Callback<KursusResponse>() {
//            @Override
//            public void onResponse(Call<KursusResponse> call, Response<KursusResponse> response) {
//
//                if (response.isSuccessful()) {
//                    KursusResponse kursusResponse = response.body();
//                    if (kursusResponse != null && kursusResponse.getStatus()) {
//                        List<KursusModel> kursusList = (List<KursusModel>) kursusResponse.getData();
//                        // handle data kursus
//                    } else {
//                        // response status false
//                    }
//                } else {
//                    // response not successful
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<KursusResponse> call, Throwable t) {
//                // network failure
//            }
//        });
//    }
//
//}

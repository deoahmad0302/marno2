package com.example.mobilelearning.Auth;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilelearning.Kursus.KursusListAdapter;
import com.example.mobilelearning.Mobile_config.ApiInterface;
import com.example.mobilelearning.Mobile_config.ApiServer;
import com.example.mobilelearning.R;
import com.example.mobilelearning.response.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {
    private EditText et_username, et_password;
    private Button btn_login;
    String username,password;
    Integer idUser, idCategory;

    private ApiInterface apiInterface;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et_username = (EditText) findViewById(R.id.uname);
        et_password = (EditText)  findViewById(R.id.passwd);
        btn_login = (Button) findViewById(R.id.login);

        btn_login.setOnClickListener(view -> {
            username= et_username.getText().toString().trim();
            password= et_password.getText().toString().trim();
            if (username.equals("")){
                et_username.setError("Masukkan User Anda");
            } else if (password.equals("")) {
                et_password.setError("Masukkan Password Anda");

            }else {
                Login();
            }
        });
    }

    private void Login() {
        apiInterface = ApiServer.getClient().create(ApiInterface.class);
        apiInterface.loginUser(username,password).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    if (loginResponse.isSuccess()) {
                        String token = loginResponse.getData().getToken();
                        int userId = loginResponse.getData().getUserId();

                        System.out.println(token);
                        System.out.println(userId);
                        Intent a = new Intent(Login.this, KursusListAdapter.class);
                        a.putExtra("id_user",userId);
                        a.putExtra("token",token);
                        startActivity(a);
                    } else {
                        String errorMessage = loginResponse.getMessage();
                        // TODO: Show error message to the user
                    }
                } else {
                    // TODO: Show error message to the user
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });
    }


}

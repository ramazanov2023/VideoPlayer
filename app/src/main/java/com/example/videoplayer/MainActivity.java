package com.example.videoplayer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements UserAction {
    AuthorizationFragment authorization;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authorization = new AuthorizationFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_authorization_container, authorization)
                .commit();

    }

    @Override
    public void setAction(int action) {
        switch (action) {
            case CLOSE_AUTHORIZATION:
                if (authorization != null) {
                    getSupportFragmentManager().beginTransaction()
                            .hide(authorization)
                            .commit();

                }
                break;
        }
    }
}

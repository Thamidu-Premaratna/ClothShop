//IM/2020/109 - started
package com.app.clothshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        Button mBtn = findViewById(R.id.mainBtn);
        mBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
              startActivity(new Intent(FlashActivity.this,HomeActivity.class));
            }
        });
    }
}
//IM/2020/109 - stopped
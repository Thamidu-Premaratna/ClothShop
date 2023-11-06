//IM/2020/022 -started
package com.app.clothshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.clothshop.HomeFragment;
import com.google.android.material.bottomappbar.BottomAppBar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get the FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Begin a new FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the container with the HomeFragment
        fragmentTransaction.replace(R.id.container_Id, new HomeFragment()).commit();

        //bottom nav

//        BottomAppBar bottomAppBar = findViewById(R.id.app_bar);
//        ImageView imgHome = findViewById(R.id.img_home);
//        TextView txtHome = findViewById(R.id.txt_home);
//        ImageView imgCategories = findViewById(R.id.img_category);
//        TextView txtCategories = findViewById(R.id.txt_category);
//        ImageView imgCart = findViewById(R.id.img_cart);
//        TextView txtCart = findViewById(R.id.txt_cart);
//        ImageView imgProfile = findViewById(R.id.img_profile);
//        TextView txtProfile = findViewById(R.id.txt_profile);
//
//        imgHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, HomeActivity.class));
//            }
//        });
//
//        txtHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, HomeActivity.class));
//            }
//        });
//
//        imgCategories.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, CategoryActivity.class));
//            }
//        });
//
//        txtCategories.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, CategoryActivity.class));
//            }
//        });
//
//        imgCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, CartActivity.class));
//            }
//        });
//
//        txtCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, CartActivity.class));
//            }
//        });
//
//        imgProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
//            }
//        });
//
//        txtProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
//            }
//        });
//    }


//    public void signin(View view) {
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
//    }
//}
    }


}

//IM/2020/022- ended
package com.example.hopeinhome;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import com.example.hopeinhome.ui.about_us.AboutUsViewModel;
import com.example.hopeinhome.ui.about_us.about_us;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hopeinhome.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;


//    ClipData.Item aboutus;
//    Button aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Intent intent = getIntent();
//        String input_username1 = intent.getStringExtra(LoginActivity.MSG);
//        TextView textView = findViewById(R.id.user);
//        textView.setText(input_username1);
//
//        String mail_of_user = input_username1 +"@gmail.com";
//        TextView textview2 = findViewById(R.id.usermail);
//        textview2.setText(mail_of_user);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.messengerBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(getApplicationContext(),MessangerBot.class);
//                intent.putExtra("data","alone");
                startActivity(intent);
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

//        Intent intent = getIntent();
//        String input_username1 = intent.getStringExtra(LoginActivity.MSG);
//        TextView textView = findViewById(R.id.user);
//        textView.setText(input_username1);
//
//        String mail_of_user = input_username1 +"@gmail.com";
//        TextView textview2 = findViewById(R.id.usermail);
//        textview2.setText(mail_of_user);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_vaccination, R.id.nav_meditation_audio_tracks,R.id.nav_shop_by_category, R.id.nav_videos,R.id.nav_manage_payment,R.id.nav_refer_and_earn,R.id.nav_emergency
        ,R.id.nav_find_substitute,R.id.nav_order_with_prescription,R.id.nav_pill_reminder,R.id.nav_consult_online,R.id.nav_find_doctors,R.id.nav_my_appointments,
                R.id.nav_book_lab_tests,R.id.nav_view_all,R.id.nav_bookmarks,R.id.nav_need_help,R.id.nav_settings,R.id.nav_about_us)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
//        aboutus = getBaseContext().findViewById(R.id.action_about_us);
//        aboutus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gotoUrl("https://www.instagram.com/yashgajalwar/");
//            }
//        });

//        aboutus = findViewById(R.id.action_about_us_button);

        return true;
    }
//    public void aboutusfunc(MenuItem menuItem){
//        Intent intent = new Intent(this, about_us.class);
//        startActivity(intent);
//        Fragment fragment = new TestFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();


//    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.action_settings:
            // User chose the "Settings" item, show the app settings UI...
                return true;

             case R.id.action_add_another_account:
            // User chose the "Favorite" action, mark the current item
            // as a favorite...
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);

                return true;
             case R.id.action_log_out:
                 // User chose the "Favorite" action, mark the current item
                 // as a favorite...
                 Intent intent2 = new Intent(this,LoginActivity.class);
                 startActivity(intent2);
                 return true;
             case R.id.action_about_us:
                 // User chose the "Favorite" action, mark the current item
                 // as a favorite...
                 Intent intent3 = new Intent(this, about_us_activity.class);
                 startActivity(intent3);

                 return true;
            default:
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            return super.onOptionsItemSelected(item);

        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
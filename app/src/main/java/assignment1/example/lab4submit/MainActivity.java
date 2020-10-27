package assignment1.example.lab4submit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    public Button but;
    public Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        but = (Button) findViewById(R.id.button);
        but1 = (Button) findViewById(R.id.button1);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,betactivity.class);
                startActivity(intent);
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Search.class);
                startActivity(intent);
            }
        });


        //In and Assign Va
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomlab4);

        //Set Home Select
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Proform Item Select
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
                switch (menuitem.getItemId()){
                    case R.id.home:

                        return true;
                    case R.id.list:
                        startActivity(new Intent(getApplicationContext()
                                ,betactivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext()
                                ,favorite.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext()
                                ,Search.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }


}
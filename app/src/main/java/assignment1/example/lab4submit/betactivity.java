package assignment1.example.lab4submit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class betactivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_betactivity);

        String[] sports = getResources().getStringArray(R.array.betlist);

        listView = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList= new ArrayList<>();



        //Row layout defined by Android: android.R.layout.simple_list_item_1
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, sports));



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
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0, 0);
                        return false;
                    case R.id.list:
                        return false;
                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext()
                                ,favorite.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext()
                                ,Search.class));
                        overridePendingTransition(0, 0);
                        return false;
                }
                return false;
            }
        });
    }



}
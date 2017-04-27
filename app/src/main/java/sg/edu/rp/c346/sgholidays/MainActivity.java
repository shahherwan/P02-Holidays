package sg.edu.rp.c346.sgholidays;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;
    String[] typeArray = {"Secular"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitle = (TextView)findViewById(R.id.tvTitle);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.simple_listview, typeArray);

        ListView listView = (ListView) findViewById(R.id.type_list);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,typeArray));

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}

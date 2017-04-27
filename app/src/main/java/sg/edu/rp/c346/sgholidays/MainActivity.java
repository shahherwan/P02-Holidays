package sg.edu.rp.c346.sgholidays;

import android.app.Activity;
import android.content.Intent;
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

    // Create ArrayList & ArrayAdapter
    TextView tvTitle;
    ArrayList<String> alCategory;
    ArrayAdapter<String> aaCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitle = (TextView)findViewById(R.id.tvTitle);
        ListView listView = (ListView) findViewById(R.id.type_list);

        //Name ArrayList<String> as alCategory
        alCategory = new ArrayList<String>();
        // Add ONLY String into ArrayList
        alCategory.add("Secular");

        //this = MainActiviy.java | simple_list_item_1 = example of simple layout | alCategory = ArrayList<String>
        aaCategory = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alCategory);

        // set ArrayAdapter inside the listView
        listView.setAdapter(aaCategory);

        // Instead of OnSetListener, Change this to setOnItemClickListener because using ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // ???
                // Why getBaseContext() instead of MainActivity.this
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                //Pass the data to the ListActivity |title => Its a variable for intent| typeArray[position] means it start from 0 and it will pass the String to the next activity
                intent.putExtra("title", alCategory.get(position));

                // Starts TargetActivity
                startActivity(intent);
            }
        });



    }
}

package sg.edu.rp.c346.sgholidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
/**
 * Created by 14049561 on 27/4/2017.
 */

public class ListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // objects can be retrieved from database
        ArrayList<ClassName> objects = ...;
        // Create the ArrayAdapter object.
        ClassNameArrayAdapter adapter =
                new ClassNameArrayAdapter(this, R.layout.row, objects);
        ListView lv = (ListView) findViewById(R.id.lvFood);
        lv.setAdapter(adapter);
    }



}

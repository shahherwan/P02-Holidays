package sg.edu.rp.c346.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 14049561 on 27/4/2017.
 */

public class SecondActivity extends AppCompatActivity{

    TextView tvTitle2;
    ListView lvHoliday;
    ArrayAdapter<holiday> aaHoliday;
    ArrayList<holiday> alHoliday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvTitle2 = (TextView)findViewById(R.id.tvTitle2);

        // Get the intent from the first activity
        Intent intentReceived = getIntent();
        // Retrieve this from MainActivity intent | take note of the variable u name!
        String strTitle = intentReceived.getStringExtra("title");
        // This displays the textview from MainActivity onto ListActivity
        tvTitle2.setText(strTitle);

        lvHoliday = (ListView)findViewById(R.id.lvHoliday);

        alHoliday = new ArrayList<holiday>();

        aaHoliday = new HolidayAdapterArray(this, R.layout.row, alHoliday);
        lvHoliday.setAdapter(aaHoliday);

        //Insert object from holiday class unlike in MainActivity where you called only String. TAKE NOTE!
        //Write xxx.add(new "Name of Object Class" (Argument eg: "xx", "xx", xx") Take note when putting argument, follow the sequence
        alHoliday.add(new holiday( "New Year's Day", "01 Jan 2017", "newyear"));
        alHoliday.add(new holiday( "Labour Day", "01 May 2017", "labourday"));

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                holiday selectedEvent = alHoliday.get(position);

                Toast.makeText(SecondActivity.this, selectedEvent.getName()
                                + " Date:" + selectedEvent.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });



    }



}
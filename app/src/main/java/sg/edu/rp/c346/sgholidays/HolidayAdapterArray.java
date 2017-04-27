package sg.edu.rp.c346.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 14049561 on 27/4/2017.
 */

public class HolidayAdapterArray extends ArrayAdapter<holiday> {

    private ArrayList<holiday> holiday;
    private Context context;
    private TextView tvDay;
    private TextView tvDate;
    private ImageView ivIcon;

    //ArrayList<holiday> has the day, date , image
    public HolidayAdapterArray(Context context, int resource, ArrayList<holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the TextView object
        tvDay = (TextView) rowView.findViewById(R.id.tvDay);
        // Get the ImageView object
        ivIcon = (ImageView) rowView.findViewById(R.id.ivIcon);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        holiday currentHoliday = holiday.get(position);
        // Set the TextView to show the Day & Date
        tvDay.setText(currentHoliday.getName());
        tvDate.setText(currentHoliday.getDate());
        if(currentHoliday.getImageView() == "labourday"){
            ivIcon.setImageResource(R.drawable.labourday);
        }
        else{
            ivIcon.setImageResource(R.drawable.newyear);
        }

        // Return the nicely done up View to the ListView
        return rowView;
    }




}

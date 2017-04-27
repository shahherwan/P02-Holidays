package sg.edu.rp.c346.sgholidays;

/**
 * Created by 14049561 on 27/4/2017.
 */

public class holiday {

    // Create the attributes for your class
    private String name;
    private String date;
    private String imageView;

    // Create the constructor to give your 	attributes values
    public holiday(String name, String date, String imageView) {
        this.name = name;
        this.date = date;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }
}

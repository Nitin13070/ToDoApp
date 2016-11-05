package courseassignment.nitin.todoapp;

import java.io.Serializable;

/**
 * Created by nitin on 11/4/2016.
 */

public class Item{
    private String title;
    private String detail;

    public Item(String title, String detail){
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }



    public String getDetail() {
        return detail;
    }

}

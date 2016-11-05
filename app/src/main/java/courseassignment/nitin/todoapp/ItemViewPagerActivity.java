package courseassignment.nitin.todoapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class ItemViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view_pager);
        List<Item> itemList = MainActivity.itemList;
        ViewPager viewPager = (ViewPager) findViewById(R.id.item_view_pager);
        viewPager.setAdapter(new CustomPageAdapter(this,itemList));
        viewPager.setCurrentItem(getIntent().getIntExtra("yoyo",0));
    }
}

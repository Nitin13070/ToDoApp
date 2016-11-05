package courseassignment.nitin.todoapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nitin on 11/5/2016.
 */
public class CustomPageAdapter extends PagerAdapter {

    private Context context;
    private List<Item> itemList;


    public CustomPageAdapter(Context context, List<Item> itemList){
        this.context = context;
        this.itemList = itemList;
    }



    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Item item = itemList.get(position);
        View layout = LayoutInflater.from(context).inflate(R.layout.item_view,container,false);
        TextView titleView = (TextView) layout.findViewById(R.id.item_view_title);
        TextView detailsView = (TextView) layout.findViewById(R.id.item_view_details);
        titleView.setText(item.getTitle());
        detailsView.setText(item.getDetail());
        container.addView(layout);

        return item;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return itemList.get(position).getTitle();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        TextView titleView = (TextView) view.findViewById(R.id.item_view_title);
        Item item = (Item) object;
        if(titleView.getText() == item.getTitle() ){
            return true;
        }
        return false;
    }
}

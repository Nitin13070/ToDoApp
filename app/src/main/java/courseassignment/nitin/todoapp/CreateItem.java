package courseassignment.nitin.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class CreateItem extends AppCompatActivity {


    private EditText titleEditText;
    private EditText detailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_item);
        titleEditText = (EditText) findViewById(R.id.input_title);
        detailEditText = (EditText) findViewById(R.id.input_detail);

    }

    public void addItem(View view){
        if(titleEditText.getText().toString().equals("")){
            titleEditText.setError("Please Enter Title");
            return;
        }
        if(detailEditText.getText().toString().equals("")){
            detailEditText.setError("Please Enter Details");
            return;
        }
        Item item = new Item(titleEditText.getText().toString(),detailEditText.getText().toString());
        MainActivity.itemList.add(item);
        finish();
    }
}

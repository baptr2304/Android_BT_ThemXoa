package com.example.listview_baitap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ListView listViewProduct;
    ArrayList<String> listProduct;
    Button btnAdd;
    EditText edtProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProduct =(ListView) findViewById(R.id.listproduct);
        btnAdd = (Button) findViewById(R.id.buttonAdd);
        edtProduct = (EditText) findViewById(R.id.editTextTextProduct);
        listProduct = new ArrayList<>();

        listProduct.add("Noodle");
        listProduct.add("Beefstake");
        listProduct.add("Sashimi");
        listProduct.add("Rice");
        listProduct.add("HotPot");

         ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listProduct);

         listViewProduct.setAdapter(adapter);

         btnAdd.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view){
                 String product = edtProduct.getText().toString();
                 listProduct.add(product);
                 adapter.notifyDataSetChanged();
             }
         });
    }
}
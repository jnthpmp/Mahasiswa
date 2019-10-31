package com.example.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {


    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.lvLoremlpsum);
        Spinner spinner = findViewById(R.id.spinnerprogmob);

        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,items));
        spinner.setAdapter(new ArrayAdapter<String>(ListActivity.this,R.layout.support_simple_spinner_dropdown_item,items));

        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);
aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner.setAdapter(aa);

spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListActivity.this,"Anda Memilih--"
        + items[1],Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(ListActivity.this,"Anda TIDAK Memilih--"
                ,Toast.LENGTH_SHORT).show();
    }
});
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int  position, long id) {
        Toast.makeText(ListActivity.this,"ANDA MEMILIH" + items[1],Toast.LENGTH_LONG).show();
    }
});

    }
}

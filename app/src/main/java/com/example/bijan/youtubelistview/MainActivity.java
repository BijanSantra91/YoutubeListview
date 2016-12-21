package com.example.bijan.youtubelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Csharp> ch;
    CsharpAdapter ca;

    public class CsharpAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return ch.size();
        }

        @Override
        public Object getItem(int i) {
            return ch.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            Csharp csharp = ch.get(i);
            View v = getLayoutInflater().inflate(R.layout.design, null);
            TextView tv1 = (TextView) v.findViewById(R.id.text1);
            TextView tv2 = (TextView) v.findViewById(R.id.text2);
            TextView tv3 = (TextView) v.findViewById(R.id.text3);
            TextView tv4 = (TextView) v.findViewById(R.id.text4);

            tv1.setText(csharp.getCourse());
            tv2.setText(csharp.getDuration());
            tv3.setText(csharp.getAssignment());
            tv4.setText(csharp.getTests());

            return  v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listview);
        ch = new ArrayList<>();
        ch.add(new Csharp("Csharp For Freshers","Duration : 37 hrs","Assignments : 14 hrs","Tests : 22 hrs"));
        ch.add(new Csharp("Csharp For Experience","Duration : 48 hrs","Assignments : 18 hrs","Tests : 29 hrs"));
        ch.add(new Csharp("SQL Server(t-sql)","Duration : 13 hrs","Assignments : 5 hrs","Tests : 12 hrs"));

        ca = new CsharpAdapter();

        lv.setAdapter(ca);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
                else if (i == 1){
                    Intent intent1 = new Intent(MainActivity.this, Main22Activity.class);
                    startActivity(intent1);
                }
                else if (i == 2){
                    Intent intent2 = new Intent(MainActivity.this, Main23Activity.class);
                    startActivity(intent2);
                }
            }
        });
    }
}

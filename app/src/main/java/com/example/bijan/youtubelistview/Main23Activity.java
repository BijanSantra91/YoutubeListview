package com.example.bijan.youtubelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main23Activity extends AppCompatActivity {

    ListView lv3;
    ArrayList<Csharp2> ch1;
    CsharpAdapter4 ca4;

    String id;

    public class CsharpAdapter4 extends BaseAdapter {

        @Override
        public int getCount() {
            return ch1.size();
        }

        @Override
        public Object getItem(int i) {
            return ch1.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Csharp2 csharp2 = ch1.get(i);
            final View v = getLayoutInflater().inflate(R.layout.layout2, null);
            TextView tv1 = (TextView) v.findViewById(R.id.textt1);
            TextView tv2 = (TextView) v.findViewById(R.id.textt2);
            TextView tv3 = (TextView) v.findViewById(R.id.textt3);
            Button b = (Button) v.findViewById(R.id.button);

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int i = lv3.getPositionForView(v);
                    if (i == 0) {
                        id = "Kdc84lpF4GM";
                    }
                    else if (i == 1) {
                        id = "7Dc7_I48ZTg";
                    }
                    else if (i == 2) {
                        id = "quuwLXzZl3g";
                    }
                    else if (i == 3) {
                        id = "yZNyUzSMsT8";
                    }
                    else if (i == 4) {
                        id = "2IYykxAXaB8";
                    }
                    else if (i == 5) {
                        id = "x0j5iWajqg";
                    }
                    else if (i == 6){
                        id = "i0vwTFFHTU8";
                    }
                    else if (i == 7){
                        id = "jmZsXlAYe7Y";
                    }
                    else if (i == 8){
                        id = "8cJFtDESxiQ";
                    }
                    else if (i == 9){
                        id = "hrVpqW_Bh2o";
                    }
                    Intent intent1 = new Intent(Main23Activity.this, Main3Activity.class);
                    intent1.putExtra("id", id);
                    startActivity(intent1);
                }
            });

            tv1.setText(csharp2.getCourseno());
            tv2.setText(csharp2.getCoursename());
            tv3.setText(csharp2.getCoursetime());

            return v;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv3 = (ListView) findViewById(R.id.listview1);
        ch1 = new ArrayList<>();

        ch1.add(new Csharp2("1","SQLServer Overview","16:25"));
        ch1.add(new Csharp2("2","Normalization","14:30"));
        ch1.add(new Csharp2("3","Orderby clause","6:59"));
        ch1.add(new Csharp2("4","Delete drop and truncate statements","6:58"));
        ch1.add(new Csharp2("5","Aggregate Functions","13:54"));
        ch1.add(new Csharp2("6","Group by clause","20:22"));
        ch1.add(new Csharp2("7","Joins and Inner Join with simple explanation","33:02"));
        ch1.add(new Csharp2("8","Stored procedure","17:11"));
        ch1.add(new Csharp2("9","User defined functions in sql","9:01"));
        ch1.add(new Csharp2("10","Indexes","21:09"));

        ca4 = new CsharpAdapter4();

        lv3.setAdapter(ca4);

    }
}

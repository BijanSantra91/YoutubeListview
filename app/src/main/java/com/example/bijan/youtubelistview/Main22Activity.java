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

public class Main22Activity extends AppCompatActivity {

    ListView lv2;
    ArrayList<Csharp2> ch1 ;
    CsharpAdapter3 ca3;

    String id;

    public class CsharpAdapter3 extends BaseAdapter {

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

                    int i = lv2.getPositionForView(v);
                    if (i == 0){
                        id = "ltgDdukzQ7I";
                    }
                    else if (i == 1){
                        id = "8hXH5HxQfFU";
                    }
                    else if (i == 2){
                        id = "TOBLe0qoA_o";
                    }
                    else if (i == 3){
                        id = "T7G8NFXDXFE";
                    }
                    else if (i == 4){
                        id = "WaAbIMz2dqg";
                    }
                    else if (i == 5){
                        id = "w6ldKhR4YUs";
                    }
                    else if (i == 6){
                        id = "fdPslUmRqm0";
                    }
                    else if (i == 7){
                        id = "zvk_hS4vEOw";
                    }
                    else if (i == 8){
                        id = "UdiU6sp68Tc";
                    }
                    else if (i == 9){
                        id = "5nHmt5Zi7l8";
                    }
                    Intent intent1 = new Intent(Main22Activity.this, Main3Activity.class);
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

        lv2 = (ListView) findViewById(R.id.listview1);
        ch1 = new ArrayList<>();

        ch1.add(new Csharp2("1","C# program compilation","18:47"));
        ch1.add(new Csharp2("2","Debugging in visual studio","10:41"));
        ch1.add(new Csharp2("3","Inheritence","9:24"));
        ch1.add(new Csharp2("4","Inheritence Part 2","24:07"));
        ch1.add(new Csharp2("5","Base keyword","22:08"));
        ch1.add(new Csharp2("6","Overriding Intro","23:31"));
        ch1.add(new Csharp2("7","Overriding an override method","12:52")) ;
        ch1.add(new Csharp2("8","Static Variables","9:27"));
        ch1.add(new Csharp2("9","What is the use of properties in c#","16:16"));
        ch1.add(new Csharp2("10","C# properties","15:03"));

        ca3 = new CsharpAdapter3();

        lv2.setAdapter(ca3);

    }
}

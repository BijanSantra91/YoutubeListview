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

public class Main2Activity extends AppCompatActivity {


    ListView lv1;
    ArrayList<Csharp2> ch1 ;
    CsharpAdapter2 ca1;

    String id;

    public class CsharpAdapter2 extends BaseAdapter{

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

                    int i = lv1.getPositionForView(v);
                    if (i == 0){
                        id = "ltgDdukzQ7I";
                    }
                    else if (i == 1){
                        id = "L_gFuuSp4V0";
                    }
                    else if (i == 2){
                        id = "l1C4FZGCab0";
                    }
                    else if (i == 3){
                        id = "HSdIq3k51bg";
                    }
                    else if (i == 4){
                        id = "SM_QqUdMXY0";
                    }
                    else if (i == 5){
                        id = "8hXH5HxQfFU";
                    }
                    else if (i == 6){
                        id = "CLnA6OAlNPk";
                    }
                    else if (i == 7){
                        id = "O2QI3YFupxM";
                    }
                    else if (i == 8){
                        id = "Zt85ireWQWw";
                    }
                    else if (i == 9){
                        id = "u_k75WcEpHM";
                    }
                    Intent intent1 = new Intent(Main2Activity.this, Main3Activity.class);
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

        lv1 = (ListView) findViewById(R.id.listview1);
        ch1 = new ArrayList<>();

        ch1.add(new Csharp2("1","C# program compilation","18:47"));
        ch1.add(new Csharp2("2","C# data types","17:53"));
        ch1.add(new Csharp2("3","C# class","10:48"));
        ch1.add(new Csharp2("4","C# class as virtual entry","9:15"));
        ch1.add(new Csharp2("5","Object in c#","22:14"));
        ch1.add(new Csharp2("6","Dibugging in visual studio","10.41"));
        ch1.add(new Csharp2("7","C# Arrays","24:50"));
        ch1.add(new Csharp2("8","Declaring and Modifying data in c# arrays","9:06"));
        ch1.add(new Csharp2("9","Arrays Assignment","7:49"));
        ch1.add(new Csharp2("10","Loops","5:51"));

        ca1 = new CsharpAdapter2();

        lv1.setAdapter(ca1);

    }
}

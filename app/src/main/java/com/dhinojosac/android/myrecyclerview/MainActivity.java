package com.dhinojosac.android.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.dhinojosac.android.myrecyclerview.model.RowData;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<RowData> rowDataArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        for (int i = 0; i < 20; i++) {
            rowDataArrayList.add(new RowData());
        }

        CustomAdapter adapter = new CustomAdapter(rowDataArrayList);
        adapter.setRecyclerItemClickListener(new RecyclerItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                Toast.makeText(getApplicationContext(),"Clicked item "+position,Toast.LENGTH_SHORT).show();
            }
        });
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}

package com.regent.tech.bitcoin_converter;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AddDialogBox.Callback {

    private FloatingActionButton floatingActionButton;
    private AddDialogBox addDialogBox;
    private RecyclerView mRecyclerView;
    private CardAdapter adapter;
    private List<Card> card;
//    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addDialogBox = new AddDialogBox();
//        presenter = new MainPresenter(this);
        card = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardAdapter(card);
        mRecyclerView.setAdapter(adapter);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDialogBox.show(getSupportFragmentManager(), "Card to be Added");
                Toast.makeText(MainActivity.this, "Adding Card", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void addCard(Card card){

    }

}

package eu.fse.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
   // private String [] myDataset = {"Nota 1"};

    private ArrayList<Note> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.note_rv);


        mRecyclerView.setHasFixedSize(true);


        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        myDataset = new ArrayList<>();
        Note note = new Note("pin", "12345");
        myDataset.add(pinPalazzo);

        Note note = new Note("spesa", "comprare il latte");
        myDataset.add(spesa);

        mAdapter = new NotesAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
    // ...
}

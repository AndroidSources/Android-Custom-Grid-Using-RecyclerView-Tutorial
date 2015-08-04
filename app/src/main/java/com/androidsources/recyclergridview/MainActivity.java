package com.androidsources.recyclergridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up the toolbar
        Toolbar toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        List<RowData> rowListItem = getRowList();
        layoutManager = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<RowData> getRowList(){

        List<RowData> currentItem = new ArrayList<RowData>();
        currentItem.add(new RowData("Taj Mahal",R.drawable.tajmahal));
        currentItem.add(new RowData("Brazil Christ", R.drawable.brazil));
        currentItem.add(new RowData("Great Wall",R.drawable.greatwall));
        currentItem.add(new RowData("Colosseum", R.drawable.colosseum));
        currentItem.add(new RowData("Eiffel Tower", R.drawable.eiffel_tower));
        currentItem.add(new RowData("Pyramid",R.drawable.pyramid));
        currentItem.add(new RowData("Liberty Statue", R.drawable.statue));
        currentItem.add(new RowData("Taj Mahal",R.drawable.tajmahal));
        currentItem.add(new RowData("Brazil Christ", R.drawable.brazil));
        currentItem.add(new RowData("Great Wall",R.drawable.greatwall));
        currentItem.add(new RowData("Colosseum", R.drawable.colosseum));
        currentItem.add(new RowData("Eiffel Tower", R.drawable.eiffel_tower));
        currentItem.add(new RowData("Pyramid",R.drawable.pyramid));
        currentItem.add(new RowData("Liberty Statue", R.drawable.statue));
        currentItem.add(new RowData("Taj Mahal",R.drawable.tajmahal));
        currentItem.add(new RowData("Brazil Christ", R.drawable.brazil));
        currentItem.add(new RowData("Great Wall",R.drawable.greatwall));
        currentItem.add(new RowData("Colosseum", R.drawable.colosseum));
        currentItem.add(new RowData("Eiffel Tower", R.drawable.eiffel_tower));
        currentItem.add(new RowData("Pyramid",R.drawable.pyramid));
        currentItem.add(new RowData("Liberty Statue", R.drawable.statue));
        currentItem.add(new RowData("Great Wall",R.drawable.greatwall));
        return currentItem;
    }
}

package dev.seorang.mangan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import dev.seorang.mangan.adapters.MakananListAdapter;
import dev.seorang.mangan.dummy.MakananDummy;
import dev.seorang.mangan.models.Makanan;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakanan;
    private ArrayList<Makanan> listMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.rv_main);
        rvMakanan.setHasFixedSize(true);
        listMakanan.addAll(MakananDummy.getData());

        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_me:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        MakananListAdapter makananListAdapter = new MakananListAdapter(listMakanan);
        rvMakanan.setAdapter(makananListAdapter);
        makananListAdapter.setOnItemClickCallback(new MakananListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                moveToDetail(data);
            }
        });

    }

    private void moveToDetail(Makanan data) {
        Intent intent = new Intent(MainActivity.this, MakananDetailActivity.class);
        intent.putExtra(MakananDetailActivity.EXTRA_NAME, data.getName());
        intent.putExtra(MakananDetailActivity.EXTRA_ORIGIN, data.getOrigin());
        intent.putExtra(MakananDetailActivity.EXTRA_DESC, data.getDescription());
        intent.putExtra(MakananDetailActivity.EXTRA_IMG, data.getPhoto());
        startActivity(intent);
    }
}

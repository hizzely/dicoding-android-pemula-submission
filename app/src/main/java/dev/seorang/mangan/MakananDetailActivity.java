package dev.seorang.mangan;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MakananDetailActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "makanan_name";
    public static String EXTRA_ORIGIN = "makanan_origin";
    public static String EXTRA_DESC = "makanan_desc";
    public static String EXTRA_IMG = "makanan_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_detail);

        ImageView makananImg = findViewById(R.id.iv_makanan);
        TextView makananName = findViewById(R.id.tv_makanan_name);
        TextView makananOrigin = findViewById(R.id.tv_makanan_origin);
        TextView makananDesc = findViewById(R.id.tv_makanan_desc);

        Glide.with(this).load(getIntent().getStringExtra(EXTRA_IMG)).into(makananImg);
        makananName.setText(getIntent().getStringExtra(EXTRA_NAME));
        makananDesc.setText(getIntent().getStringExtra(EXTRA_DESC));
        makananOrigin.setText(getIntent().getStringExtra(EXTRA_ORIGIN));

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detail " + getIntent().getStringExtra(EXTRA_NAME));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}

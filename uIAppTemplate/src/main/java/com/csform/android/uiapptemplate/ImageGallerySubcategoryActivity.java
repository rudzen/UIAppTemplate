package com.csform.android.uiapptemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.csform.android.uiapptemplate.adapter.ImageGallerySubcategoryAdapter;
import com.csform.android.uiapptemplate.model.ImageGallerySubcategoryModel;

import java.util.ArrayList;

public class ImageGallerySubcategoryActivity extends AppCompatActivity {

    public static final String IMAGE_GALLERY_SUBCATEGORY = "com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity";
    public static final String IMAGE_GALLERY_LAYOUT_ON_TOP = "com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity.layoutOnTop";
    private ArrayList<ImageGallerySubcategoryModel> mSubcategories;

    private ListView mListView;
    private boolean mIsLayoutOnTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        mListView = (ListView) findViewById(R.id.list_view);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(IMAGE_GALLERY_SUBCATEGORY)) {
                mSubcategories = extras.getParcelableArrayList(IMAGE_GALLERY_SUBCATEGORY);
            } else {
                mSubcategories = new ArrayList<>();
            }
            if (extras.containsKey(IMAGE_GALLERY_LAYOUT_ON_TOP)) {
                mIsLayoutOnTop = extras.getBoolean(IMAGE_GALLERY_LAYOUT_ON_TOP, false);
            }
        }
        setAdapter();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setAdapter() {
        BaseAdapter adapter = new ImageGallerySubcategoryAdapter(this, mSubcategories, mIsLayoutOnTop);
        mListView.setAdapter(adapter);
    }
}

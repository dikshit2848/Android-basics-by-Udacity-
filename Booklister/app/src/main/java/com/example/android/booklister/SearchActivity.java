package com.example.android.booklister;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Books>> {
    private static String Book_URL =
            "https://www.googleapis.com/books/v1/volumes?q=android&maxResults=1";
    private TextView textView;
    private static final int book_Loader = 1;
    private bookAdapter mBookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ListView book_View = (ListView) findViewById(R.id.list_View);
        textView = (TextView) findViewById(R.id.text_display);
        book_View.setEmptyView(textView);
        mBookAdapter = new bookAdapter(this, new ArrayList<Books>());
        book_View.setAdapter(mBookAdapter);
        LoaderManager loader = null;
        Intent intent = getIntent();
        String gotText = intent.getStringExtra("word");
        Book_URL = "https://www.googleapis.com/books/v1/volumes?q=" + gotText + "&maxResults=30";
        ConnectivityManager connect = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connect.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            loader = getLoaderManager();
            loader.initLoader(book_Loader, null, this);
        } else {
            View loading = findViewById(R.id.indicator);
            loading.setVisibility(View.GONE);
            textView.setText(R.string.no_internet);
        }
    }

    @Override
    public Loader<List<Books>> onCreateLoader(int i, Bundle bundle) {
        return new bookLoader(this, Book_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Books>> loader, List<Books> bookses) {
        View indicator = findViewById(R.id.indicator);
        indicator.setVisibility(View.GONE);
        textView.setText(R.string.no_book);
        mBookAdapter.clear();
        if (bookses != null && !bookses.isEmpty()) {
            mBookAdapter.addAll(bookses);
        } else {
            textView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<Books>> loader) {
        mBookAdapter.clear();
    }
}

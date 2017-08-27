package com.example.android.booklister;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class bookLoader extends AsyncTaskLoader<List<Books>> {
    private String mURL;

    public bookLoader(Context context, String URL) {
        super(context);
        mURL = URL;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Books> loadInBackground() {
        if (mURL == null) {
            return null;
        }
        List<Books> book = fetchdata.fetchData(mURL);
        return book;
    }
}

package com.example.android.booklister;

public class Books {
    private String mBookName;
    private String mAuthorName;

    public Books(String bookName, String authorName) {
        mBookName = bookName;
        mAuthorName = authorName;
    }

    public String getBookName() {
        return mBookName;
    }

    public String getAuthorName() {
        return mAuthorName;
    }
}

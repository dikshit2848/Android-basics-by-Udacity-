package com.example.android.booklister;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class bookAdapter extends ArrayAdapter<Books> {
    public bookAdapter(Context context, List<Books> book) {
        super(context, 0, book);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.book_item, parent, false);
        }
        Books cBook = getItem(position);
        TextView bName = (TextView) listView.findViewById(R.id.book_name);
        String book_Name = cBook.getBookName();
        bName.setText(book_Name);

        TextView aName = (TextView) listView.findViewById(R.id.author_name);
        String author_Name = cBook.getAuthorName();
        aName.setText(author_Name);
        return listView;
    }
}

package com.example.android.tourism;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SchoolsFragment extends Fragment {
    public SchoolsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.school_one, R.drawable.school2));
        words.add(new Word(R.string.school_two, R.drawable.school3));
        words.add(new Word(R.string.school_three, R.drawable.school));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_schools);
        ListView listView = (ListView) root.findViewById(R.id.word_lister);
        listView.setAdapter(adapter);
        return root;
    }
}
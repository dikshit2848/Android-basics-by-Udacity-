package com.example.android.tourism;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParksFragment extends Fragment {
    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.parks_one, R.drawable.park1));
        words.add(new Word(R.string.parks_two, R.drawable.park2));
        words.add(new Word(R.string.parks_three, R.drawable.park3));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_parks);
        ListView listView = (ListView) root.findViewById(R.id.word_lister);
        listView.setAdapter(adapter);
        return root;
    }
}
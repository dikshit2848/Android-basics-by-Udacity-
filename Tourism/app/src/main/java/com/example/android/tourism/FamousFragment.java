package com.example.android.tourism;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FamousFragment extends Fragment {
    public FamousFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.famous_one, R.drawable.famous1));
        words.add(new Word(R.string.famous_two, R.drawable.famous2));
        words.add(new Word(R.string.famous_three, R.drawable.famous3));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_famous);
        ListView listView = (ListView) root.findViewById(R.id.word_lister);
        listView.setAdapter(adapter);
        return root;
    }
}
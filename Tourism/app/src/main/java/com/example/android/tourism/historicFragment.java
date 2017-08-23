package com.example.android.tourism;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class historicFragment extends Fragment {
    public historicFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.historic_one));
        words.add(new Word(R.string.historic_two));
        words.add(new Word(R.string.historic_three));
        words.add(new Word(R.string.historic_four));
        words.add(new Word(R.string.historic_five));
        words.add(new Word(R.string.historic_six));
        words.add(new Word(R.string.historic_seven));
        words.add(new Word(R.string.historic_eight));
        words.add(new Word(R.string.historic_nine));
        words.add(new Word(R.string.historic_ten));
        words.add(new Word(R.string.historic_eleven));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_historic);
        ListView listView = (ListView) root.findViewById(R.id.word_lister);
        listView.setAdapter(adapter);
        return root;
    }
}
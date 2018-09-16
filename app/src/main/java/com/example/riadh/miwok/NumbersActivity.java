package com.example.riadh.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "lutti", R.drawable.one_image));
        words.add(new Word("Two", "Otiiko", R.drawable.two_image));
        words.add(new Word("Three", "Tolookuso", R.drawable.three_image));
        words.add(new Word("Four", "Oyyisa", R.drawable.four_image));
        words.add(new Word("Five", "Massokka", R.drawable.five_image));
        words.add(new Word("Six", "Temmokka", R.drawable.six_image));
        words.add(new Word("Seven", "Kenekaku", R.drawable.seven_image));
        words.add(new Word("Eight", "Kawinta", R.drawable.eight_image));
        words.add(new Word("Nine", "Wo'e", R.drawable.nine_image));
        words.add(new Word("Ten", "Na'aacha", R.drawable.ten_image));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

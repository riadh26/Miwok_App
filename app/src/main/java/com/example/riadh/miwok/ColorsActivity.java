package com.example.riadh.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.red_circle));
        words.add(new Word("Green", "Chokokki", R.drawable.green_circle));
        words.add(new Word("Brown", "Takaakki", R.drawable.brown_circle));
        words.add(new Word("Gray", "Topoppi", R.drawable.grey_circle));
        words.add(new Word("Black", "Kululli", R.drawable.black_circle));
        words.add(new Word("White", "Kelelli", R.drawable.white_circle));
        words.add(new Word("Dusty Yellow", "ṭopiisә", R.drawable.dusty_yellow_circle));
        words.add(new Word("Mustard Yellow", "chiwiiṭә", R.drawable.mustard_yellow_circle));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}

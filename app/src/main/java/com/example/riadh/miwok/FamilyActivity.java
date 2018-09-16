package com.example.riadh.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "әpә", R.drawable.father));
        words.add(new Word("Mother", "әṭa", R.drawable.mother));
        words.add(new Word("Son", "angsi", R.drawable.son));
        words.add(new Word("Daughter", "tune", R.drawable.daughter));
        words.add(new Word("Older Brother", "taachi", R.drawable.older_brother));
        words.add(new Word("Younger Brother", "chalitti", R.drawable.younger_brother));
        words.add(new Word("Older Sister", "teṭe", R.drawable.old_sister));
        words.add(new Word("Younger Sister", "kolliti", R.drawable.younger_sister));
        words.add(new Word("GrandMother", "ama", R.drawable.grandmother));
        words.add(new Word("GrandFather", "paapa", R.drawable.grandfather));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}


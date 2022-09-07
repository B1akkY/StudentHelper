package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private ImageView iContent;
    private int category;
    private int position;
    private int [] array_group = {R.string.ikbo_01, R.string.ikbo_02, R.string.ikbo_03, R.string.ikbo_13};
    private int [] array_contacts = {R.string.IPPO, R.string.VT, R.string.KIS, R.string.MOSIT};
    private int [] array_literature = {R.string.book_1, R.string.book_2, R.string.book_3};
    private int [] array_image_contacts = {R.drawable.bolbakov, R.drawable.platonova, R.drawable.adrianova, R.drawable.golovin};
    private int [] book_logo = {R.drawable.book_1, R.drawable.book_2, R.drawable.book_3,};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        receiveIntent();
    }
    private void receiveIntent(){
        Intent i = getIntent();
        if (i != null){
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category){
            case 0:
                iContent.setImageResource(R.drawable.mirea);
                text_content.setText(array_group[position]);
                break;
            case 1:
                iContent.setImageResource(array_image_contacts[position]);
                text_content.setText(array_contacts[position]);
                break;
            case 2:
                iContent.setImageResource(book_logo[position]);
                text_content.setText(array_literature[position]);
                break;
        }
    }
}

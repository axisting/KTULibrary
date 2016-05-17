package com.example.therain.ktulibrary;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//Kişinin isim bilgilerinin ve üzerindeki kitap sayısının gösterildiği Activity
public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        // Text mesaj ve botton tanımlamaları
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etBook = (EditText) findViewById(R.id.etBook);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
        final Button bAnasayfa = (Button) findViewById(R.id.bAnasayfa);
        final Button bArsiv = (Button) findViewById(R.id.bArsiv);
        final Button bKatalog = (Button) findViewById(R.id.bKatalog);
        final Button bMyBooks = (Button) findViewById(R.id.bMyBooks);
        final Button bPast = (Button) findViewById(R.id.bPast);



        //Buttonların yönlendirileceği Activityler
        bAnasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anasayfaIntent = new Intent(UserAreaActivity.this, AnasayfaActivity.class);
                UserAreaActivity.this.startActivity(anasayfaIntent);
            }
        });
        bKatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent katalogIntent = new Intent(UserAreaActivity.this, ArsivActivity.class);
                UserAreaActivity.this.startActivity(katalogIntent);
            }
        });

        bMyBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mybooksIntent = new Intent(UserAreaActivity.this, ArsivActivity.class);
                UserAreaActivity.this.startActivity(mybooksIntent);
            }
        });

        bArsiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arsivIntent = new Intent(UserAreaActivity.this, ArsivActivity.class);
                UserAreaActivity.this.startActivity(arsivIntent);
            }
        });


        bPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pastIntent = new Intent(UserAreaActivity.this, ArsivActivity.class);
                UserAreaActivity.this.startActivity(pastIntent);
            }
        });


        //Veri tabanından alınan kullanıcı bilgilerinin ekrana basılması
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int book = intent.getIntExtra("book", 0);
        int age = intent.getIntExtra("age", 0);
        String message = name + " KTÜLibrary'e Hoşgeldiniz";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");
        etBook.setText(book + "");




    }
}

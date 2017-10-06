package com.example.teacher.t2017100604;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickWrite(View v)
    {
        String fname = getFilesDir().getAbsolutePath();
        Log.d("FN", fname);
        String fname1 = getCacheDir().getAbsolutePath();
        Log.d("FN", fname1);


        try {
            FileWriter fw = new FileWriter(fname + File.separator + "data1.txt");
            fw.write("Hello World");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void clickRead(View v)
    {
        String fname = getFilesDir().getAbsolutePath();
        char ch[] = new char[100];
        try {
            FileReader fr = new FileReader(fname + File.separator + "data1.txt");
            fr.read(ch);
            String str = new String(ch);
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package chy.justjava.com.myinterfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //UI Component Declaration:
    Button btnThrowJab;
    Button btnKickJab;
    Button btnBoxerCross;
    Button btnKickCross;
    Button btnBoxerCut;
    Button btnKickCut;
    Button btnBoxerHook;
    Button btnKickHook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThrowJab = findViewById(R.id.btnThrowJab);
        btnKickJab = findViewById(R.id.btnKickJab);

        btnBoxerCross = findViewById(R.id.btnBoxerCross);
        btnKickCross = findViewById(R.id.btnKickCross);

        btnBoxerCut = findViewById(R.id.btnBoxerCut);
        btnKickCut = findViewById(R.id.btnKickCut);

        btnBoxerHook = findViewById(R.id.btnBoxerHook);
        btnKickHook =  findViewById(R.id.btnKickHook);



        //Boxer myBoxer = new Boxer();
        //Because the object is local, it needs to be declared as final so its value does not change
        final Boxer myBoxer = new Boxer();
        myBoxer.throwJab();
        myBoxer.throwCross();
        myBoxer.throwHook();
        myBoxer.upperCut();

        btnThrowJab.setOnClickListener(new View.OnClickListener() {

            //annonymous inner class

            //method implelementation
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myBoxer.throwJab(),Toast.LENGTH_LONG).show();

            }
        });

        btnBoxerCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myBoxer.throwCross(),Toast.LENGTH_LONG).show();
            }
        });

        btnBoxerCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myBoxer.upperCut(),Toast.LENGTH_LONG).show();
            }
        });

        //Respond to the click of btnBoxerHook
        btnBoxerHook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myBoxer.throwHook(),Toast.LENGTH_LONG).show();
            }
        });


        final KickBoxer myKickBoxer = new KickBoxer();
        myKickBoxer.throwJab();
        myKickBoxer.throwCross();
        myKickBoxer.upperCut();
        myKickBoxer.throwHook();

        btnKickJab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myKickBoxer.throwJab(),Toast.LENGTH_LONG).show();
            }
        });

        btnKickCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myKickBoxer.throwCross(),Toast.LENGTH_LONG).show();
            }
        });

        btnKickCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myKickBoxer.upperCut(),Toast.LENGTH_LONG).show();
            }
        });

        btnKickHook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,myKickBoxer.throwHook(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

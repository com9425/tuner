package com.example.asdfe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DropC extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6;
    MediaPlayer ccode,dcode,ecode,fcode,gcode,acode,bcode,hecode,c6code,c4code;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"코드배우기→")

                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==1) {
            Intent intent = new Intent(getApplicationContext(), cord.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_c);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        c6code=MediaPlayer.create(this,R.raw.d);
        fcode=MediaPlayer.create(this,R.raw.f);
        c4code=MediaPlayer.create(this,R.raw.c4);
        gcode=MediaPlayer.create(this,R.raw.g);
        dcode=MediaPlayer.create(this,R.raw.d);
        hecode=MediaPlayer.create(this,R.raw.he);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccode=MediaPlayer.create(DropC.this,R.raw.c6);
                ccode.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gcode=MediaPlayer.create(DropC.this,R.raw.g);
                gcode.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ccode=MediaPlayer.create(DropC.this,R.raw.c4);
               ccode.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fcode=MediaPlayer.create(DropC.this,R.raw.f);
                fcode.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acode=MediaPlayer.create(DropC.this,R.raw.a);
                acode.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            dcode=MediaPlayer.create(DropC.this,R.raw.d);
            dcode.start();
        }
        });

        final String tumode[]= {"♬ Drop C" , "♬ Standard" , "♬ Drop D", "♬ Drop B ", "♬ Half-step down","♬ 1 and 1/2 step down","♬ Open D","♬ Open D minor","♬ Modal D","♬ Modal C","♬ Open G","♬ Open G minor","♬ Modal C6"};

        final Spinner dcspinner = (Spinner)findViewById(R.id.dcspinner);

        ArrayAdapter<String> adapter;
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tumode);
        dcspinner.setAdapter(adapter);

        dcspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:


                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent1);
                        finish();
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), DropD.class);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(),DropB.class);
                        startActivity(intent3);
                        finish();
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(),Halfstepdown.class);
                        startActivity(intent4);
                        finish();
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(),oneand12stepdown.class);
                        startActivity(intent5);
                        finish();
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(),OpenD.class);
                        startActivity(intent6);
                        finish();
                        break;
                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(),OpenDminor.class);
                        startActivity(intent7);
                        finish();
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(),ModalD.class);
                        startActivity(intent8);
                        finish();
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(),ModalC.class);
                        startActivity(intent9);
                        finish();
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(),OpenG.class);
                        startActivity(intent10);
                        finish();
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(),OpenGminor.class);
                        startActivity(intent11);
                        finish();
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(),ModalC6.class);
                        startActivity(intent12);
                        finish();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

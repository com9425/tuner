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

public class DropB extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    MediaPlayer c6code,dcode,ecode,fcode,gcode,acode,bcode,hecode,fscode,cscode,gscode,hdscode,dscode,ascode,c4code;
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
        setContentView(R.layout.activity_drop_b);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bcode=MediaPlayer.create(DropB.this,R.raw.b);
                bcode.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fscode=MediaPlayer.create(DropB.this,R.raw.fs);
                fscode.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bcode=MediaPlayer.create(DropB.this,R.raw.b);
                bcode.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ecode=MediaPlayer.create(DropB.this,R.raw.e);
                ecode.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gscode=MediaPlayer.create(DropB.this,R.raw.gs);
                gscode.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            cscode=MediaPlayer.create(DropB.this,R.raw.cs);
            cscode.start();
        }
        });
        fscode=MediaPlayer.create(this,R.raw.fs);
        ecode=MediaPlayer.create(this,R.raw.e);
        acode=MediaPlayer.create(this,R.raw.a);
        gscode=MediaPlayer.create(this,R.raw.gs);
        bcode=MediaPlayer.create(this,R.raw.b);
        cscode=MediaPlayer.create(this,R.raw.cs);
        final String tumode[]= {"♬ Drop B" , "♬ Drop C" , "♬ Drop D", "♬ Standard", "♬ Half-step down","♬ 1 and 1/2 step down","♬ Open D","♬ Open D minor","♬ Modal D","♬ Modal C","♬ Open G","♬ Open G minor","♬ Modal C6"};

        final Spinner spinner = (Spinner)findViewById(R.id.dbspinner);

        ArrayAdapter<String> adapter;
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tumode);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(),DropC.class);
                        startActivity(intent1);
                        finish();
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), DropD.class);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
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

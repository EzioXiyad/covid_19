package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView sv;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13;
    Button m1,m2,m3,m4,m5,m6;
    Button n1,n2;
    Button j1,j2,j3,j4,j5,j6,j7,j8;
    Button r1,r2,r3,r4,r5,p,j,nao,cha,bogura,siraj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv=findViewById(R.id.scrl);
        sv.setVisibility(View.VISIBLE);
        b1=findViewById(R.id.dd);
        b2=findViewById(R.id.bagerhat);
        b3=findViewById(R.id.jhinaidah);
        b4=findViewById(R.id.chuadanga);
        b5=findViewById(R.id.shatkhira);
        b6=findViewById(R.id.kushtia1);
        b7=findViewById(R.id.kushtia2);
        b8=findViewById(R.id.meherpur);
        b9=findViewById(R.id.jashore);
        b10=findViewById(R.id.narail1);
        b11=findViewById(R.id.narail2);
        b12=findViewById(R.id.narail3);
        b13=findViewById(R.id.magura);
        a1=findViewById(R.id.rangpur1);
        a2=findViewById(R.id.rangpur2);
        a3=findViewById(R.id.rangpur3);
        a4=findViewById(R.id.kurigram);
        a5=findViewById(R.id.dinajpur);
        a6=findViewById(R.id.dinajpur1);
        a7=findViewById(R.id.lal);
        a8=findViewById(R.id.lal1);
        a9=findViewById(R.id.lal2);
        a10=findViewById(R.id.pancha);
        a11=findViewById(R.id.thakurgaon);
        a12=findViewById(R.id.nilphamari);
        a13=findViewById(R.id.gaibandha);
        m1=findViewById(R.id.mymensing);
        m2=findViewById(R.id.mymensing1);
        m3=findViewById(R.id.mymensing2);
        m4=findViewById(R.id.mymensing3);
        m5=findViewById(R.id.mymensing4);
        m6=findViewById(R.id.mymensing5);
        n1=findViewById(R.id.netro);
        n2=findViewById(R.id.netro1);
        j1=findViewById(R.id.jamalpur);
        j2=findViewById(R.id.jamalpur1);
        j3=findViewById(R.id.jamalpur2);
        j4=findViewById(R.id.jamalpur3);
        j5=findViewById(R.id.jamalpur4);
        j6=findViewById(R.id.jamalpur5);
        j7=findViewById(R.id.jamalpur6);
        j8=findViewById(R.id.sherpur);
        r1=findViewById(R.id.raj);
        r2=findViewById(R.id.raj1);
        r3=findViewById(R.id.raj2);
        r4=findViewById(R.id.raj3);
        r5=findViewById(R.id.raj4);
        p=findViewById(R.id.pabna);
        j=findViewById(R.id.joy);
        nao=findViewById(R.id.nao);
        cha=findViewById(R.id.cha);
        bogura=findViewById(R.id.bogura);
        siraj=findViewById(R.id.siraj);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        }
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });


        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });
        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

       r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        nao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        bogura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

        siraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),findhospital.class));
            }
        });

    }
}
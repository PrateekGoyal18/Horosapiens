package com.example.user.horosapien;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    TextView t1;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t1 = (TextView)findViewById(R.id.t1);
        lv=(ListView)findViewById(R.id.l1);

        String[] values = new String[] {
                "Aries",
                "Taurus",
                "Gemini",
                "Cancer",
                "Leo",
                "Virgo",
                "Libra",
                "Scorpio",
                "Saggittarius",
                "Capricorn",
                "Aquarius",
                "Pisces"
        };


        //       data=getResources().getStringArray(R.array.myarray);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1 ,values);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(Main2Activity.this);

       /* lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             int itemPosition=i;
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=itemPosition"));
                startActivity(intent);
            }
        });*/


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent=new Intent(getApplicationContext(),About.class);
            startActivity(intent);
        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;

        switch (i)
        {
            case 0:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=1"));
                startActivity(intent);
                break;
            case 1:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=2"));
                startActivity(intent);
                break;
            case 2:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=3"));
                startActivity(intent);
                break;
            case 3:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=4"));
                startActivity(intent);
                break;
            case 4:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=5"));
                startActivity(intent);
                break;
            case 5:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=6"));
                startActivity(intent);
                break;
            case 6:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=7"));
                startActivity(intent);
                break;
            case 7:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=8"));
                startActivity(intent);
                break;
            case 8:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=9"));
                startActivity(intent);
                break;
            case 9:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=10"));
                startActivity(intent);
                break;
            case 10:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=11"));
                startActivity(intent);
                break;
            case 11:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=12"));
                startActivity(intent);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Wrong option Clicked", Toast.LENGTH_LONG).show();
                break;

        }


    }
}

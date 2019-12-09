package com.example.pubgmobilehacks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listActivity;
    String[] _hackname = {"Free RP","Wall Hack","Ace Rank Boost","Magic Bullet","ESP Enable","2x Damage","AIMBot"};
    Integer[] _hackpic = {R.drawable.rpfree, R.drawable.wallhack, R.drawable.acerank, R.drawable.magicbullet, R.drawable.esp, R.drawable.damage, R.drawable.aimbot};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        listActivity=(ListView)findViewById(R.id.listview);

        CustomListView customListView= new CustomListView(this,_hackname,_hackpic);
        listActivity.setAdapter(customListView);
        listActivity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder altdial=new AlertDialog.Builder(ListActivity.this);
                altdial.setMessage("Do you want to apply the hacks and play PUBG? This can be reversed.").setCancelable(false)
                        .setPositiveButton("Yes,Let's Hack", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(ListActivity.this, WaitActivity.class);
                                startActivity(intent);

                            }
                        })
                        .setNegativeButton("No, Play Fair", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert=altdial.create();
                alert.setTitle("Notice");
                alert.show();


            }
        });

    }
}

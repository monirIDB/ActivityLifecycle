package com.nipon.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
        TextView userInfoTv;
        ListView listView;
        String[] nameList={"Comok","Faravy","Saiful","Nahid"};

        userInfoTv=findViewById(R.id.userInfoTv);

        Intent intent=getIntent();
        String userInfo=intent.getStringExtra("userInfo");
        userInfoTv.setText(userInfo);

        listView=findViewById(R.id.listView);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,nameList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(LoginSuccessActivity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });



    }
}

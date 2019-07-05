package com.krittika.realmassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import io.realm.Realm;
import io.realm.RealmResults;

public class DisplayActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mRecyclerView=findViewById(R.id.personRecycler);
        Realm realm=Realm.getDefaultInstance();
        RealmResults<Person>personRealmResults=realm.where(Person.class).findAll();
        MyAdapter myAdapter=new MyAdapter(personRealmResults,this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(myAdapter);
    }
}

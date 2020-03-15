package au.edu.unsw.infs3634.cryptobag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManger;

    private final LinkedList<String> mWordList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent (this,DetailActivity.class);

//            for(int i =0; i<20;i++){
//                mWordList.addLast("Word "+i);
//            }



        mRecyclerView = findViewById(R.id.rvList);
//        mRecyclerView.setHasFixedSize(true);
//        mLayoutManger = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManger);
//        mAdapter = new WordListAdapter(this, mWordList);
//        CoinAdapter.RecyclerViewClickListener Listener = （view, position）{
//
//        }
//        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



        //Button button = findViewById(R.id.btn1);

        //button.setOnClickListener(new View.OnClickListener(){

//            @Override
//            public void onClick(View v){
//                startActivity(intent);
//            }
//        });
    }
}

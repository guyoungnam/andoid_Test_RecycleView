package org.techtown.samplerecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_item);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        PersonAdapter adapter = new PersonAdapter(); // 라싸이클러뷰에 레이아웃 매니저 설정하기

        adapter.addItem(new Person("김민수", "010-1111-1111"));
        adapter.addItem(new Person("김하늘", "010-2222-2222"));
        adapter.addItem(new Person("홍길동", "010-3333-3333"));

        recyclerView.setAdapter(adapter); //리싸이클러뷰에 어댑터 설정하기

    }
}

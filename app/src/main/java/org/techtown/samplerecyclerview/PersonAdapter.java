package org.techtown.samplerecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    ArrayList<Person> items = new ArrayList<Person>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemtView = inflater.inflate(R.layout.person_item, viewGroup, false);
        return new ViewHolder(itemtView); //뷰홀더 객체를 생성하면서 뷰 객체를 전달하고 그 뷰홀더 객체를 반환하기
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Person item = items.get(position);
        viewHolder.setItem(item);

    }

    public void addItem(Person item){
        items.add(item);
    }

    public void setItem(ArrayList<Person>items){
        this.items = items;
    }

    public Person getItem(int position){
        return items.get(position);
    }

    public Person setItem(int position, Person item ){
        return items.set(position, item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView2;

        public ViewHolder(View itemView){
            super(itemView);   //뷰홀더 생성자로 전달되는 뷰 객체 참조하기

            textView = itemView.findViewById(R.id.textView);
            textView2= itemView.findViewById(R.id.textView2); // 뷰 객체에 들어 있는 텍스트뷰 참조하기
        }
        public void setItem(Person item){
            textView.setText(item.getName());
            textView2.setText(item.getMobile());
        }


    }
}



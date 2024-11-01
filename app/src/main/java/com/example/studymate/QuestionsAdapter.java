package com.example.studymate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.ViewHolder> {
    private List<String> QuestionList;
    public QuestionsAdapter(List<String> QuestionList){
        this.QuestionList=QuestionList;
    }
    @NonNull
    @Override
    public QuestionsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionsAdapter.ViewHolder holder, int position) {
        String note=QuestionList.get(position);
        holder.quesTextView.setText(note);
    }

    @Override
    public int getItemCount() {
        return QuestionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView quesTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            quesTextView= itemView.findViewById(android.R.id.text1);
        }
    }
}

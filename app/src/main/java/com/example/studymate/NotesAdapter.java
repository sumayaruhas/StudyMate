package com.example.studymate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {
    private List<String> notesList;
    public NotesAdapter(List<String> notesList){
        this.notesList=notesList;
    }
    @NonNull
    @Override
    public NotesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.ViewHolder holder, int position) {
String note=notesList.get(position);
holder.noteTextView.setText(note);
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView noteTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTextView= itemView.findViewById(android.R.id.text1);
        }
    }
}

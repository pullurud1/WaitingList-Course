package com.example.waitinglist_course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import com.example.waitinglist_course.database.Student;
import  com.example.waitinglist_course.R;

import androidx.recyclerview.widget.RecyclerView;
public class WaitingListAdapter extends RecyclerView.Adapter<WaitingListAdapter.MyViewHolder> {

    // Private members of class
    private Context context;
    private List<Student> student;

    // Nested class
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView priority;

        // Constructor of MyViewHolder
        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
            priority = view.findViewById(R.id.priority);
        }
    }

    // Constructor of WaitingListAdapter
    public WaitingListAdapter(Context context, List<Student> student) {
        this.context = context;
        this.student = student;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_row, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Student item = student.get(position);
        holder.name.setText(item.getName());
        holder.priority.setText(item.getPriority());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }
}

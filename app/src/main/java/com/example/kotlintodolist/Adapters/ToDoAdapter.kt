package com.example.kotlintodolist.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintodolist.Models.Todo
import com.example.kotlintodolist.R


class ToDoAdapter(val todos:ArrayList<Todo>): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

   class ToDoViewHolder(val item: View): RecyclerView.ViewHolder(item) {

       /*class TodoviewHolder extends RecyclerViewHolder{
          public todoViewholder(int item){
           super(item) //method in recyclerView
        } */

      val todoTask=item.findViewById<TextView>(R.id.ToDoTask)


   }

    override fun getItemCount(): Int {
       return todos.size
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
       val li=parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView=li.inflate(R.layout.list_item_todo,parent,false)
        return ToDoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ToDoAdapter.ToDoViewHolder, position: Int) {

       holder?.todoTask?.text=todos[position].Task

    }

}
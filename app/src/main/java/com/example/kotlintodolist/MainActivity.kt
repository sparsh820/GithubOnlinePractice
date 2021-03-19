package com.example.kotlintodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlintodolist.Adapters.ToDoAdapter
import com.example.kotlintodolist.Models.Todo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val Todos:ArrayList<Todo> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Todos.add(Todo("FirstTask",false))
        RecyclerView.layoutManager=LinearLayoutManager(this)
        val todoAdapter:ToDoAdapter= ToDoAdapter(Todos)
        RecyclerView.adapter=todoAdapter

        btnAdd.setOnClickListener(){

            val todo:String=editTextNewToDo.text.toString()
            Todos.add(Todo(todo,false))
            todoAdapter.notifyDataSetChanged()


        }


    }
}
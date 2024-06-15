package com.example.notesapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(var id: Int, var title: String, var createdAt: Date)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeTodo(): List<Todo> {
    return listOf<Todo>(
        Todo(1, "first todo", Date.from(Instant.now())),
        Todo(1, "second todo", Date.from(Instant.now())),
        Todo(1, "this is my third todo", Date.from(Instant.now())),
        Todo(1, "first todo", Date.from(Instant.now())),
        Todo(1, "first todo", Date.from(Instant.now())),
        Todo(1, "first todo", Date.from(Instant.now())),
        Todo(1, "last todo", Date.from(Instant.now())),
        Todo(1, "last todo", Date.from(Instant.now())),
        Todo(1, "last todo", Date.from(Instant.now())),
        Todo(1, "last todo", Date.from(Instant.now())),
    )
}
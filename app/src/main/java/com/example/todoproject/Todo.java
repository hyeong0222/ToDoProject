package com.example.todoproject;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "todo_table")
public class Todo {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "todo")
    private String mTodo;

    public Todo(@NonNull String todo) {
        this.mTodo = todo;
    }
    public String getTodo() {
        return this.mTodo;
    }
}

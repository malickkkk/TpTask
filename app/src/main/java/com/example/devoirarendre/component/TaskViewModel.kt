package com.example.devoirarendre.component



import androidx.lifecycle.ViewModel
import java.util.UUID
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.example.devoirarendre.model.Task

class TaskViewModel : ViewModel() {
    private val _taskList = mutableStateListOf<Task>()
    val taskList: SnapshotStateList<Task> = _taskList

    fun addTask(title: String) {
        val newTask = Task(UUID.randomUUID().toString(), title)
        _taskList.add(newTask)
    }

    fun getTaskById(id: String): Task? {
        return _taskList.find { it.id == id }
    }
}

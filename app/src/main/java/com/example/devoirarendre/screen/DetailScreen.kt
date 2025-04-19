package com.example.devoirarendre.screen



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.devoirarendre.component.TaskViewModel

@Composable
fun DetailScreen(viewModel: TaskViewModel, taskId: String, navController: NavHostController) {
    val task = viewModel.getTaskById(taskId)

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Détail de la tâche", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Titre : ${task?.title ?: "Tâche introuvable"}")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Retour")
        }
    }
}


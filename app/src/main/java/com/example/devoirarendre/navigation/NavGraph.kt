package com.example.devoirarendre.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.devoirarendre.component.TaskViewModel
import com.example.devoirarendre.screen.AddTaskScreen
import com.example.devoirarendre.screen.DetailScreen
import com.example.devoirarendre.screen.MainScreen

@Composable
fun AppNavigation(viewModel: TaskViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(viewModel, navController)
        }
        composable("add_task") {
            AddTaskScreen(viewModel, navController)
        }
        composable("detail/{taskId}") { backStackEntry ->
            val taskId = backStackEntry.arguments?.getString("taskId") ?: ""
            DetailScreen(viewModel, taskId, navController)
        }
    }
}

import org.example.Status;
import org.example.TaskItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

 public class TaskDatabase {
    private Connection connection;

    public TaskDatabase(String dbUrl, String dbUser, String dbPassword) {
        try {
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<TaskItem> fetchAllTasks() {
        List<TaskItem> tasks = new ArrayList<>();
        try {
            String query = "SELECT * FROM tasks";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                TaskItem task = new TaskItem(resultSet.getInt("id"),
                        resultSet.getString("task_description"),
                        Status.valueOf(resultSet.getString("task_status")));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public TaskItem fetchTaskByID(int taskId) {
        TaskItem task = null;
        try {
            String query = "SELECT * FROM tasks WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, taskId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                task = new TaskItem(resultSet.getInt("id"),
                        resultSet.getString("task_description"),
                        Status.valueOf(resultSet.getString("task_status")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/lab3";
        String dbUser = "root";
        String dbPassword = "root";

        TaskDatabase taskDatabase = new TaskDatabase(dbUrl, dbUser, dbPassword);

        List<TaskItem> allTasks = taskDatabase.fetchAllTasks();
        for (TaskItem task : allTasks) {
            System.out.println(task);
        }

        int taskIdToFetch = 2;
        TaskItem specificTask = taskDatabase.fetchTaskByID(taskIdToFetch);
        if (specificTask != null) {
            System.out.println("Specific Task: " + specificTask);
        } else {
            System.out.println("Task not found for ID: " + taskIdToFetch);
        }

        taskDatabase.closeConnection();
    }
}

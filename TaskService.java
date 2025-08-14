package service;

import java.util.ArrayList;
import model.Task;

public class TaskService {
	// Start with an ArrayList of contacts to hold the list of tasks
	public ArrayList<Task> taskList = new ArrayList<Task>();

	// Display the full list of contacts for error checking.
	public void displayTaskList() {
		for (int counter = 0; counter < taskList.size(); counter++) {
			System.out.println("\t Task ID: " + taskList.get(counter).getTaskID());
			System.out.println("\t Task Name: " + taskList.get(counter).getTaskName());
			System.out.println("\t Task Description: " + taskList.get(counter).getTaskDesc());
		}
	}

	public void addTask(String taskName, String taskDesc) {
		// Create the new task
		Task task = new Task(taskName, taskDesc);
		taskList.add(task);
	}

	public Task getTask(String taskID) {
		Task task = new Task(null, null);
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().contentEquals(taskID)) {
				task = taskList.get(counter);
			}
		}
		return task;
	}

	// Delete task.
	public void deleteTask(String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.remove(counter);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}

	// Update the task name.
	public void updateTaskName(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskName(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}

	// Update the task description.
	public void updateTaskDesc(String updatedString, String taskID) {
		for (int counter = 0; counter < taskList.size(); counter++) {
			if (taskList.get(counter).getTaskID().equals(taskID)) {
				taskList.get(counter).setTaskDesc(updatedString);
				break;
			}
			if (counter == taskList.size() - 1) {
				System.out.println("Task ID: " + taskID + " not found.");
			}
		}
	}
}

package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
	private LocalDate date = LocalDate.now();
	private String task = "";
	
	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	@Override
	public int compareTo(Task s) {
		
		if (this.date.isAfter(s.getDate())) {
			return 1;
		} else if (this.date.isBefore(s.getDate())) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

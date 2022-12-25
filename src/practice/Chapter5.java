package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.parse("2021-10-21"), "牛乳を買う。"));
		list.add(new Task(LocalDate.parse("2021-09-15"), "○○社面談。"));
		list.add(new Task(LocalDate.parse("2021-12-04"), "手帳を買う。"));
		list.add(new Task(LocalDate.parse("2021-08-10"), "散髪に行く。"));
		list.add(new Task(LocalDate.parse("2021-11-09"), "スクールの課題を解く。"));
		
		Collections.sort(list);
		
		display(list);
	}
	
	private static void display(List<Task> list) {
		for (Task ls: list) {
			System.out.println(ls.getDate() + ":" + ls.getTask());
		}
	}
}

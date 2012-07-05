package com.epam.nulp.tasks;
import com.epam.nulp.tasks.exceptions.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
	List<Student> list = GenerateListOfStudents.generateDefault();

	System.out.println("List of students:");
	System.out.println(list);
	
	for (SortType type : SortType.values()) {
	    System.out.println("\nSorted by " + type.name());
	    SortUtils.sort(list, type);
	    for (Student stud : list)
		System.out.println(stud);
	}
	
	try {
	    list.get(0).setAge((byte) -1);
	} catch (AgeFormatException e) {
	    e.printStackTrace();
	}
    }
}

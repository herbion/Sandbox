package com.epam.nulp.tasks;

import java.text.Collator;
import java.util.*;

enum SortType {
    BY_FIRST_NAME, BY_LAST_NAME, BY_MIDDLE_NAME, BY_AGE
}
public class SortUtils {
    public static void sort(final List<Student> list, final SortType sortBy) {
	Collections.sort(list, new Comparator<Student>() {
	    @Override
	    public int compare(final Student o1, final Student o2) {
		final Collator ua = Collator.getInstance(new Locale("uk", "UA"));

		switch (sortBy) {
		case BY_AGE:
		    return o1.getAge() - o2.getAge();
		case BY_FIRST_NAME:
		    return ua.compare(o1.getFirstName(), o2.getFirstName());
		case BY_LAST_NAME:
		    return ua.compare(o1.getLastName(), o2.getLastName());
		case BY_MIDDLE_NAME:
		    return ua.compare(o1.getMiddleName(), o2.getMiddleName());
		}
		return 0; // Because without it won't compile.
	    }
	});
    }
    public static void sortByLastNameUsingComparable(List<Student> list) {
	// comparable
	Collections.sort(list);
    }
}

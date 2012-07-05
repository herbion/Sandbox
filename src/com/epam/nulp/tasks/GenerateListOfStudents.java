package com.epam.nulp.tasks;

import java.util.*;


public class GenerateListOfStudents {
    
    public static List<Student> generate(String[] students) {
	List<Student> studentsList = new LinkedList<Student>();
	Random ageRandom = new Random(47);
	for (String stud : students) {
	    String [] fio = stud.split("  ");
	    studentsList.add(new Student(fio[1], fio[2], fio[0], (byte) (18 + ageRandom.nextInt(10))));
	}
	return studentsList;
    }
    public static  List<Student> generateDefault() {
	return GenerateListOfStudents.generate(	new String[] {

		"Беднаровський  Ігор  Геннадійович",
		"Волох  Данило  Сергійович",
		"Галаз  Тарас  Орестович",
		"Гутей  Богдан  Богданович",
		"Дедюхін  Степан  Ігорович",
		"Жибак  Віктор  Ярославович", 
		"Когут  Марія  Миронівна",
		"Косован  Костя  Сергійович",
		"Маков’як  Роман  Володимирович",
		"Манько  Сергій  Володимирович",
		"Місюрик  Андрій  Петрович",
		"Ноцик  Роман  Зиновійович",
		"Огородник  Тарас  Ігорович", 
		"Перхун  Григорій  Романович", 
		"Петришин  Інна  Ярославівна",
		"Приймак  Дмитро  Васильович",
		"Приймак  Михайло  Васильович", 
		"Псуй  Ярослав  Володимирович",
		"Романкевич  Павло  Андрійович",
		"Ротенберг  Дмитро  Вікторович",
		"Сточанський  Ярослав  Степанович", 
		"Талаш  Павло  Михайлович",
		"Федина  Михайло  Вікторович", 
		"Ясенецький  Максим  Сергійович", 
		"Кольбух  Тарас  Михайлович",
		"Родін  Олексій  Олександрович",
	});
	
    }
    public static void main(String[] args) {
	for (Student student : generateDefault()) 
	    System.out.println(student);
    }
}

package com.axa;
import java.util.List;
import com.axa.Doctor;
public class StaticClass {

	public static String staticValue1 = "0";
	public static List<Doctor>  doctor;

	public static String getStaticValue1() {
		return staticValue1;
	}

	public static String setStaticValue1(String staticValue1) {
		StaticClass.staticValue1 = staticValue1;
		return "OK";
	}
	
	public static String setDoctor(List<Doctor> doctor) {
		StaticClass.doctor = doctor;
		return "OK";
	}

	public static List<Doctor> getDoctor() {
		return doctor;
	}
	
}

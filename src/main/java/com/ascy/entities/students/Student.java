package com.ascy.entities.students;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String studentId;
	private String studentName;
	private String entry;
	private String track;
	
	public Student(){
		
	}
	
	public Student(String studentId, String studentName, String entry, String track) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.entry = entry;
		this.track = track;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", entry=" + entry + ", track="
				+ track + "]";
	}
	
	
	
	
}

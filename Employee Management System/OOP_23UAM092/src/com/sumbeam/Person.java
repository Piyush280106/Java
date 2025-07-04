package com.sumbeam;

public class Person {
		 String name;
		 MyDate dateOfBirth;
		public Person(String name, MyDate dateOfBirth) {
			this.name = name;
			this.dateOfBirth = dateOfBirth;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public MyDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(MyDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		@Override
		public String toString() {
			return "Name:" + name + "DOB:" + dateOfBirth + "";
		}
		
		
}

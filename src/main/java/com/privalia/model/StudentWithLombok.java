package com.privalia.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class StudentWithLombok extends PrivaliaObject {

	@NonNull
	private Integer idStudent;
	@NonNull
	private String name;
	@NonNull
	private String surname;
	@NonNull
	private Integer age;
	
	
	//builder example
	public static StudentWithLombok getStudent() {
		return new StudentWithLombok();
	}
	
	@Override
	public String toString() {
		StringBuilder builder=  new StringBuilder();
		builder.append(Integer.toString(idStudent));
		builder.append(",");
		builder.append(name);
		builder.append(",");
		builder.append(surname);
		builder.append(",");
		builder.append(age);
		return builder.toString();
	}
	
	
}

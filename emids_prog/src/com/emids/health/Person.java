package com.emids.health;
public class Person {	
	
	public double AgePremiumAmount;
	public double GenderPremiumAmount;
	public double healthPremiumAmount;
	public double habitsPremiumAmount;
	
	
	private boolean hyperTension;
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public boolean isHyperTension() {
		return hyperTension;
	}
	public void setHyperTension(boolean hyperTension) {
		this.hyperTension = hyperTension;
	}
	public boolean isBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(boolean bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public boolean isBloodSugar() {
		return bloodSugar;
	}
	public void setBloodSugar(boolean bloodSugar) {
		this.bloodSugar = bloodSugar;
	}
	public boolean isOverWeight() {
		return overWeight;
	}
	public void setOverWeight(boolean overWeight) {
		this.overWeight = overWeight;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	public boolean isAlcohol() {
		return alcohol;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	public boolean isExcercise() {
		return excercise;
	}
	public void setExcercise(boolean excercise) {
		this.excercise = excercise;
	}
	public boolean isDrugs() {
		return drugs;
	}
	public void setDrugs(boolean drugs) {
		this.drugs = drugs;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;
	Sex gender;
	private boolean bloodPressure;
	private boolean bloodSugar;
	private boolean overWeight;
	private boolean smoking;
	private boolean alcohol;
	private boolean excercise;
	private boolean drugs;
}
	
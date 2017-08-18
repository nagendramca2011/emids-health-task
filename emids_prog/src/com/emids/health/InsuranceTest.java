package com.emids.health;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsuranceTest {
	public static final int BASE_PREMIUM = 5000;

	public static double calculateInsurance(Person p) {
		
		CheckPersonEligibilityForSelectiveService person = new CheckPersonEligibilityForSelectiveService();		
		 
		return BASE_PREMIUM
				+ person.getPersonAgePremiumAmount(p, BASE_PREMIUM)
				+ person.getPersonGenderPremiumAmount(p, BASE_PREMIUM)
				+ person.getPersonHabitsPremiumAmount(p, BASE_PREMIUM)
				+ person.getPersonHealthPremiumAmount(p, BASE_PREMIUM);

	}

	public static void main(String[] args) {

		Person person = new Person();
		String gender = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter Customer Name :");
			person.setName(br.readLine());
			System.out.println("Enter Gender (Male,Female,Other):");
			gender = br.readLine();
			System.out.println("Enter Age:");
			person.setAge(Integer.parseInt(br.readLine()));
			System.out.println("**Your Current Health**");
			System.out.println("HyperTension(Yes/No):");
			person.setHyperTension("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("BloodPressure(Yes/No):");
			person.setBloodPressure("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("BloodSugar(Yes/No):");
			person.setBloodSugar("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("OverWeight(Yes/No):");
			person.setOverWeight("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);

			System.out.println("**Your Habits**");
			System.out.println("Smoke(Yes/No):");
			person.setSmoking("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("Alcohol(Yes/No):");
			person.setAlcohol("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("Daily Exercise(Yes/No):");
			person.setAlcohol("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);
			System.out.println("Drugs(Yes/No):");
			person.setDrugs("Yes".equalsIgnoreCase(br.readLine()) ? true
					: false);

			if (gender.equalsIgnoreCase("Male")) {
				person.setGender(Sex.MALE);
			} else if (gender.equalsIgnoreCase("Female")) {
				person.setGender(Sex.FEMALE);
			} else {
				person.setGender(Sex.OTHER);
			}

			System.out.println("Health Insurance Premium for Mr."
					+ person.getName() + ": Rs." + calculateInsurance(person));

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}

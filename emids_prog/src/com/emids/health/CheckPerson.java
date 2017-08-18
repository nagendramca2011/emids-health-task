package com.emids.health;

public interface CheckPerson {
	
	
	//Sex
	int getMalePercent(int BasePremium);
	int getFemalePercent(int BasePremium);
	int getOtherPercent(int BasePremium);
	double getPersonGenderPremiumAmount(Person p, int BasePremium);
	
	//Age
	int getBelow18(int BasePremium);
	int get18and25(int BasePremium);
	int get25and30(int BasePremium);
	int get30and35(int BasePremium);
	int get35and40(int BasePremium);
	int getAbove40(int BasePremium);
	double getPersonAgePremiumAmount(Person p, int BasePremium);
	
	//Health
	int getHypertensionPercent(int BasePremium);
	int getBloodPressurePercent(int BasePremium);
	int getBloodSugarPercent(int BasePremium);
	int getOverweightPercent(int BasePremium);
	double getPersonHealthPremiumAmount(Person p, int BasePremium);
	
	//Habits
	int getSmokingPercent(int BasePremium);
	int getAlcoholPercent(int BasePremium);
	int getDailyExercisePercent(int BasePremium);
	int getDrugsPercent(int BasePremium);
	double getPersonHabitsPremiumAmount(Person p, int BasePremium);
	
	
}

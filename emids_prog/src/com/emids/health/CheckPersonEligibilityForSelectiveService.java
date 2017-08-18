package com.emids.health;

public class CheckPersonEligibilityForSelectiveService implements CheckPerson {

	public int isHypertension(Person p, int BasePremium) {
		return BasePremium * 1 / 100;
	}

	@Override
	public int getHypertensionPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 1 / 100;
	}

	@Override
	public int getBloodPressurePercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 1 / 100;
	}

	@Override
	public int getBloodSugarPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 1 / 100;
	}

	@Override
	public int getOverweightPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 1 / 100;
	}

	@Override
	public int getSmokingPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 3 / 100;
	}

	@Override
	public int getAlcoholPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 3 / 100;
	}

	@Override
	public int getDailyExercisePercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 3 / 100;
	}

	@Override
	public int getDrugsPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 3 / 100;
	}

	@Override
	public int getMalePercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 2 / 100;
	}

	@Override
	public int getFemalePercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 2 / 100;
	}

	@Override
	public int getOtherPercent(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 2 / 100;
	}

	@Override
	public int getBelow18(int BasePremium) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int get18and25(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 10 / 100;
	}

	@Override
	public int get25and30(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 10 / 100;
	}

	@Override
	public int get30and35(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 10 / 100;
	}

	@Override
	public int get35and40(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 10 / 100;
	}

	@Override
	public int getAbove40(int BasePremium) {
		// TODO Auto-generated method stub
		return BasePremium * 20 / 100;
	}

	@Override
	public double getPersonAgePremiumAmount(Person p, int BasePremium) {
		if (p.getAge() < 18) {
			p.AgePremiumAmount = getBelow18(BasePremium);
		} else if (p.getAge() >= 18 && p.getAge() <= 25) {
			p.AgePremiumAmount = get18and25(BasePremium);
		} else if (p.getAge() >= 25 && p.getAge() <= 30) {
			p.AgePremiumAmount = get25and30(BasePremium);
		} else if (p.getAge() >= 30 && p.getAge() <= 35) {
			p.AgePremiumAmount = get30and35(BasePremium);
		} else if (p.getAge() >= 30 && p.getAge() <= 35) {
			p.AgePremiumAmount = get35and40(BasePremium);
		} else {
			p.AgePremiumAmount = getAbove40(BasePremium);
		}
		System.out
				.println("Age Premium Amount : INCREASE (18-25 -> + 10% | 25-30 -> +10% | 30-35 -> +10% | 35-40 -> +10% | 40+ -> 20% )"
						+ p.AgePremiumAmount);
		return p.AgePremiumAmount;
	}

	@Override
	public double getPersonGenderPremiumAmount(Person p, int BasePremium) {

		if (p.gender.getCode() == 1) {
			p.GenderPremiumAmount = BasePremium * 2 / 100;
		}
		System.out.println("Gender Premium Amount : (Increase 2%) "
				+ p.GenderPremiumAmount);
		return p.GenderPremiumAmount;
	}

	@Override
	public double getPersonHealthPremiumAmount(Person p, int BasePremium) {
		if (p.isHyperTension()) {
			p.healthPremiumAmount += getHypertensionPercent(BasePremium);
		}
		if (p.isBloodPressure()) {
			p.healthPremiumAmount += getBloodPressurePercent(BasePremium);
		}
		if (p.isBloodSugar()) {
			p.healthPremiumAmount += getBloodSugarPercent(BasePremium);
		}
		if (p.isOverWeight()) {
			p.healthPremiumAmount += getOverweightPercent(BasePremium);
		}
		System.out
				.println("Health Premium Amount : (Hypertension | Blook pressure | Blood sugar | Overweight Increase of 1% per condition)  "
						+ p.healthPremiumAmount);
		return p.healthPremiumAmount;
	}

	@Override
	public double getPersonHabitsPremiumAmount(Person p, int BasePremium) {
		if (p.isSmoking()) {
			p.habitsPremiumAmount += getSmokingPercent(BasePremium);
		}
		if (p.isAlcohol()) {
			p.habitsPremiumAmount += getAlcoholPercent(BasePremium);
		}
		if (p.isExcercise()) {
			p.habitsPremiumAmount -= getDailyExercisePercent(BasePremium);
		}
		if (p.isDrugs()) {
			p.habitsPremiumAmount += getDrugsPercent(BasePremium);
		}
		System.out
				.println("Habits Premium Amount : (Daily exercise) -> Reduce 3% -> (Smoking | Consumption of alcohol | Drugs) -> Increase 3% "
						+ p.habitsPremiumAmount);
		return p.habitsPremiumAmount;
	}
}

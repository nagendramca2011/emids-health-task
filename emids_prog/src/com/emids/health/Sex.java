package com.emids.health;

public enum Sex {

	MALE(1), FEMALE(2), OTHER(3);

	private int flag;

	private Sex(int flag) {
		this.flag = flag;
	}

	public int getCode() {
		return this.flag;
	}
}

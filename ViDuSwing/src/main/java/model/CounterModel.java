package model;

public class CounterModel {
	private int value;
	
	public CounterModel() {
		this.value=0;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment() {
		this.value++;
	}
	
	public void decrement() {
		this.value--;
	}
	
	public void reset() {
		this.value=0;
	}
}

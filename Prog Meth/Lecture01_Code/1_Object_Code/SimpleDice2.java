
public class SimpleDice2 {
	final static int MAX = 6;
	int faceValue;

	public SimpleDice2(int faceValue) {
		// faceValue = val
		this.faceValue = faceValue;
	}

	public SimpleDice2() { //java รู้ว่า method ชื่อเดียวกันแต่คนละ parameter ถือว่าเป็นคนละ method
		this.faceValue = this.roll();
	}

	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
}

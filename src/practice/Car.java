package practice;

public class Car {
	// 燃費（Km/L）
	private double fuelCost;
	// 残量（L）
	private double fuelAmount;

	// コンストラクタを作成
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(int distance) {// moveメソッド
		System.out.println(distance + "km 走ります"); // ・"xx km 走ります"を出力
		this.fuelAmount -= (distance / fuelCost); // ・残量を計算
	}

	public double getFuelAmount() {// fuelAmountを取得するメソッドを作成
		return this.fuelAmount;//計算された残量を戻り値として返す
	}

}

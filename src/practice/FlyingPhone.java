package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	private int time;
	
	public FlyingPhone(int time) {
		this.time = time;
	}
	public void fly() {
		System.out.println( time + "分間、飛びます。");
	}
	public void call(String number) {
		System.out.println( number  + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	public void powerOff() {
		Flying.super.powerOff();
	}
}
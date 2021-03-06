package dmaps.study.mentoring2;

public class Car extends Vehicle{
	private String name = "자동차";
	int displacement; // 배기량
	private int maxSpeed;
	private double zeroBack; // 100km 속력이 몇초만에 나오는지
	public static int wheelSize; 
	
	//차의 정보를 출력
	public void printInfo() {
		System.out.println(getVihicle() + " : " + name);
		System.out.println("탑승인원 : " + this.getSeater());
		System.out.println("배기량 : " + displacement);
		System.out.println("최고속력 : " + maxSpeed);
		System.out.println("제로백 : " + zeroBack + "초");
	}
	
	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getZeroBack() {
		return zeroBack;
	}

	public void setZeroBack(double zeroBack) {
		this.zeroBack = zeroBack;
	}
}
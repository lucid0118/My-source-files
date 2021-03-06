package dmaps.study.mentoring3;

public class Unit {
	private String name;
	private int hp;
	private int dp;
	private int power;
	
	public void attack(Unit unit) {
		System.out.println(name + "이" + power + "의 공격력으로 때렸다.");
		beHit(unit);
	}
	
	public void beHit(Unit unit) {
		unit.hp -= this.power - unit.dp;
		System.out.println(unit.name + "의 hp는 " + unit.hp + "가 남았다.");
	}
	
	public boolean checkHp() {
		if(hp <= 0) return true;
		
		else return false;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDefence() {
		return dp;
	}
	public void setDefence(int defence) {
		this.dp = defence;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}

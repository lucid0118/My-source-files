package dmaps.study.mentoring3;

public class Monster extends Unit{
	
	public Monster(String name, int hp, int dp, int attack) {
		this.setName(name);
		this.setHp(hp);
		this.setDefence(dp);
		this.setPower(attack);
	}
}

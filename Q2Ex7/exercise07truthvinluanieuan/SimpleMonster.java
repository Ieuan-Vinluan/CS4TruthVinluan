package exercise07truthvinluanieuan;


import java.util.ArrayList;

public class SimpleMonster {
    private final String name, type, strongAgainst, weakAgainst;
    private int maxHP, hp, atk, def, xp, lvl;
    // changed ArrayList<Monster> to ArrayList<SimpleMonster>
    private static ArrayList<SimpleMonster> monsterList = new ArrayList<>();
    
    // changed public Monster(... to public SimpleMonster(...
    public SimpleMonster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    
    // added setter methods for maxHP, hp, atk, and def
    public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
    
    public void setHp(int hp) {
		this.hp = hp;
	}
    
    public void setAtk(int atk) {
		this.atk = atk;
	}
    
    public void setDef(int def) {
		this.def = def;
	}
    
    // changed public static ArrayList<Monster> to public static ArrayList<SimpleMonster>
    public static ArrayList<SimpleMonster> getMonsterList() {
        return monsterList;
    }
    
    // changed Monster m to SimpleMonster m
    public void attack(SimpleMonster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void restoreHealth(){
        hp = maxHP;
    }

}

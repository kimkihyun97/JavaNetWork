package Diabloo.Monster;

import Diabloo.Character.Character;
import Diabloo.WeaPon.WeaponBehavior;

public abstract class Monster {
    public String  name ;
    public int MonsterHp;
    public int MonsterMp;
    WeaponBehavior Weapon ;
    Diabloo.Character.Character Character ;
    public void Info(){
        System.out.println(name+"가 출현했습니다.");
    }
    public void Attacked(WeaponBehavior weapon){
        Weapon = weapon ;
        MonsterHp -=Weapon.Attack() ;
        if(MonsterHp<=0) System.out.println(name+"가 죽었습니다");
        else {
            System.out.println(name+"의 체력이 "+Weapon.Attack()+" 닳았습니다.");
            System.out.println(name + "의 현재 남은 체력은 " + MonsterHp + "입니다.");
        }
    }
    public void Attack(Character character){
        Character = character ;
        Character.Hp -= 75;
        if(Character.Hp<=0){
            Character.Level =1 ;
            System.out.println(Character.name+"가 죽었습니다.");
            System.out.println("죽음의 대한 페널티로 "+Character.name+"의 Level이 "+Character.Level+"이 됩니다");

        }
        else if(MonsterHp<=0) {
            System.out.println(name+"가 죽어 "+Character.name+"은 공격 받지 않았습니다.");
        }
        else {
            Character = character;
            System.out.println(Character.name + "이/가 " + name + "의 공격을 받았습니다.");
            System.out.println(Character.name + "의 Hp : " + Character.Hp);
        }
    }
}

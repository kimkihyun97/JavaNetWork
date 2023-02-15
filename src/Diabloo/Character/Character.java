package Diabloo.Character;

import Diabloo.Monster.Monster;
import Diabloo.WeaPon.WeaponBehavior;

public abstract class Character {
    public int Hp;
    public int Mp;
    public Double Xp;
    public int Level ;
    public String name ;
    WeaponBehavior Weapon ; // Associaiton-Aggregation(부품같은 느낌, new 사용하면 Association-Composition)
    Diabloo.Monster.Monster Monster;

    public void Info() {
        System.out.println("캐릭터가 생성되었습니다. \n 캐릭터 정보");
        System.out.println("이름 : "+name+" / 체력 : "+Hp+" / 마나 : "+Mp+" / 경험치 : "+Xp+" / 레벨 : "+Level);
    }

    public void CheckEx() {
        if(Xp>=100.0) {
            Xp -=100.0;
            Level++;


            System.out.println(name+"의 Level이 Level"+Level+"로 레벨업했습니다.");
        }
    }

    public void setWeapon(WeaponBehavior weapon) {
        Weapon = weapon;

        System.out.println(name+"가 "+Weapon.getitem()+"을 장착했습니다.");

    }
    public final void PerformWeapon(Monster monster){
        Monster = monster ;
        System.out.print(name+"가 "+Monster.name+"을/를 ");
        Weapon.UseWeapon();
        Xp+=15.7 ;
    }

}

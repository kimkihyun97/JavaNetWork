package Diabloo.WeaPon;

import Diabloo.WeaPon.WeaponBehavior;

public class Orb implements WeaponBehavior {
    public int Attack ;
    public String Item;
    public Orb(int attack,String item) {
        Attack = Attack ;
        Item = item ;
    }
    @Override
    public String getitem() {
        return Item;
    }

    @Override
    public void UseWeapon() {
        System.out.println("오브를 이용해 마법 공격을 합니다.");
    }

    @Override
    public int Attack() {
        return Attack;
    }
}

package Diabloo.WeaPon;

import Diabloo.WeaPon.WeaponBehavior;

public class Sword implements WeaponBehavior {
    public int Attack ;
    public String Item;

    public Sword(int attack, String item) {
        Attack = Attack ;
        Item = item;
    }

    @Override
    public String getitem() {
        return Item;
    }


    @Override
    public void UseWeapon() {
        System.out.println("칼을 사용해 공격합니다.");
    }
    @Override
    public int Attack() {
        return Attack;
    }
}

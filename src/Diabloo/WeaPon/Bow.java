package Diabloo.WeaPon;

import Diabloo.WeaPon.WeaponBehavior;

public class Bow implements WeaponBehavior {
    public int Attack ;
    public String Item;
    public Bow(int attack, String item) {
        Attack = attack ;
        Item = item;
    }

    @Override
    public String getitem() {
        return Item;
    }


    @Override
    public void UseWeapon() {
        System.out.println("화살을 쏩니다.");
    }
    @Override
    public int Attack() {
        return Attack;
    }
}

package Diabloo.WeaPon;

import Diabloo.WeaPon.WeaponBehavior;

public class Axes implements WeaponBehavior {
    public int Attack ;
    public String Item;

    public Axes(int attack, String item) {
        Attack = attack ;
        Item = item;
    }

    @Override
    public String getitem() {
        return Item;
    }

    @Override
    public void UseWeapon() {
        System.out.println("도끼를 사용해 공격합니다.");
    }

    @Override
    public int Attack() {
        return Attack;
    }
}

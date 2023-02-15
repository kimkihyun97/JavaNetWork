package Diabloo.function;

import Diabloo.Character.Character;
import Diabloo.Monster.Monster;
import Diabloo.WeaPon.WeaponBehavior;

public class CharacterThread extends Thread{
    Character Character;
    Monster Monster ;
    WeaponBehavior Weapon ;
    long Attackspeed;
    public CharacterThread(Character character,Monster monster, WeaponBehavior weapon,long attackspeed) {
        Character = character;
        Monster = monster;
        Weapon = weapon;
        Attackspeed = attackspeed ;
    }
    @Override
    public void run() {
        try {

            while (Monster.MonsterHp > 0) {

                Thread.sleep(Attackspeed);
                Character.PerformWeapon(Monster);
                System.out.println();
                Monster.Attacked(Weapon);
                System.out.println();
                Character.CheckEx();
                System.out.println();

            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}

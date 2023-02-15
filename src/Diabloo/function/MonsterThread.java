package Diabloo.function;
import Diabloo.Character.Babarian;
import Diabloo.Character.Character;
import Diabloo.Character.Sorceress;
import Diabloo.Monster.Monster;
import Diabloo.Monster.Ork;
import Diabloo.WeaPon.*;

public class MonsterThread extends Thread{
    Character Character;
    Monster Monster ;
    WeaponBehavior Weapon ;

    public MonsterThread(Character character, Monster monster, WeaponBehavior weapon) {
        Character = character;
        Monster = monster;
        Weapon = weapon;
    }
    @Override
    public void run() {
        try {
            while (Character.Hp > 0) {

                Thread.sleep(1500);
                Monster.Attack(Character);
                System.out.println();

            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

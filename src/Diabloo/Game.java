package Diabloo;
import Diabloo.Character.Babarian;
import Diabloo.Character.Character;
import Diabloo.Character.Sorceress;
import Diabloo.Monster.Ork;
import Diabloo.WeaPon.*;
import Diabloo.function.CharacterThread;
import Diabloo.function.Delay;
import Diabloo.function.MonsterThread;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Character character ;
        WeaponBehavior Item ;
        long attackspeed;
        Scanner in = new Scanner(System.in) ;
        System.out.print("Game ");
        Delay.delay(700);
        for(int i=0;i<2;i++) {
            System.out.print("-");
            Delay.delay(700);
        }
        System.out.print("K");
        Delay.delay(700);
        System.out.print("i");
        Delay.delay(700);
        System.out.print("l");
        Delay.delay(700);
        System.out.print("l");
        Delay.delay(700);
        System.out.print(" t");
        Delay.delay(700);
        System.out.print("h");
        Delay.delay(700);
        System.out.print("e");
        Delay.delay(700);
        System.out.print(" r");
        Delay.delay(700);
        System.out.print("e");
        Delay.delay(700);
        System.out.print("d");
        Delay.delay(700);
        System.out.print(" o");
        Delay.delay(700);
        System.out.print("r");
        Delay.delay(700);
        System.out.print("k");
        Delay.delay(700);
        for(int i=0;i<2;i++) {
            System.out.print("-");
            Delay.delay(700);
        }
        System.out.println();
        for(int i=0;i<7;i++){
            System.out.print(".");
            Delay.delay(500);
        }
        System.out.println();
        while(true) {
            System.out.println("1) Game start, 2) End");
            int button = in.nextInt();
            if (button == 2) {
                System.out.println("Game over");
                break ;
            } else if (button == 1) {
                while(true) {
                    System.out.println("직업을 선택 하세요");
                    System.out.println("1) 소서러, 2) 바바리안, 3) 아마존");
                    int career = in.nextInt();

                    if (career == 1) {
                        System.out.println("이름 을 입려하세요 : ");
                        in.nextLine();
                        String nick = in.nextLine();
                        character = new Sorceress(nick);
                        for(int i=0;i<3;i++){
                            System.out.print(". ");
                            Delay.delay(1000);
                        }
                        System.out.println();
                    } else if (career == 2) {
                        System.out.println("이름 을 입려하세요 : ");
                        in.nextLine();
                        String nick = in.nextLine();
                        character = new Babarian(nick);
                        for(int i=0;i<3;i++){
                            System.out.print(". ");
                            Delay.delay(1000);
                        }
                        System.out.println();
                    } else if (career == 3) {
                        System.out.println("이름 을 입려하세요 : ");
                        in.nextLine();
                        String nick = in.nextLine();
                        character = new Babarian(nick);
                        for(int i=0;i<3;i++){
                            System.out.print(". ");
                            Delay.delay(1000);
                        }
                        System.out.println();
                    } else if (career == 0) {
                        System.out.println("처음으로 돌아갑니다.");
                        break;

                    } else {
                        System.out.println("잘못된 입력입니다. 다시입력하세요 \n 처음으로 돌아기려면 0번을 누르세요");
                        continue;
                    }
                    System.out.println("환영합니다 용사님! World에 입장 중입니다 ");
                    for(int i=0;i<6;i++){
                        System.out.print(". ");
                        Delay.delay(1000);
                    }
                    System.out.println();
                    System.out.println("World에 입장하였습니다.");

                    for(int i=0;i<6;i++){
                        System.out.print(". ");
                        Delay.delay(1000);
                    }
                    System.out.println();

                    System.out.println("용사님! 저 앞에 몬스터가 있습니다. 가까이 가보세요....!");
                    for(int i=0;i<4;i++){
                        System.out.print(". ");
                        Delay.delay(1000);
                    }
                    System.out.println();
                    Ork ork = new Ork("red ork");
                    ork.Info();
                    while(true) {
                        System.out.println("1) 싸운다, 2) 도망친다");
                        int choice = in.nextInt();
                        if(choice==1) {
                            Delay.delay(1000);
                            System.out.println("저기 무기가 있어요! 어서 무기를 장착하세요");
                            Delay.delay(1000);
                            while(true) {
                                System.out.println("이름/타입/공격력/공격속도(추가예정)");
                                Delay.delay(500);
                                System.out.println("1) Buserker/Axes/200/1500, 2) Silpheed/Bow/100/500, 3) Excalibur/Sword/150/1000, 4) Obscura/Orb/500/3000");
                                int weapon = in.nextInt();
                                if(weapon==1){
                                    Item = new Axes(200, "Buserker");
                                    attackspeed = 1500;
                                }
                                else if(weapon==2){
                                    Item = new Bow(100, "Silpheed");
                                    attackspeed = 500;
                                }
                                else if(weapon==3){
                                    Item = new Sword(150,"Excalibur");
                                    attackspeed = 1000;
                                }
                                else if(weapon==4){
                                    Item = new Orb(500,"Obscura");
                                    attackspeed = 3000;

                                }
                                else{
                                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
                                    continue;
                                }
                                character.setWeapon(Item);
                                Delay.delay(1000);
                                System.out.println("몬스터가 다가 오고 있어요! 공격하세요!");
                                Delay.delay(1000);
                                MonsterThread mthread = new MonsterThread(character,ork,Item);
                                CharacterThread cthread = new CharacterThread(character,ork,Item,attackspeed);

                                while(true){
                                    mthread.start();
                                    cthread.start();
                                    if(ork.MonsterHp==0){
                                        System.out.println("축하합니다 용사님! 당신이 몬스터를 쓰러트렸습니다!!");
                                        System.exit(1);
                                    }
                                    else if(character.Hp==0){
                                        System.out.println("당신은 죽었습니다.");
                                        Delay.delay(1500);
                                        System.out.println("복수를 원하시면 1번을 게임을 종료하고 싶다면 2번을 누르세요");
                                        int push = in.nextInt();
                                        if(push==1){
                                            System.out.println("다시 한번 힘내세요!");
                                            break;
                                        }
                                        else{
                                            System.out.println("Game over");
                                            System.exit(1);

                                    }
                                }

                                }

                            }

                        }
                        else if(choice==2){
                            System.out.println("도망가던 당신은 오크에게 잡혀 죽었습니다...");
                            for(int i=0;i<5;i++) {
                                System.out.print(".");
                                Delay.delay(1500);
                            }
                            System.out.println();
                            System.out.println("당신은 다시 태어났습니다.");
                            Delay.delay(1000);
                            break;

                        }
                        else{
                            System.out.println("잘못된 입력입니다. 다시 입력하세요!!!");
                        }
                    }
                }

                    }
            else {
                System.out.println("잘못된 입력입니다. 다시 입력해 주세요!");
            }
        }
    }
}

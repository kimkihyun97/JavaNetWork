package PocketmonJAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Create{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        while(true){
            System.out.println("총 "+pocketmon.count+"마리의 포켓몬이 생성 되었습니다.");
            System.out.print("1 : 포켓몬 생성, 2: 프로그램 종료  ");
            int menu = in.nextInt() ;
            if(menu == 2){
                System.out.println("시스템을 종료합니다");
                break; }
            else if(menu==1){
                System.out.println("생성할 포켓몬을 선택해 주세요");
                System.out.println("1 :피카츄, 2: 꼬부기, 3: 파이리 ");
                int num = in.nextInt() ;
                System.out.print("플레이어 이름 입력 : ");
                in.nextLine();
                String master = in.nextLine();
                System.out.println("사용 가능한 기술 입력(총 3개 입력)");
                List<String> sk = new ArrayList<>();
                for(int i =0;i<3;i++){
                 sk.add(in.nextLine());
                }
               if(num==1){
                    pocketmon p = new Pikachu(master,sk) ;
                    p.Info() ;
                    System.out.print("공격 번호 선택 : ");
                    int attacknum = in.nextInt();
                    p.Attack(attacknum) ;
                         }
               else if(num==2){
                   pocketmon p = new Ggoboogi(master,sk);
                   p.Info() ;
                   System.out.print("공격 번호 선택 : ") ;
                   int attacknum = in.nextInt();
                   p.Attack(attacknum) ;
                              }
               else if(num==3){
                   pocketmon p = new Pairi(master,sk) ;
                   p.Info() ;
                   System.out.print("공격 번호 선택 : ");
                   int attacknum = in.nextInt();
                   p.Attack(attacknum) ;
                              }
               else{
                   System.out.println("메뉴에서 골라주세요");
               }
            }
        else{
            System.out.println("메뉴에서 골라 주세요");
        }
        }
    }
}




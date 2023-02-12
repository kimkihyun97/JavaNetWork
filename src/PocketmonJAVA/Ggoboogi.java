package PocketmonJAVA;

import java.util.List;

public class Ggoboogi extends pocketmon{
    String name = "꼬부기" ;
    public Ggoboogi(String owner, List<String> skills) {
        super(owner, skills);
        System.out.println(name+" 생성");
    }
    @Override
    protected void Attack(int idx){
        System.out.println("꼬북꼬북! "+owner+"의 "+name+"가 "+skills.get(idx-1)+" 공격 시전!");
    }
    private void Swim(){
        System.out.print(name+"가 수영을 합니다.");
    }
}

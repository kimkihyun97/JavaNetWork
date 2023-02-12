package PocketmonJAVA ;

import java.util.List;

public class Pikachu extends pocketmon {
    String name = "피카츄" ;
    public Pikachu(String owner, List<String> skills) {
        super(owner, skills);
        System.out.println(name+" 생성");
    }
    @Override
    protected void Attack(int idx){
        System.out.println("삐까삐까! "+owner+"의 "+name+"가 "+skills.get(idx-1)+" 공격 시전!");
    }
}

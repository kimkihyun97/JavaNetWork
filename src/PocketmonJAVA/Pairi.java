package PocketmonJAVA;

import java.util.List;

public class Pairi extends pocketmon{
    String name = "파이리" ;

    public Pairi(String owner, List<String> skills) {
        super(owner, skills);
        System.out.println(name+" 생성");
    }
    @Override
    protected void Attack(int idx){
        System.out.println("파읠파읠! "+owner+"의 "+name+"가 "+skills.get(idx-1)+" 공격 시전!");
    }

}

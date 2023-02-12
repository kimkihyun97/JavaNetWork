package PocketmonJAVA ;
import java.util.List;

abstract class pocketmon {
    protected String owner;
    protected List<String> skills;
    public static int count = 0 ;

    protected pocketmon(String owner, List<String> skills) {
        this.owner = owner;
        this.skills = skills;
        this.count++ ;
    }

    protected String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    protected void Info() {
        System.out.println(owner+"의 포켓몬이 사용 가능한 스킬) ");
        int idx = 1 ;
        for (String skill : skills) {
            System.out.print(idx +" : "+skill+" ");
            idx++ ;
        }
        System.out.println();
    }
    protected void Attack(int idx){}
}
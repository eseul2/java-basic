package project.page;

import java.util.ArrayList;

public class PagingRepository {

    private ArrayList<Paging> pagings = new ArrayList<>();


    public void setPagings(ArrayList<Paging> pagings) {
        this.pagings = pagings;
    }


    // 저장해주는 기능
    public void save(Paging paging) {
        pagings.add(paging);
    }


    // 가져오는.. .
    public ArrayList<Paging> getPagings (){
        return pagings;
    }
}

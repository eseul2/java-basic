package project.membership;

import java.util.ArrayList;

public class MembershipRepository {

    private ArrayList<Membership> memberships = new ArrayList<>();


    public void setMemberships(ArrayList<Membership> memberships) {
        this.memberships = memberships;
    }


    // 누군가에게 넘겨 받아서 ArrayList에 저장해주는
    public void save(Membership membership) {
        memberships.add(membership);
    }

    // 자신이 가지고 있는 창고의(ArrayList) 내용물을 다른 누군가에게 전달
    public ArrayList<Membership> getMemberships() {
        return memberships;
    }
}

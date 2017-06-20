import java.util.ArrayList;
import java.util.List;


class Group {
    private String groupName;
    private List<User> users = new ArrayList<>();
    List<User> getUsers() {
        return users;
    }
    void addUser(User u){
        this.users.add(u);
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    String getGroupName() {
        return groupName;
    }
}

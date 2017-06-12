import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sai Lalith Pathi on 09-Jun-17.
 */
public  class Authentication {
    static HashMap<String,String> userList = new HashMap<>();
    static boolean isValidUser(String userName,String password){
        addNewUser("sai","sai");
        for(Map.Entry<String,String> user : userList.entrySet()){
            if(user.getKey().equals(userName) && user.getValue().equals(password)){
                return true;
            }
        }
        return false;
    }
    static void addNewUser(String userName,String password){
        userList.put(userName,password);
    }
}

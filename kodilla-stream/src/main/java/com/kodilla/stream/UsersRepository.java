package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList(){
        List<User>users = new ArrayList<>();
        users.add(new User("Whalter Wite",50,7,"chemist"));
        users.add(new User("Jessie Pinkman",25,4648,"sales"));
        users.add(new User("Tuco Salamanca",34,116,"manager"));
        users.add(new User("Gus Fring",49,0,"board"));
        users.add(new User("Gale Boetticher",44,2,"chemist"));
        users.add(new User("Mike Echremant",57,0,"security"));
        return users;
    }
}

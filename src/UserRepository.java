

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class UserRepository  implements  Iterable {
    ArrayList<User> data = new ArrayList<>();

    public  void addUser (User user){

        if(user.isAuth)  data.add(user);

    }


    public void unLogin(){

        for (User user : this.data){
            if (user.isAdmin != true){
                user.unLogin();

            }
        }

    }




    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}

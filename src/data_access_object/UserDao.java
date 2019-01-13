package data_access_object;

import java.util.List;
import java.util.Optional;

public class UserDao implements GenericDao<User> {
    @Override
    public void create(User user) {
        //Insert the user into the data store
    }

    @Override
    public Optional<User> read(long id) {
        //Find the user in the data store and return the user
        return Optional.of(new User());
    }

    @Override
    public List<User> readAll() {
        //Return all users from the data store
        return List.of(new User(), new User());
    }

    @Override
    public void update(User user) {
        //Update the user in the data store
    }

    @Override
    public void delete(long id) {
        //Delete the user from the data store
    }
}

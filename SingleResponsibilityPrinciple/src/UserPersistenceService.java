public class UserPersistenceService {

    private final Store store = new Store();

    public UserPersistenceService(){
    }

    public void store(User user){
        this.store.store(user);
    }

}

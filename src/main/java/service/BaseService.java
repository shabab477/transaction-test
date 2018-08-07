package service;

/**
 * @author shabab
 * @since 8/2/18
 */
public abstract class BaseService {

    public void getId() {
        System.out.println("Calling " + this);
    }
}

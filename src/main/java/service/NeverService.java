package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author shabab
 * @since 8/2/18
 */
@Service
public class NeverService{

    @Autowired
    private NeverServiceThrower thrower;

    @Transactional
    public void getId() {
        System.out.println("Calling " + this);
        thrower.throwError();
    }
}

package service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author shabab
 * @since 8/2/18
 */
@Service
public class MandatoryService{

    @Transactional(value = Transactional.TxType.MANDATORY)
    public void getId() {
        System.out.println("Calling " + this);
    }
}

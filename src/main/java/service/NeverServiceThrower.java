package service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author shabab
 * @since 8/2/18
 */
@Service
public class NeverServiceThrower {

    @Transactional(value = Transactional.TxType.NEVER)
    public void throwError() {

    }
}

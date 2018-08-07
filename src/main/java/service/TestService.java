package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.transaction.Transactional;

/**
 * @author shabab
 * @since 7/30/18
 */
@Service
public class TestService {

    @Transactional
    public void callFirst() {
        TransactionStatus transactionStatus = TransactionAspectSupport.currentTransactionStatus();
        System.out.println(transactionStatus.isCompleted());

    }

    @Transactional
    public void callSecond() {

        System.out.println("Called second");
    }
}

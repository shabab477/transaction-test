package service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author shabab
 * @since 8/2/18
 */
@Service
@Transactional(value = Transactional.TxType.REQUIRES_NEW)
public class RequiresNewService extends BaseService {
}

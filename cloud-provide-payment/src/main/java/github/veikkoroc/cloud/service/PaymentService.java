package github.veikkoroc.cloud.service;

import github.veikkoroc.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 18:07
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") int id);

}

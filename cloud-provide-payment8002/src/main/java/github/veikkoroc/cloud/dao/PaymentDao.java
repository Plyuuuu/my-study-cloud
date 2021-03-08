package github.veikkoroc.cloud.dao;

import github.veikkoroc.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 17:37
 */
@Mapper // 推荐使用这个注解， @Repository 插入可能会出现问题
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") int id);
}

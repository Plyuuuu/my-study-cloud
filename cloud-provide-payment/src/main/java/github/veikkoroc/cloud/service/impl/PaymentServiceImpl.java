package github.veikkoroc.cloud.service.impl;

import github.veikkoroc.cloud.dao.PaymentDao;
import github.veikkoroc.cloud.pojo.Payment;
import github.veikkoroc.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 18:07
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService{

    // @Autowired // spring 里的，有时候会报错
    @Resource // Java 自带的
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(int id){

        log.info("PaymentServiceImpl要查询的id:[{}]",id);
        return paymentDao.getPaymentById(id);
    }

}

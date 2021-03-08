package github.veikkoroc.cloud.controller;


import github.veikkoroc.cloud.pojo.CommonResult;
import github.veikkoroc.cloud.pojo.Payment;
import github.veikkoroc.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 19:58
 */

@RestController
@Slf4j
public class PaymentController {


    @Resource   // 或者 @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult creat(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("================ 插入结果:[{}] ==================",i);

        if (i > 0){

            return new CommonResult(200,"插入数据成功",i);
        }else {

            return new CommonResult(444,"插入数据失败",null);
        }

    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable int id){

        log.info("PaymentController要查询的id:[{}]",id);
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("================ 查询结果:[{}] ==================",paymentById);
        log.info("================ 端口号为:[{}] ==================",serverPort);

        if (paymentById != null){

            return new CommonResult(200,"查询成功",paymentById);
        }else {

            return new CommonResult(444,"查询失败:"+ id,null);
        }

    }

}

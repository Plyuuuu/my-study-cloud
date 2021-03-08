package github.veikkoroc.cloud.controller;

import github.veikkoroc.cloud.pojo.CommonResult;
import github.veikkoroc.cloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 *
 * RestTemplate:提供多种便捷访问远程 HTTP 服务的方法，是一种简单便捷的访问restful服务模板，是Spring提供的用于访问Rest服务的客户端模板工具
 *
 *   使用：使用restTemplate访问restful接口非常的简单粗暴。（url，requestMap，ResponseBean.class）这三个参数分别表示rest请求地址、请求参数、Http响应转换被转换成的对象类型
 *
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/8 9:00
 */
@Slf4j
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") int id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}

package github.veikkoroc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/3 17:01
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain {


    public static void main(String[] args) {

        SpringApplication.run(PaymentMain.class,args);
    }


}

package github.veikkoroc.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 17:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T       data;

    public CommonResult(Integer code,String message){

        this(code,message,null);
    }

}

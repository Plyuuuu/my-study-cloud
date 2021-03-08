package github.veikkoroc.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2021/3/7 17:27
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private int id;

    private String serial;

}

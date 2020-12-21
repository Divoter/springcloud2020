package com.divoter.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.divoter.springcloud.payment.model
 *
 * @author divoter
 * @date 2020/12/1 19:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;

    private String serial;

}

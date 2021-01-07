package com.divoter.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * com.divoter.springcloud.model
 *
 * @author divoter
 * @date 2021/1/7 20:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
    private Long id;
    private Long productId;
    private int total;
    private int used;
    private int residue;
}

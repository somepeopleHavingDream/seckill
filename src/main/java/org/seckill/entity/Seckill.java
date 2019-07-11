package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀实体类
 *
 * @author yangxin
 * 2019/07/11 21:48
 */
@Data
public class Seckill {
    private Long seckillId;
    private String name;
    private Integer number;
    private Date startTime;
    private Date endTime;
    private Date createTime;
}

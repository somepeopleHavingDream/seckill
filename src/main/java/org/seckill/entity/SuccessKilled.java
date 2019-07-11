package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * 成功秒杀实体类
 *
 * @author yangxin
 * 2019/07/11 21:53
 */
@Data
public class SuccessKilled {
    private Long seckillId;
    private Long userPhone;
    private short state;
    private Date createTime;

    // 变通
    // 多对一
    private Seckill seckill;
}

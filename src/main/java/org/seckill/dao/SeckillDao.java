package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * 秒杀Dao类
 *
 * @author yangxin
 * 2019/07/11 21:58
 */
public interface SeckillDao {
    /**
     * 减库存
     *
     * @param seckillId 秒杀记录Id
     * @param killTime 秒杀时间
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 通过秒杀记录Id获得秒杀记录
     *
     * @param seckillId 秒杀记录Id
     */
    Seckill getById(long seckillId);

    /**
     * 根据偏移量，查询秒杀商品列表
     *
     * @param offset 偏移量
     * @param limit 限定记录条数
     */
    List<Seckill> listByOffsetAndLimit(int offset, int limit);
}

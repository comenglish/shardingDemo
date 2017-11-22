package com.xiaomi.test.sharding.datasource;

import com.google.common.collect.Range;
import io.shardingjdbc.core.api.algorithm.sharding.RangeShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.RangeShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author huxiangwei
 * @version v1.0
 * @Package com.xiaomi.pos.merchant.db
 * @Description: 交易历史流水分表策略
 * @date 2017/11/14 17:00
 */
public final class TraceTableRangeShardingAlgorithm implements RangeShardingAlgorithm<Integer> {

    private final static Logger logger = LoggerFactory.getLogger(TraceTableRangeShardingAlgorithm.class);

    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Integer> shardingValue) {

        Range<Integer> value = shardingValue.getValueRange();
        Integer start = value.lowerEndpoint();
        Integer end = value.upperEndpoint();

        logger.info("TraceTableRangeShardingAlgorithm:{}~{}", start, end);
        logger.info("TraceTableRangeShardingAlgorithm availableTargetNames:{}", availableTargetNames);
        Collection<String> tables = new HashSet<String>();
        return tables;
    }
}

package com.xiaomi.test.sharding.datasource;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @author huxiangwei
 * @version v1.0
 * @Package com.xiaomi.pos.merchant.db
 * @Description: 交易历史流水分表策略
 * @date 2017/11/14 17:00
 */
public class TraceTableShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    private final static Logger logger = LoggerFactory.getLogger(TraceTableShardingAlgorithm.class);

    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Integer> shardingValue) {
        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
       /* if(null == shardingValue.getValue() || 0 == shardingValue.getValue()) {
            String value = gettBaseTraceRouteService().queryCurTraceHis();
            logger.info("TraceTableShardingAlgorithm value:{}", value);
            if(StringUtils.isEmpty(value)) {
                throw new UnsupportedOperationException();
            } else {
                return value;
            }
        } else {
            String s = gettBaseTraceRouteService().queryTraceHisByDay(new Long(shardingValue.getValue()));
            logger.info("TraceTableShardingAlgorithm value:{}, day:{}", s, shardingValue.getValue());
            return s;
        }*/
        
    }

}

package io.shardingsphere.algorithm;


import com.google.common.collect.Range;
import io.shardingsphere.api.algorithm.sharding.RangeShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.RangeShardingAlgorithm;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

/**
 * @atuthor lanping
 * @email lanping@cvte.com
 * @Decription 自定义分片逻辑 - 按天来分片
 * @date 2019-03-06 19:52
 */
@RequiredArgsConstructor
public class RangeDynamicDateForDayTableShardingAlgorithm implements RangeShardingAlgorithm<Date> {
    @Override
    public Collection<String> doSharding(Collection<String> tableNames, RangeShardingValue<Date> rangeShardingValue) {
        Collection<String> result = new LinkedHashSet<>();
        Range<Date> valueRange = rangeShardingValue.getValueRange();
        for (Date date = valueRange.lowerEndpoint(); date.compareTo(valueRange.upperEndpoint()) <=0 ; date = DateUtils.addDays(date, 1)) {
            String dateStr = String.format("%ty", date) + String.format("%tm",date);
            for (String each : tableNames) {
                if (each.endsWith(dateStr)){
                    result.add(each);
                }
            }
        }
        return result;
    }
}

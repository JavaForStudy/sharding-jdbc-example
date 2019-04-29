package io.shardingsphere;

import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

/**
 * @atuthor lanping
 * @email lanping@cvte.com
 * @Decription TODO
 * @date 2019-04-29 16:13
 */
public class Test {

    public static void main(String[] args) {

        DataSource dataSource;
        try {
            String shardingConfig = loadFromResource();
            dataSource = YamlShardingDataSourceFactory.createDataSource(shardingConfig.getBytes("utf-8"));
        } catch (Exception e ) {
            throw new RuntimeException("加载数据源配置异常... " + e);
        }


    }
    private static String loadFromResource() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(Class.class
                .getResourceAsStream("/" + "sharding-databases.yaml"), StandardCharsets.UTF_8));
        StringBuffer sb = new StringBuffer();
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        for (int count = reader.read(charBuffer); count > 0; count = reader.read(charBuffer)) {
            sb.append(charBuffer.flip());
        }
        return sb.toString();
    }
}

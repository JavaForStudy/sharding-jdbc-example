//package io.shardingsphere.config;
//
//import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.nio.CharBuffer;
//import java.nio.charset.StandardCharsets;
//
//
///**
// * @atuthor lanping
// * @email lanping@cvte.com
// * @Decription 数据源配置
// * @date 2019-03-15 18:28
// */
//
//@Slf4j
//@Configuration
//public class DataSourceConfiguration {
//
//    @Bean("dataSource")
//    public DataSource dataSource() {
//        DataSource dataSource;
//        try {
//            String shardingConfig = loadFromResource();
//            dataSource = YamlShardingDataSourceFactory.createDataSource(shardingConfig.getBytes("utf-8"));
//        } catch (Exception e ) {
//            throw new RuntimeException("加载数据源配置异常... " + e);
//        }
//        return dataSource;
//    }
//
//
//    private static String loadFromResource() throws Exception{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(Class.class
//                .getResourceAsStream("/" + "sharding-databases.yaml"), StandardCharsets.UTF_8));
//        StringBuffer sb = new StringBuffer();
//        CharBuffer charBuffer = CharBuffer.allocate(1024);
//        for (int count = reader.read(charBuffer); count > 0; count = reader.read(charBuffer)) {
//            sb.append(charBuffer.flip());
//        }
//        return sb.toString();
//    }
//
//
//}

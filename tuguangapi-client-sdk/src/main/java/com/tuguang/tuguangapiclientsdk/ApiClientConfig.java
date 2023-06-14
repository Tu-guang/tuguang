package com.tuguang.tuguangapiclientsdk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.tuguang.tuguangapiclientsdk.client.ApiClient;
/**
 *  客户端配置
 *
 * @author
 * @from
 */
@Configuration
@ConfigurationProperties("tuguang.client")
@Data
@ComponentScan
public class ApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ApiClient ApiClient() {
        return new ApiClient(accessKey, secretKey);
    }

}

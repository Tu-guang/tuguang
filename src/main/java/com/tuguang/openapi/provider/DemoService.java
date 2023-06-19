package com.tuguang.openapi.provider;

import java.util.concurrent.CompletableFuture;

/**
 * 示例服务
 *
 * @author
 * @from
 */
public interface DemoService {

    String sayHello(String name);

    String sayHello2(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

}
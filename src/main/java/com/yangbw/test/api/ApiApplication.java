package com.yangbw.test.api;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangbangwei
 */
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);

        DocsConfig config = new DocsConfig();
        // 项目根目录
        config.setProjectPath("/Users/yangbangwei/Documents/IDEA/api/src/main/java");
        // 项目名称
        config.setProjectName("api");
        // 声明该API的版本
        config.setApiVersion("V1.1");
        // 生成API 文档所在目录
        config.setDocsPath("/Users/yangbangwei/Documents/IDEA/api/doc");
        // 配置自动生成
        config.setAutoGenerate(Boolean.TRUE);
        // 执行生成文档
        Docs.buildHtmlDocs(config);
    }

}

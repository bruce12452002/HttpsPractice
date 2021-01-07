package home.bruce.HttpsPractice;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class HttpsPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HttpsPracticeApplication.class, args);
    }

    /**
     * https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#howto-enable-multiple-connectors-in-tomcat
     */
//    @Bean
//    public ServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createSslConnector());
//        return tomcat;
//    }

//    private Connector createSslConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        connector.setScheme("http");
//        connector.setSecure(false);
//        connector.setRedirectPort(8443);
//        return connector;
//    }

}

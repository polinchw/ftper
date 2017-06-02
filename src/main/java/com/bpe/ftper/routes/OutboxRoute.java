package com.bpe.ftper.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by polinchw on 6/2/17.
 */
@Component
public class OutboxRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("{{outbox-sftp}}")
                .to("{{outbox}}");
    }
}

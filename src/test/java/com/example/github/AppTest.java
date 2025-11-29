package com.example.github;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AppTest {

    @Test
    public void testContext(){
        Context context = Context.builder().payload("payload").signature("signature").secret("secret").build();
        Assertions.assertThat(context).isNotNull();
        Assertions.assertThat(context.getSignature()).isEqualTo("signature");
        Assertions.assertThat(context.getSecret()).isEqualTo("secret");
        Assertions.assertThat(context.getPayload()).isEqualTo("payload");
    }

    @Test
    public void testApp(){
        Assertions.assertThat(new App()).isNotNull();
    }
}

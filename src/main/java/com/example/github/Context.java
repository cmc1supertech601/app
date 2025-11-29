package com.example.github;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Context {
    private String payload;

    @NonNull
    private String signature;

    @NonNull
    private String secret;
}

package com.example.github;

public class App 
{
    public static void main( String[] args )
    {
        Context context = Context.builder().payload("payload").signature("signature").secret("secret").build();
        System.out.println(context);
    }
}

package com.smitechow.test;

import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class App
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args ) throws InterruptedException {
        logger.trace("trace hello sentry");
        System.out.println( "Hello World!" );
        logger.fatal("fatal hello sentry");
        System.out.println( "Hello World!" );
        logger.error("error hello sentry");
        System.out.println( "Hello World!" );
        logger.warn("warn hello sentry");
        System.out.println( "Hello World!" );
        logger.info("info hello sentry");
        System.out.println( "Hello World!" );
        logger.debug("debug hello sentry");
        System.out.println( "Hello World!" );
        TimeUnit.MINUTES.sleep(60);
    }
}

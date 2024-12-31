//package com.kaankaplan.userService;
//
//import brave.Tracing;
//import brave.sampler.Sampler;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import zipkin2.reporter.AsyncReporter;
//import zipkin2.reporter.Sender;
//import zipkin2.reporter.urlconnection.URLConnectionSender;
//
//import javax.annotation.PreDestroy;
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//public class CustomZipkinAutoConfiguration {
//
//    @Autowired
//    private AsyncReporter<zipkin2.Span> asyncReporter;
//
//    @Bean
//    @Primary
//    public Sender customZipkinSender() {
//        return URLConnectionSender.create("http://localhost:9411/api/v2/spans");
//    }
//
//    @Bean
//    @Primary
//    public AsyncReporter<zipkin2.Span> customZipkinReporter(Sender sender) {
//        return AsyncReporter.builder(sender).build();
//    }
//
//    @Bean
//    @Primary
//    public Tracing customTracing(AsyncReporter<zipkin2.Span> reporter) {
//        return Tracing.newBuilder()
//                .localServiceName("custom-service")
//                .spanReporter(reporter)
//                .sampler(Sampler.ALWAYS_SAMPLE)
//                .build();
//    }
//
//    @PreDestroy
//    public void flushRemainingSpansOnShutdown() {
//        CustomZipkinAutoConfiguration.log.info("Flushing remaining spans on shutdown");
//        asyncReporter.flush();
//        try {
//            long waitTimeMillis = TimeUnit.SECONDS.toMillis(10) + 500L; // Adjust the wait time as needed
//            asyncReporter.awaitTermination(waitTimeMillis, TimeUnit.MILLISECONDS);
//            CustomZipkinAutoConfiguration.log.debug("Flushing done - closing the reporter");
//            asyncReporter.close();
//        } catch (Exception e) {
//            CustomZipkinAutoConfiguration.log.error("Error while closing asyncReporter", e);
//        }
//    }
//}
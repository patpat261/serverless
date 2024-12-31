package com.kaankaplan.movieService;

//import org.springframework.context.annotation.Configuration;
//import javax.annotation.PreDestroy;
//import org.springframework.beans.factory.annotation.Autowired;
//import zipkin2.reporter.AsyncReporter;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//@Configuration
public class ZipkinShutdownConfig {
//
//    private static final Logger logger = LoggerFactory.getLogger(ZipkinShutdownConfig.class);
//
//    @Autowired
//    private AsyncReporter<zipkin2.Span> spanReporter;
//
//    @PreDestroy
//    public void onExit() {
//        if (spanReporter != null) {
//            try {
//                logger.info("Flushing remaining spans before shutdown...");
//                spanReporter.flush();
//                logger.info("Flush completed. Now closing the span reporter...");
//                spanReporter.close();
//                logger.info("Span reporter closed successfully.");
//            } catch (Exception e) {
//                logger.error("Error while closing the span reporter", e);
//            }
//        }
//    }
//

}

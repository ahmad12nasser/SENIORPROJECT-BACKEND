//package com.project.spring.config;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class Log4j2Configuration {
//	private final static Log log = LogFactory.getLog(Log4j2Configuration.class);
//
//	public static void main(String[] args) {
//		log.debug("Initialization of Log4j2 !!");
//	}
//
//	// @Bean
//	// @Qualifier("seniorLog4jInitialization")
//	// public MethodInvokingFactoryBean log4jInitialization() {
//	// MethodInvokingFactoryBean factoryBean = new MethodInvokingFactoryBean();
//	// factoryBean.setTargetClass(LoggerContext.class);
//	// factoryBean.setTargetMethod("getContext");
//	// factoryBean.setArguments(new Object[]{false});
//	// return factoryBean;
//	// }
//	//
//	// @Bean
//	// @Qualifier("seniorLog4jContext")
//	// public MethodInvokingFactoryBean log4jContext(
//	// @Qualifier("seniorLog4jInitialization") MethodInvokingFactoryBean
//	// log4jInitialization) {
//	// MethodInvokingFactoryBean factoryBean = new MethodInvokingFactoryBean();
//	// factoryBean.setTargetObject(log4jInitialization);
//	// factoryBean.setTargetMethod("setSingleton");
//	// factoryBean.setArguments(
//	// new Object[]{"file:///${WEB_CFG}/senior/log4j2.xml"});
//	// return factoryBean;
//	// }
//
//	public Log4j2Configuration() throws URISyntaxException {
//		// Initialize Log4j programmatically
//		LoggerContext context = (LoggerContext) LogManager.getContext(false);
//		String log4jConfigPath = System.getenv("LOG_CONF");
//		System.err.println(log4jConfigPath);
//		context.setConfigLocation(
//				new URI(System.getenv("LOG_CONF")));
//	}
//}

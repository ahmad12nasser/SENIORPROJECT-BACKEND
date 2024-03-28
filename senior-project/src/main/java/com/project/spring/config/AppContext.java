package com.project.spring.config;

import java.util.List;

import javax.sql.DataSource;

import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@PropertySources({@PropertySource("file:///${WEB_CFG}/senior/jdbc.properties")})
@EnableTransactionManagement
@ComponentScan("com.project.spring")
public class AppContext {

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.project.spring");
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(
				env.getRequiredProperty("senior.project.driverClassName"));
		dataSource.setUrl(env.getRequiredProperty("senior.project.url"));
		dataSource.setUsername(
				env.getRequiredProperty("senior.project.username"));
		dataSource.setPassword(
				env.getRequiredProperty("senior.project.password"));
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}

			@Override
			public void configurePathMatch(PathMatchConfigurer configurer) {
			}

			@Override
			public void configureContentNegotiation(
					ContentNegotiationConfigurer configurer) {
			}

			@Override
			public void configureAsyncSupport(
					AsyncSupportConfigurer configurer) {
			}

			@Override
			public void configureDefaultServletHandling(
					DefaultServletHandlerConfigurer configurer) {
			}

			@Override
			public void addFormatters(FormatterRegistry registry) {
			}

			@Override
			public void addInterceptors(InterceptorRegistry registry) {
			}

			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
			}

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
			}

			@Override
			public void configureViewResolvers(ViewResolverRegistry registry) {
			}

			@Override
			public void addArgumentResolvers(
					List<HandlerMethodArgumentResolver> argumentResolvers) {
			}

			@Override
			public void addReturnValueHandlers(
					List<HandlerMethodReturnValueHandler> returnValueHandlers) {
			}

			@Override
			public void configureMessageConverters(
					List<HttpMessageConverter<?>> converters) {
			}

			@Override
			public void extendMessageConverters(
					List<HttpMessageConverter<?>> converters) {
			}

			@Override
			public void configureHandlerExceptionResolvers(
					List<HandlerExceptionResolver> exceptionResolvers) {
			}

			@Override
			public void extendHandlerExceptionResolvers(
					List<HandlerExceptionResolver> exceptionResolvers) {
			}

			@Override
			public Validator getValidator() {
				return null;
			}

			@Override
			public MessageCodesResolver getMessageCodesResolver() {
				return null;
			}
		};
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

	/**
	 * Log4j2 Beans to be added
	 * https://stackoverflow.com/questions/57093867/java-how-to-configure-log4j2-xml
	 */

	@Bean
	public LoggerContext initLog4j() {
		try {
			LoggerContext context = Configurator.initialize("senior-project",
					System.getenv("WEB_CFG")
							+ "/senior/log4j2.xml" /* "classpath:log4j2.xml" */);
			return context;
		} catch (Exception e) {
			System.out.println("Error initializing Log4j2." + e);
			throw new RuntimeException("Error initializing Log4j2.", e);
		}
	}

	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSizePerFile(100242880);
		return resolver;
	}
}
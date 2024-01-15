package com.study.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1.스프링 컨텍스트 실행
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2.스프링이 관리해야 하는 것을 설정
        //HelloWorldConfiguration - @Configuration
        //name = @Bean
        System.out.println(ac.getBean("name")); // 메서드의 이름을 파라미터로
        System.out.println(ac.getBean("age"));
        System.out.println(ac.getBean("person"));
        System.out.println(ac.getBean("address2"));
        System.out.println(ac.getBean(Address.class)); // 클래스로 사용 가능.
        System.out.println(ac.getBean("person2MethodCall")); //메소드호출로 인자 전달 가능
        System.out.println(ac.getBean("person3Parameter"));

        System.out.println(ac.getBean(Person.class));//

        Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);
            //등록된 빈 출력, 설정파일(Configuration)도 빈으로 등록됨

    }
}

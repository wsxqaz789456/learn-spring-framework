package com.study.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
record Address(String first, String city){}

@Configuration //스프링 컨텍스트에 추가, 스프링 빈을 정의할 수 있음
public class HelloWorldConfiguration {

    @Bean //빈으로 등록
    public String name(){
        return "Name";
    }

    @Bean //빈으로 등록
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("name1", 11,new Address("joonggu", "seoul" ) );
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    @Primary
    public Person person4Parameter(String name, int age, Address address){
        return new Person(name, age, address);
    }


    @Bean(name = "address2")//name속성 지정으로 getBean에 사용가능. 속성을 지정할 경우 기존의 메소드명은 사용 불가
    @Primary // 후보군이 여러개일 경우 기본으로 지정
    public Address address(){
        return new Address("jongro", "seoul" );
    }

    @Bean(name = "address3")//name속성 지정으로 getBean에 사용가능. 속성을 지정할 경우 기존의 메소드명은 사용 불가
    public Address address3(){
        return new Address("jongro", "seoul" );
    }
}

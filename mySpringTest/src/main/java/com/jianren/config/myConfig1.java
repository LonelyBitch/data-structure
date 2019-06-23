package com.jianren.config;

import com.jiaren.animal.Cat;
import com.jiaren.animal.Dog;
import org.springframework.context.annotation.*;

@Configuration
@Import({Cat.class,Dog.class})
@EnableAspectJAutoProxy
public class myConfig1 {

    @Bean
    public Dog dog(){
        return new Dog();
    }

//    @Conditional(myCondition.class)
//    @Bean
//    public Cat cat(){
//        return new Cat();
//    }
}

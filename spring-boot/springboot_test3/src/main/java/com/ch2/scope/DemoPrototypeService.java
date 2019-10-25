package com.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/*
    编写Prototype的Bean
*/
@Service
@Scope("prototype")  //声明Scope为Prototype
public class DemoPrototypeService {

}

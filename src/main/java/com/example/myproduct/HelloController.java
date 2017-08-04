package com.example.myproduct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  protected static Logger logger=LoggerFactory.getLogger(HelloController.class);
  
  
  @RequestMapping("/")
  public String helloworld(){
    logger.debug("访问hello");
    return "Hello baby!";
  }
  
  @RequestMapping("/hello/{name}")
  public String hellName(@PathVariable String name){
    logger.debug("访问helloName,Name={}",name);
    return"Hello"+name;
  }
  
  
  //以下是DataController代码
//  @Autowired  
//  PersonRepository personRepository;  
//    
//  @RequestMapping("/save")  
//  public Person save(String name,String address,Integer age){  
//      logger.debug("save 开始");  
//      Person p=personRepository.save(new Person(null,name,age,address));  
//      logger.debug("save 结束");  
//      return p;  
//  }  
//    
//  @RequestMapping("/q1")  
//  public List<Person> q1(String address){  
//      logger.debug("q1 开始");  
//      logger.debug("q1 接收参数address={}",address);  
//      List<Person> people=personRepository.findByAddress(address);  
//      return people;  
//  }  
//    
//  @RequestMapping("/q2")  
//  public List<Person> q2(String name,String address){  
//      logger.debug("q2 开始");  
//      logger.debug("q2接收参数name={},address={}",name,address);  
//      return personRepository.findByNameAndAddress(name, address);  
//  }  
//    
//  @RequestMapping("/q3")  
//  public List<Person> q3(String name,String address){  
//      logger.debug("q3 开始");  
//      logger.debug("q3接收参数name={},address={}",name,address);  
//      return personRepository.withNameAndAddressQuery(name, address);  
//  }  
//    
//  @RequestMapping("/sort")  
//  public List<Person> sort(){  
//      logger.debug("sort 开始");  
//      List<Person> people=personRepository.findAll(new Sort(Direction.ASC,"age"));  
//      return people;  
//  }  
//    
//  @RequestMapping("/page")  
//  public Page<Person> page(){  
//      logger.debug("page 开始");  
//      Page<Person> people=personRepository.findAll(new PageRequest(1,2));  
//      return people;  
//  }  
  
  
}

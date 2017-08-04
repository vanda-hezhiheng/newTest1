package com.example.springbootsampleMySQL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.myproduct.HelloController;
import com.example.myproduct.SpringBootSampleMySqlApplication;

//import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SuppressWarnings("deprecation")
//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootSampleMySqlApplication.class)
@WebAppConfiguration
//@SpringBootTest
public class SpringBootSampleMySqlApplicationTests {

  private MockMvc mvc;
  
  @Before
  public void setUp() throws Exception{
    mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
  }
  
	@Test
	public void hello() throws Exception {
	  ((ResultActions) ((MockHttpServletRequestBuilder) mvc.perform(MockMvcRequestBuilders.get("/hello"))).accept(MediaType.APPLICATION_JSON))
	  .andExpect((status()).isOk())
	  .andExpect(content().string(equalTo("Hello World")));
	}

}

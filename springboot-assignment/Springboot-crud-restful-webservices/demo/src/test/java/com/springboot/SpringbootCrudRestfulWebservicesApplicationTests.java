package com.springboot;
import static org.mockito.Mockito.when;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.springboot.controller.EmployeeController;
import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
//import com.springboot.service.EmployeeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeController.class)
//@SpringBootTest
public class SpringbootCrudRestfulWebservicesApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	private EmployeeRepository employeeRepository;
	@Test
	public void getAllEmployeeTest() throws Exception
	{
	when(employeeRepository.findAll()).thenReturn(Collections.emptyList());
	MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.get("/api/v1").accept(MediaType.APPLICATION_JSON)).andReturn();
	System.out.println(mvcResult.getResponse());
	//Mockito.verify(employeeRepository).findAll();
	}
	
}
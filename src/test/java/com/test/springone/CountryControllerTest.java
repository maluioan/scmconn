package com.test.springone;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.test.springone.controller.CountryController;

// TODO !
public class CountryControllerTest {

	private MockMvc mockMvc;

//	@Before
	public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new CountryController()).build();
    }


}

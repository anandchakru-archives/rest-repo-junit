package jtest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtil {
	private static ObjectMapper json = new ObjectMapper();

	/**
	 * Save a new instance of App into DB
	 * 
	 * @param mockMvc
	 * @throws JsonProcessingException
	 * @throws Exception
	 */
	public static void createNewApp(MockMvc mockMvc, String appName) throws JsonProcessingException, Exception {
		App request = new App();
		request.setAppName(appName);
		String reqStr = json.writeValueAsString(request);
		mockMvc.perform(post("/app").content(reqStr)).andDo(print()).andExpect(status().isCreated());
	}
}
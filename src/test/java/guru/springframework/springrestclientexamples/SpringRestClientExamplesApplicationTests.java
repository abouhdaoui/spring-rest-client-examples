package guru.springframework.springrestclientexamples;

import guru.springframework.api.model.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestClientExamplesApplicationTests {

	private Name name;

	@Test
	public void contextLoads() {
		System.out.println(name.test);
	}

}

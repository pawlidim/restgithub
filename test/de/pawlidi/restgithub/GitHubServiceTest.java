package de.pawlidi.restgithub;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubServiceTest {

	private Retrofit retrofit;

	@Before
	public void setUp() throws Exception {
		retrofit = new Retrofit.Builder().baseUrl("https://api.github.com")
				.addConverterFactory(GsonConverterFactory.create()).build();
	}

	@After
	public void tearDown() throws Exception {
		retrofit = null;
	}

	@Test
	public void testListRepos() throws IOException {
		GitHubService service = retrofit.create(GitHubService.class);
		assertTrue(service.getUserRepositories("pawlidim").execute().isSuccessful());
		List<Repository> repos = service.getUserRepositories("pawlidim").execute().body();
		assertTrue(!repos.isEmpty());
		for (Repository repository : repos) {
			System.out.println(
					repository.getId() + " -> " + repository.getName() + " : " + repository.getOwner().getLogin());
		}
	}
}

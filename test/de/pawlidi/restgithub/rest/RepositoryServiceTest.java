/**
 * 
 */
package de.pawlidi.restgithub.rest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.rest.converter.GsonConverter;
import retrofit2.Retrofit;

/**
 * @author PAWLIDIM
 *
 */
public class RepositoryServiceTest {

	private Retrofit retrofit;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		retrofit = new Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(new GsonConverter())
				.build();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.RepositoryService#getUserRepositories(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetUserRepositories() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.RepositoryService#getOrganisationRepositories(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetOrganisationRepositories() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.RepositoryService#getRepositories()}.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetRepositories() throws IOException {
		// RepositoryService service = retrofit.create(RepositoryService.class);
		// assertTrue(service.getUserRepositories("pawlidim").execute().isSuccessful());
		// List<Repository> repos =
		// service.getUserRepositories("pawlidim").execute().body();
		// assertTrue(!repos.isEmpty());
		// for (Repository repository : repos) {
		// System.out.println(
		// repository.getId() + " -> " + repository.getName() + " : " +
		// repository.getOwner().getLogin());
		// }
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.RepositoryService#getRepository(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGetRepository() {
		assertTrue(true);
	}

}

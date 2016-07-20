/**
 * 
 */
package de.pawlidi.restgithub;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author PAWLIDIM
 *
 */
public class GitHubTest {

	private GitHub gitHub;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.gitHub = new GitHub(TestUtils.LOGIN, TestUtils.PASSWORD);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.GitHub#getGitHubUserModule()}.
	 */
	@Test
	public void testGetGitHubUserModule() throws Exception {
		GitHubUser gitHubUser = gitHub.getGitHubUserModule();
		assertNotNull(gitHubUser);
	}

}

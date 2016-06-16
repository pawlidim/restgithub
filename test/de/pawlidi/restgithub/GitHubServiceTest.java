package de.pawlidi.restgithub;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GitHubServiceTest {

	private GitHubService service;

	@Before
	public void setUp() throws Exception {
		service = new GitHubService();
	}

	@After
	public void tearDown() throws Exception {
		service.release();
	}

	@Test
	public void testListRepos() throws IOException {
		assertTrue(true);
		service.getRepositories();
	}
}

package de.pawlidi.restgithub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.dto.User;

public class GitHubUserTest {

	private GitHubUser gitHubUser;

	@Before
	public void setUp() throws Exception {
		this.gitHubUser = new GitHubUser(new GitHub(TestUtils.USERNAME, TestUtils.PASSWORD));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUser() throws Exception {
		User user = gitHubUser.getUser();
		assertNotNull(user);
		assertEquals(user.getLogin(), TestUtils.USERNAME);
	}

	@Test
	public void testGetUserForName() throws Exception {
		User user = gitHubUser.getUserForName(TestUtils.USERNAME);
		assertNotNull(user);
		assertEquals(user.getLogin(), TestUtils.USERNAME);
	}

	@Test
	public void testGetAllUsers() throws Exception {
		Collection<User> users = gitHubUser.getAllUsers();
		assertNotNull(users);
		System.out.println(users.size());
	}

	@Test
	public void testCheckUserFollowing() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testCheckUserFollowingOther() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testDeleteEMailsStringArray() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testFollowUser() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testGetEMails() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testGetUserFollowers() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testGetUserFollowersForUser() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testGetUserFollowing() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testGetUserFollowingForUser() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testSetEMailsStringArray() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testUnfollowUser() throws Exception {
		assertTrue(true);
	}
}

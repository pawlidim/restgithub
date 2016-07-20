/**
 * 
 */
package de.pawlidi.restgithub.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.TestUtils;
import de.pawlidi.restgithub.dto.EMail;
import de.pawlidi.restgithub.dto.User;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author PAWLIDIM
 *
 */
public class UserServiceTest {

	private UserService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		service = TestUtils.createRetrofit().create(UserService.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.UserService#getUser(java.lang.String)}.
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetUser() throws IOException {
		Call<User> call = service.getUser(TestUtils.LOGIN);
		User user = call.execute().body();
		assertNotNull(user);
		assertEquals("Max Pawlidi", user.getName());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.UserService#getUser(java.lang.String,java.lang.String))}
	 * .
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetUserForUserName() throws IOException {
		Call<User> call = service.getUserForName(TestUtils.LOGIN, "pawlidim");
		Response<User> response = call.execute();
		assertTrue(response.isSuccessful());
		User user = response.body();
		assertNotNull(user);
		assertEquals("Max Pawlidi", user.getName());
	}

	/**
	 * 
	 * @throws IOException
	 */
	@Test
	public void testGetUsers() throws IOException {
		Call<List<User>> call = service.getUsers(TestUtils.LOGIN, "0");
		Response<List<User>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<User> users = response.body();
		assertNotNull(users);
		assertTrue(!users.isEmpty());
	}

	@Test
	public void testGetEMails() throws Exception {
		Call<List<EMail>> call = service.getEMails(TestUtils.LOGIN);
		Response<List<EMail>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<EMail> mails = response.body();
		assertNotNull(mails);
		for (EMail eMail : mails) {
			System.out.println(eMail.getEmail());
		}
	}

	@Test
	public void testSetEMails() throws Exception {
		List<String> list = new ArrayList<>();
		list.add(TestUtils.NEW_EMAIL);
		Call<List<EMail>> call = service.setEMails(TestUtils.LOGIN, list);
		Response<List<EMail>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<EMail> mails = response.body();
		assertFalse(mails.isEmpty());
	}

	@Test
	public void testDeleteEMails() throws Exception {
		List<String> list = new ArrayList<>();
		list.add(TestUtils.NEW_EMAIL);
		Call call = service.deleteEMails(TestUtils.LOGIN, list);
		Response response = call.execute();
		assertTrue(response.isSuccessful());

		Call<List<EMail>> call2 = service.getEMails(TestUtils.LOGIN);
		Response<List<EMail>> response2 = call2.execute();
		assertTrue(response.isSuccessful());
		List<EMail> mails = response2.body();
		assertNotNull(mails);
		for (EMail eMail : mails) {
			assertFalse(TestUtils.NEW_EMAIL.equalsIgnoreCase(eMail.getEmail()));
		}
	}

	@Test
	public void testGetUserFollowersForUser() throws Exception {
		Call<List<User>> call = service.getUserFollowersForUser("vogella");
		Response<List<User>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<User> followers = response.body();
		assertNotNull(followers);
		assertFalse(followers.isEmpty());
	}

	@Test
	public void testGetUserFollowers() throws Exception {
		Call<List<User>> call = service.getUserFollowers(TestUtils.LOGIN);
		Response<List<User>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<User> followers = response.body();
		assertNotNull(followers);
		assertTrue(followers.isEmpty());
	}

	@Test
	public void testGetUserFollowingForUser() throws Exception {
		Call<List<User>> call = service.getUserFollowingForUser("pawlidim");
		Response<List<User>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<User> following = response.body();
		assertNotNull(following);
		assertFalse(following.isEmpty());
	}

	@Test
	public void testGetUserFollowing() throws Exception {
		Call<List<User>> call = service.getUserFollowing(TestUtils.LOGIN);
		Response<List<User>> response = call.execute();
		assertTrue(response.isSuccessful());
		List<User> following = response.body();
		assertNotNull(following);
		assertFalse(following.isEmpty());
	}

	@Test
	public void testCheckUserFollowing() throws Exception {
		Call<Void> call = service.checkUserFollowing(TestUtils.LOGIN, "vogella");
		Response response = call.execute();
		assertTrue(response.isSuccessful());
		assertTrue(response.raw().code() == 204);
	}

	@Test
	public void testCheckUserFollowingOther() throws Exception {
		Call<Void> call = service.checkUserFollowingOther("pawlidim", "vogella");
		Response response = call.execute();
		assertTrue(response.isSuccessful());
		assertTrue(response.raw().code() == 204);
	}

	@Test
	public void testFollowUser() throws Exception {
		Call<Void> call = service.followUser(TestUtils.LOGIN, "vogella");
		Response response = call.execute();
		assertTrue(response.isSuccessful());
		assertTrue(response.raw().code() == 204);
	}

	@Test
	public void testUnfollowUser() throws Exception {
		Call<Void> call = service.unfollowUser(TestUtils.LOGIN, "vogella");
		Response response = call.execute();
		assertTrue(response.isSuccessful());
		assertTrue(response.raw().code() == 204);

		call = service.followUser(TestUtils.LOGIN, "vogella");
		response = call.execute();
		assertTrue(response.isSuccessful());
		assertTrue(response.raw().code() == 204);
	}

}

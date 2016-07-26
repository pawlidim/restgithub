package de.pawlidi.restgithub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.pawlidi.restgithub.dto.EMail;
import de.pawlidi.restgithub.dto.User;
import de.pawlidi.restgithub.rest.UserService;
import retrofit2.Call;
import retrofit2.Response;

/**
 * This class provides methods for the git hub user handling.
 * 
 * @author PAWLIDIM
 *
 */
public final class GitHubUserService extends GitHubService {

	private UserService service;

	protected GitHubUserService(GitHub gitHub) {
		super(gitHub);
		this.service = gitHub.getRetrofit().create(UserService.class);
	}

	/**
	 * Get current user.
	 * 
	 * @return user
	 */
	public User getUser() {
		Call<User> call = service.getUser(gitHub.getSecurityManager().getLogin());
		try {
			Response<User> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Return user for given username.
	 * 
	 * @param username,
	 *            as login username
	 * @return user, null if username doesn't not exist.
	 */
	public User getUserForName(String username) {
		if (username == null || username.trim().isEmpty()) {
			return null;
		}
		Call<User> call = service.getUserForName(gitHub.getSecurityManager().getLogin(), username);
		try {
			Response<User> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Return all users.
	 * 
	 * @return users
	 */
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		Call<List<User>> call = service.getUsers(gitHub.getSecurityManager().getLogin(), "0");
		List<User> lastUserList = getUser(call);
		while (lastUserList != null && !lastUserList.isEmpty()) {
			users.addAll(lastUserList);
			User last = lastUserList.get(lastUserList.size() - 1);
			call = service.getUsers(gitHub.getSecurityManager().getLogin(), "" + last.getId());
			lastUserList = getUser(call);
		}
		return users;
	}

	private List<User> getUser(Call<List<User>> call) {
		try {
			Response<List<User>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Return email addresses for current user.
	 * 
	 * @return addresses
	 */
	public List<EMail> getEMails() {
		Call<List<EMail>> call = service.getEMails(gitHub.getSecurityManager().getLogin());
		try {
			Response<List<EMail>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Sets emails for current user.
	 * 
	 * @param emails
	 * @return emails
	 */
	public List<EMail> setEMails(String... emails) {
		if (emails == null || emails.length == 0) {
			return null;
		}
		return setEMails(Arrays.asList(emails));
	}

	/**
	 * Sets emails for current user.
	 * 
	 * @param emails
	 * @return emails
	 */
	public List<EMail> setEMails(List<String> emails) {
		if (emails == null || emails.isEmpty()) {
			return null;
		}
		Call<List<EMail>> call = service.setEMails(gitHub.getSecurityManager().getLogin(), emails);
		try {
			Response<List<EMail>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Deletes emails for current user.
	 * 
	 * @param emails
	 * @return true, if delete was successful
	 */
	public boolean deleteEMails(String... emails) {
		if (emails == null || emails.length == 0) {
			return false;
		}
		return deleteEMails(Arrays.asList(emails));
	}

	/**
	 * Deletes emails for current user.
	 * 
	 * @param emails
	 * @return true, if delete was successful
	 */
	public boolean deleteEMails(List<String> emails) {
		if (emails == null || emails.isEmpty()) {
			return false;
		}
		Call<Void> call = service.deleteEMails(gitHub.getSecurityManager().getLogin(), emails);
		try {
			Response<Void> response = call.execute();
			return response.isSuccessful();
		} catch (IOException e) {
			// ignore exception
		}
		return false;
	}

	/**
	 * Returns a list of user's followers
	 * 
	 * @param username
	 * @return followers
	 */
	public List<User> getUserFollowersForUser(String username) {
		if (username == null || username.trim().isEmpty()) {
			return null;
		}
		Call<List<User>> call = service.getUserFollowersForUser(username);
		try {
			Response<List<User>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Returns a list of the authenticated user's followers
	 * 
	 * @return followers
	 */
	public List<User> getUserFollowers() {
		Call<List<User>> call = service.getUserFollowers(gitHub.getSecurityManager().getLogin());
		try {
			Response<List<User>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Returns a list who a user is following.
	 * 
	 * @param username
	 * @return users
	 */
	public List<User> getUserFollowingForUser(String username) {
		if (username == null || username.trim().isEmpty()) {
			return null;
		}
		Call<List<User>> call = service.getUserFollowingForUser(username);
		try {
			Response<List<User>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Returns who the current user is following
	 * 
	 * @return users
	 */
	public List<User> getUserFollowing() {
		Call<List<User>> call = service.getUserFollowing(gitHub.getSecurityManager().getLogin());
		try {
			Response<List<User>> response = call.execute();
			if (response.isSuccessful()) {
				return response.body();
			}
		} catch (IOException e) {
			// ignore exception
		}
		return null;
	}

	/**
	 * Checks if current user are following a user
	 * 
	 * @param username
	 * @return
	 */
	public boolean checkUserFollowing(String username) {
		if (username == null || username.trim().isEmpty()) {
			return false;
		}
		Call<Void> call = service.checkUserFollowing(gitHub.getSecurityManager().getLogin(), username);
		try {
			Response<Void> response = call.execute();
			if (response.isSuccessful() && response.raw().code() == 204) {
				return true;
			}
		} catch (IOException e) {
			// ignore exception
		}
		return false;
	}

	/**
	 * Checks if one user follows another
	 * 
	 * @param username
	 * @param targetUser
	 * @return
	 */
	public boolean checkUserFollowingOther(String username, String targetUser) {
		if (username == null || username.trim().isEmpty() || targetUser == null || targetUser.trim().isEmpty()) {
			return false;
		}
		Call<Void> call = service.checkUserFollowingOther(username, targetUser);
		try {
			Response<Void> response = call.execute();
			if (response.isSuccessful() && response.raw().code() == 204) {
				return true;
			}
		} catch (IOException e) {
			// ignore exception
		}
		return false;
	}

	/**
	 * Follow a user
	 * 
	 * @param username
	 * @return
	 */
	public boolean followUser(String username) {
		if (username == null || username.trim().isEmpty()) {
			return false;
		}
		Call<Void> call = service.followUser(gitHub.getSecurityManager().getLogin(), username);
		try {
			Response<Void> response = call.execute();
			if (response.isSuccessful() && response.raw().code() == 204) {
				return true;
			}
		} catch (IOException e) {
			// ignore exception
		}
		return false;
	}

	/**
	 * Unfollow a user
	 * 
	 * @param username
	 * @return
	 */
	public boolean unfollowUser(String username) {
		if (username == null || username.trim().isEmpty()) {
			return false;
		}
		Call<Void> call = service.unfollowUser(gitHub.getSecurityManager().getLogin(), username);
		try {
			Response<Void> response = call.execute();
			if (response.isSuccessful() && response.raw().code() == 204) {
				return true;
			}
		} catch (IOException e) {
			// ignore exception
		}
		return false;
	}
}

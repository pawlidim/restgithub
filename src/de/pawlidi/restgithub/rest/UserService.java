package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.EMail;
import de.pawlidi.restgithub.dto.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 
 * @author PAWLIDIM
 *
 */
public interface UserService {

	@GET("user")
	Call<User> getUser(@Header("Authorization") String authorization);

	@GET("users/{username}")
	Call<User> getUserForName(@Header("Authorization") String authorization, @Path("username") String username);

	@GET("users")
	Call<List<User>> getUsers(@Header("Authorization") String authorization, @Query("since") String since);

	@GET("user/emails")
	Call<List<EMail>> getEMails(@Header("Authorization") String authorization);

	@POST("user/emails")
	Call<List<EMail>> setEMails(@Header("Authorization") String authorization, @Body List<String> emails);

	@HTTP(method = "DELETE", path = "user/emails", hasBody = true)
	Call<Void> deleteEMails(@Header("Authorization") String authorization, @Body List<String> emails);

	@GET("users/{username}/followers")
	Call<List<User>> getUserFollowersForUser(@Path("username") String username);

	@GET("user/followers")
	Call<List<User>> getUserFollowers(@Header("Authorization") String authorization);

	@GET("users/{username}/following")
	Call<List<User>> getUserFollowingForUser(@Path("username") String username);

	@GET("user/following")
	Call<List<User>> getUserFollowing(@Header("Authorization") String authorization);

	@GET("user/following/{username}")
	Call<Void> checkUserFollowing(@Header("Authorization") String authorization, @Path("username") String username);

	@GET("users/{username}/following/{target_user}")
	Call<Void> checkUserFollowingOther(@Path("username") String username, @Path("target_user") String targetUser);

	@PUT("user/following/{username}")
	Call<Void> followUser(@Header("Authorization") String authorization, @Path("username") String username);

	@DELETE("user/following/{username}")
	Call<Void> unfollowUser(@Header("Authorization") String authorization, @Path("username") String username);

}

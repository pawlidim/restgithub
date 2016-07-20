package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.activity.Event;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EventService {

	@GET("events")
	Call<List<Event>> getEvents(@Query("page") String page);

	@GET("repos/{owner}/{repo}/events")
	Call<List<Event>> getRepositoryEvents(@Path("owner") String owner, @Path("repo") String repository,
			@Query("page") String page);

	@GET("networks/{owner}/{repo}/events")
	Call<List<Event>> getRepositoryEventsForNetwork(@Path("owner") String owner, @Path("repo") String repository,
			@Query("page") String page);

	@GET("orgs/{org}/events")
	Call<List<Event>> getEventsForOrganisation(@Path("org") String org, @Query("page") String page);

	@GET("users/{username}/received_events/public")
	Call<List<Event>> getReceivedEventsForUser(@Path("username") String username, @Query("page") String page);

	@GET("users/{username}/events")
	Call<List<Event>> getEventsForUser(@Path("username") String username, @Query("page") String page);

	@GET("users/{username}/events/public")
	Call<List<Event>> getEventsPerformedByUser(@Path("username") String username, @Query("page") String page);

	@GET("users/{username}/events/orgs/{org}")
	Call<List<Event>> getEventsForUserOrganisation(@Path("username") String username, @Path("org") String org,
			@Query("page") String page);
}

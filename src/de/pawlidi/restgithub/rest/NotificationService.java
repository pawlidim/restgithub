package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.activity.Notification;
import de.pawlidi.restgithub.dto.activity.ThreadSubscription;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NotificationService {

	@GET("notifications")
	Call<List<Notification>> getNotifications();

	@GET("repos/{owner}/{repo}/notifications")
	Call<List<Notification>> getNotifications(@Path("owner") String owner, @Path("repo") String repository);

	@PUT("notifications")
	Call<Response> markAsRead(@Query("last_read_at") String lastReadAt);

	@PUT("repos/{owner}/{repo}/notifications")
	Call<Response> markAsRead(@Path("owner") String owner, @Path("repo") String repository,
			@Query("last_read_at") String lastReadAt);

	@GET("notifications/threads/{id}")
	Call<Notification> getNotificationInThread(@Path("id") String id);

	@PATCH("notifications/threads/{id}")
	Call<Response> markAsReadInThread(@Path("id") String id);

	@GET("notifications/threads/{id}/subscription")
	Call<ThreadSubscription> getThreadSubscription(@Path("id") String id);

	@PUT("notifications/threads/{id}/subscription")
	Call<ThreadSubscription> setThreadSubscription(@Path("id") String id, @Query("subscribed") Boolean subscribed,
			@Query("ignored") Boolean ignored);

	@DELETE("notifications/threads/{id}/subscription")
	Call<Response> deleteThreadSubscription(@Path("id") String id);
}

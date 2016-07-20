package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.activity.Feed;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedService {

	@GET("feeds")
	Call<List<Feed>> getFeeds();
}

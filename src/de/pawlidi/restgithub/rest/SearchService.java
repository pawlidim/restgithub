package de.pawlidi.restgithub.rest;

import java.util.List;
import java.util.Map;

import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface SearchService {

	@GET("search/repositories")
	Call<List<Repository>> searchRepositories(@Query("q") String query, @Query("sort") String sort,
			@Query("order") String order);

	@GET("search/repositories")
	Call<List<Repository>> searchRepositories(@Query("q") String query, @Query("sort") String sort,
			@QueryMap Map<String, String> options);
}

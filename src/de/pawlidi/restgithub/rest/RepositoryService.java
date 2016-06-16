package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RepositoryService {

	@GET("users/{user}/repos")
	Call<List<Repository>> getUserRepositories(@Path("user") String user);

	@GET("orgs/{org}/repos")
	Call<List<Repository>> getOrganisationRepositories(@Path("org") String organisation);

	@GET("repositories")
	Call<List<Repository>> getRepositories();

	@GET("repos/{owner}/{repo}")
	Call<Repository> getRepository(@Path("owner") String owner, @Path("repo") String repository);
}

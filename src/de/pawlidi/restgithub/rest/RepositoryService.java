/*
 * Copyright (C) 2016 Maximilian Pawlidi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 
 * @author PAWLIDIM
 *
 */
public interface RepositoryService {

	/**
	 * Return the list of repositories that are accessible to the authenticated
	 * user.
	 * 
	 * @param authorization
	 *            user login
	 * @param visibility
	 *            repository visibility can be one of all, public or private.
	 *            Default: all
	 * @param affiliation
	 *            comma separated list with owner, collaborator,
	 *            organization_member. Defaul:
	 *            owner,collaborator,organization_member
	 * @param type
	 *            of the repository can be one of all, owner, public, private,
	 *            member. Default: all
	 * @param sort
	 *            the repositories can be one of created, updated, pushed,
	 *            full_name. Default: full_name
	 * @param direction
	 *            order the repositories can be one of asc or desc. Default:
	 *            when using full_name: asc; otherwise desc
	 * @return repository list
	 */
	@GET("user/repos")
	Call<List<Repository>> getRepositories(@Header("Authorization") String authorization,
			@Query("visibility") String visibility, @Query("affiliation") String affiliation,
			@Query("type") String type, @Query("sort") String sort, @Query("direction") String direction);

	@GET("users/{user}/repos")
	Call<List<Repository>> getUserRepositories(@Path("user") String user, @Query("type") String type,
			@Query("sort") String sort, @Query("direction") String direction);

	@GET("orgs/{org}/repos")
	Call<List<Repository>> getOrganisationRepositories(@Path("org") String organisation, @Query("type") String type);

	@GET("repositories")
	Call<List<Repository>> getRepositories(@Query("since") String since);

	@GET("repos/{owner}/{repo}")
	Call<Repository> getRepository(@Path("owner") String owner, @Path("repo") String repository);

	@POST("user/repos")
	Call<Repository> createRepository(@Header("Authorization") String authorization, @Query("name") String name,
			@Query("description") String description, @Query("homepage") String homepage, @Query("private") Boolean prv,
			@Query("has_issues") Boolean hasIssues, @Query("has_wiki") Boolean hasWiki,
			@Query("has_downloads") Boolean hasDownloads, @Query("team_id") Integer teamId,
			@Query("auto_init") Boolean autoInit, @Query("gitignore_template") String gitignoreTemplate,
			@Query("license_template") String licenseTemplate);

	@PATCH("repos/{owner}/{repo}")
	Call<Repository> updateRepository(@Header("Authorization") String authorization, @Path("owner") String username,
			@Path("repo") String repository, @Query("name") String name, @Query("description") String description,
			@Query("homepage") String homepage, @Query("private") Boolean prv, @Query("has_issues") Boolean hasIssues,
			@Query("has_wiki") Boolean hasWiki, @Query("has_downloads") Boolean hasDownloads,
			@Query("default_branch") String defaultBranch);

	@DELETE("repos/{owner}/{repo}")
	Call<Void> deleteRepository(@Header("Authorization") String authorization, @Path("owner") String username,
			@Path("repo") String repository);

}

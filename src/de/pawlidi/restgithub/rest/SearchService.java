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
import java.util.Map;

import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * 
 * @author PAWLIDIM
 *
 */
public interface SearchService {

	@GET("search/repositories")
	Call<List<Repository>> searchRepositories(@Query("q") String query, @Query("sort") String sort,
			@Query("order") String order);

	@GET("search/repositories")
	Call<List<Repository>> searchRepositories(@Query("q") String query, @Query("sort") String sort,
			@QueryMap Map<String, String> options);
}

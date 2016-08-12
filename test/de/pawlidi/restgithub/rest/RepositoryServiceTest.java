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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.TestUtils;
import de.pawlidi.restgithub.dto.Repository;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author PAWLIDIM
 *
 */
public class RepositoryServiceTest {

	private RepositoryService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		service = TestUtils.createRetrofit().create(RepositoryService.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetOrganisationRepositories() throws Exception {
		Call<List<Repository>> call = service.getOrganisationRepositories("swagger-api", null);
		assertNotNull(call);
		Response<List<Repository>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	@Test
	public void testGetAllRepositories() throws Exception {
		Call<List<Repository>> call = service.getRepositories(null);
		assertNotNull(call);
		Response<List<Repository>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	@Test
	public void testGetRepository() throws Exception {
		Call<Repository> call = service.getRepository("pawlidim", "restgithub");
		assertNotNull(call);
		Response<Repository> response = call.execute();
		assertTrue(response.isSuccessful());
		Repository repository = response.body();
		assertNotNull(repository);
		assertTrue(repository.getName().equals("restgithub"));
	}

	@Test
	public void testGetUserRepositories() throws Exception {
		Call<List<Repository>> call = service.getUserRepositories(TestUtils.USERNAME, null, null, null);
		assertNotNull(call);
		Response<List<Repository>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	@Test
	public void testGetRepositories() throws Exception {
		Call<List<Repository>> call = service.getRepositories(TestUtils.LOGIN, null, null, null, null, null);
		assertNotNull(call);
		Response<List<Repository>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	@Test
	public void testCreateRepository() throws Exception {
		Call<Repository> call = service.createRepository(TestUtils.LOGIN_TOKEN, "Hello-World",
				"This is your first repository", "https://github.com", false, null, null, null, null, null, null, null);
		assertNotNull(call);
		Response<Repository> response = call.execute();
		assertTrue(response.isSuccessful());
		Repository repository = response.body();
		assertNotNull(repository);
		assertTrue(repository.getName().equals("Hello-World"));

		call = service.updateRepository(TestUtils.LOGIN, "pawlidim", "Hello-World", "Hello-World-Test",
				"This is your first repository", "https://github.com", false, true, true, true, null);
		assertNotNull(call);
		response = call.execute();
		assertTrue(response.isSuccessful());
		repository = response.body();
		assertNotNull(repository);
		assertTrue(repository.getName().equals("Hello-World-Test"));

	}

}

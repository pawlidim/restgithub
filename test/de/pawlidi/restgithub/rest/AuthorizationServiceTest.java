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
 * 
 */
package de.pawlidi.restgithub.rest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.TestUtils;
import de.pawlidi.restgithub.dto.OAuth;
import de.pawlidi.restgithub.dto.Scope;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author PAWLIDIM
 *
 */
public class AuthorizationServiceTest {

	private AuthorizationService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		service = TestUtils.createRetrofit().create(AuthorizationService.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#createNewAuthorization(java.lang.String, de.pawlidi.restgithub.dto.Scope[], java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreateNewAuthorization() throws Exception {
		List<String> scopes = new ArrayList<>();
		scopes.add(Scope.PUBLIC_REPO.getSerializedName());
		scopes.add(Scope.USER.getSerializedName());
		Call<OAuth> call = service.createNewAuthorization(TestUtils.LOGIN, null, TestUtils.createRandomString(), null,
				null, null, null);
		Response<OAuth> response = call.execute();
		assertTrue(response.isSuccessful());
		OAuth oAuth = response.body();
		assertNotNull(oAuth);
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#getOrCreateAuthorizationForApp(java.lang.String, java.lang.String, java.lang.String, de.pawlidi.restgithub.dto.Scope[], java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetOrCreateAuthorizationForApp() throws Exception {
		List<String> scopes = new ArrayList<>();
		scopes.add(Scope.PUBLIC_REPO.getSerializedName());
		scopes.add(Scope.USER.getSerializedName());
		Call<OAuth> call = service.getOrCreateAuthorizationForApp(TestUtils.LOGIN, TestUtils.CLIENT_ID,
				TestUtils.CLIENT_SECRET, scopes, "test", "www.pawlidi.de/restgithub", TestUtils.createRandomString());
		Response<OAuth> response = call.execute();
		assertTrue(response.isSuccessful());
		OAuth oAuth = response.body();
		assertNotNull(oAuth);
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#getAuthorizations(java.lang.String)}.
	 */
	@Test
	public void testGetAuthorizations() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#getGrants(java.lang.String)}.
	 */
	@Test
	public void testGetGrants() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#getGrant(java.lang.String, java.lang.Long)}.
	 */
	@Test
	public void testGetGrant() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#getAuthorization(java.lang.String, java.lang.Long)}.
	 */
	@Test
	public void testGetAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#updateAuthorization(java.lang.String, java.lang.Long)}.
	 */
	@Test
	public void testUpdateAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#deleteAuthorization(java.lang.String, de.pawlidi.restgithub.dto.Scope[], de.pawlidi.restgithub.dto.Scope[], de.pawlidi.restgithub.dto.Scope[], java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testDeleteAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#checkAuthorization(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCheckAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#resetAuthorization(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testResetAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.AuthorizationService#revokeAuthorization(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRevokeAuthorization() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}

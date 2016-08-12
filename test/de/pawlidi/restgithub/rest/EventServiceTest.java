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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.TestUtils;
import de.pawlidi.restgithub.dto.activity.Event;
import retrofit2.Call;
import retrofit2.Response;

/**
 * @author PAWLIDIM
 *
 */
public class EventServiceTest {

	private EventService service;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		service = TestUtils.createRetrofit().create(EventService.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getEvents(java.lang.String)}.
	 */
	@Test
	public void testGetEvents() throws Exception {
		Call<List<Event>> call = service.getEvents(null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getRepositoryEvents(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetRepositoryEvents() throws Exception {
		Call<List<Event>> call = service.getRepositoryEvents("pawlidim", "restgithub", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getRepositoryEventsForNetwork(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetRepositoryEventsForNetwork() throws Exception {
		Call<List<Event>> call = service.getRepositoryEventsForNetwork("pawlidim", "restgithub", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getEventsForOrganisation(java.lang.String)}.
	 */
	@Test
	public void testGetEventsForOrganisationString() throws Exception {
		Call<List<Event>> call = service.getEventsForOrganisation("Swagger", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getReceivedEventsForUser(java.lang.String)}.
	 */
	@Test
	public void testGetReceivedEventsForUser() throws Exception {
		Call<List<Event>> call = service.getReceivedEventsForUser("pawlidim", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getEventsForUser(java.lang.String)}.
	 */
	@Test
	public void testGetEventsForUser() throws Exception {
		Call<List<Event>> call = service.getEventsForUser("pawlidim", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getEventsPerformedByUser(java.lang.String)}.
	 */
	@Test
	public void testGetEventsPerformedByUser() throws Exception {
		Call<List<Event>> call = service.getEventsPerformedByUser("pawlidim", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertTrue(response.isSuccessful());
		assertNotNull(response.body());
	}

	/**
	 * Test method for
	 * {@link de.pawlidi.restgithub.rest.EventService#getEventsForOrganisation(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetEventsForOrganisationStringString() throws Exception {
		Call<List<Event>> call = service.getEventsForUserOrganisation("iushankin", "Swagger", null);
		assertNotNull(call);
		Response<List<Event>> response = call.execute();
		assertFalse(response.isSuccessful());
	}

}

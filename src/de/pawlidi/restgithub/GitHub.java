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
package de.pawlidi.restgithub;

import java.io.Serializable;

import de.pawlidi.restgithub.rest.utils.RetrofitFactory;
import de.pawlidi.restgithub.security.SecurityManager;
import retrofit2.Retrofit;

/**
 * Main class fot git hub service
 * 
 * @author PAWLIDIM
 *
 */
public final class GitHub implements Serializable {

	private static final String GIT_HUB_API = "https://api.github.com";
	private SecurityManager securityManager;
	private Retrofit retrofit;
	private GitHubUserService gitHubUserService;

	private GitHub() {
		super();
		retrofit = RetrofitFactory.createRetrofit(GIT_HUB_API);
	}

	/**
	 * Constructor to construct new git hub service object with given username
	 * and password to use basic authentication.
	 * 
	 * @param username
	 * @param password
	 */
	public GitHub(final String username, final String password) {
		this();
		this.securityManager = new SecurityManager(username, password);
	}

	/**
	 * Constructor to construct new git hub service object with given tokan to
	 * use oauth protocol.
	 * 
	 * @param token
	 */
	public GitHub(final String token) {
		this();
		this.securityManager = new SecurityManager(token);
	}

	protected SecurityManager getSecurityManager() {
		return securityManager;
	}

	protected Retrofit getRetrofit() {
		return retrofit;
	}

	/**
	 * Returns git hub user service.
	 * 
	 * @return userService as {@link GitHubUserService}
	 */
	public GitHubUserService getUserService() {
		if (gitHubUserService == null) {
			gitHubUserService = new GitHubUserService(this);
		}
		return gitHubUserService;
	}
}

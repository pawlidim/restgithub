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
package de.pawlidi.restgithub.security;

import java.io.Serializable;
import java.nio.charset.Charset;

import javax.xml.bind.DatatypeConverter;

/**
 * 
 * @author PAWLIDIM
 *
 */
public final class SecurityManager implements Serializable {

	private String username;
	private String password;
	private String token;
	private boolean isBasic;
	private boolean isToken;

	private SecurityManager() {
		super();
	}

	/**
	 * Constructor to construct new security manager for given token.
	 * 
	 * @param token
	 */
	public SecurityManager(String token) {
		this();
		this.token = token;
		this.isToken = true;
	}

	/**
	 * Constructor to construct new security manager for given username and
	 * password
	 * 
	 * @param username
	 * @param password
	 */
	public SecurityManager(String username, String password) {
		this();
		this.username = username;
		this.password = password;
		this.isBasic = true;
	}

	/**
	 * Returns login string.
	 * 
	 * @return
	 */
	public String getLogin() {
		if (isToken) {
			return getStringForToken();
		}
		return getStringForBasic();
	}

	private String getStringForToken() {
		return String.format("token %s", token);
	}

	private String getStringForBasic() {
		return String.format("Basic %s", DatatypeConverter
				.printBase64Binary(String.format("%s:%s", username, password).getBytes(Charset.forName("UTF-8"))));
	}

	public boolean isBasic() {
		return isBasic;
	}

	public boolean isToken() {
		return isToken;
	}

}

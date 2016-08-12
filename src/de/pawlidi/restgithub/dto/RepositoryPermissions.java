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
package de.pawlidi.restgithub.dto;

public class RepositoryPermissions extends RestDTO {

	private Boolean admin;
	private Boolean push;
	private Boolean pull;

	/**
	 * @return the admin
	 */
	public Boolean getAdmin() {
		return admin;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	/**
	 * @return the push
	 */
	public Boolean getPush() {
		return push;
	}

	/**
	 * @param push
	 *            the push to set
	 */
	public void setPush(Boolean push) {
		this.push = push;
	}

	/**
	 * @return the pull
	 */
	public Boolean getPull() {
		return pull;
	}

	/**
	 * @param pull
	 *            the pull to set
	 */
	public void setPull(Boolean pull) {
		this.pull = pull;
	}

}

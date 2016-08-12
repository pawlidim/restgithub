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
package de.pawlidi.restgithub.dto.activity;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restgithub.dto.Repository;
import de.pawlidi.restgithub.dto.RestDTO;
import de.pawlidi.restgithub.dto.User;

public class Event extends RestDTO {

	private Long id;
	private String type;
	@SerializedName("public")
	private Boolean publics;
	@SerializedName("repo")
	private Repository repository;
	@SerializedName("user")
	private User user;
	@SerializedName("created_at")
	private Date created;
	@SerializedName("org")
	private User organisation;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the publics
	 */
	public Boolean getPublics() {
		return publics;
	}

	/**
	 * @param publics
	 *            the publics to set
	 */
	public void setPublics(Boolean publics) {
		this.publics = publics;
	}

	/**
	 * @return the repository
	 */
	public Repository getRepository() {
		return repository;
	}

	/**
	 * @param repository
	 *            the repository to set
	 */
	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the organisation
	 */
	public User getOrganisation() {
		return organisation;
	}

	/**
	 * @param organisation
	 *            the organisation to set
	 */
	public void setOrganisation(User organisation) {
		this.organisation = organisation;
	}

}

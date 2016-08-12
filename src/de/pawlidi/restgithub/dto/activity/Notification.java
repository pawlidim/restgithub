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
import de.pawlidi.restgithub.dto.Subject;

public class Notification extends RestDTO {

	private String id;
	private Repository repository;
	private Subject subject;
	private String reason;
	private Boolean unread;
	@SerializedName("updated_at")
	private Date updated;
	@SerializedName("last_read_at")
	private Date lastRead;
	private String url;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the unread
	 */
	public Boolean getUnread() {
		return unread;
	}

	/**
	 * @param unread
	 *            the unread to set
	 */
	public void setUnread(Boolean unread) {
		this.unread = unread;
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated
	 *            the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/**
	 * @return the lastRead
	 */
	public Date getLastRead() {
		return lastRead;
	}

	/**
	 * @param lastRead
	 *            the lastRead to set
	 */
	public void setLastRead(Date lastRead) {
		this.lastRead = lastRead;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}

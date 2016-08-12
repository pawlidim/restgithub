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

import de.pawlidi.restgithub.dto.RestDTO;

public class ThreadSubscription extends RestDTO {

	private Boolean subscribed;
	private Boolean ignored;
	private String reason;
	@SerializedName("created_at")
	private Date created;
	private String url;
	@SerializedName("thread_url")
	private String threadUrl;

	/**
	 * @return the subscribed
	 */
	public Boolean getSubscribed() {
		return subscribed;
	}

	/**
	 * @param subscribed
	 *            the subscribed to set
	 */
	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}

	/**
	 * @return the ignored
	 */
	public Boolean getIgnored() {
		return ignored;
	}

	/**
	 * @param ignored
	 *            the ignored to set
	 */
	public void setIgnored(Boolean ignored) {
		this.ignored = ignored;
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

	/**
	 * @return the threadUrl
	 */
	public String getThreadUrl() {
		return threadUrl;
	}

	/**
	 * @param threadUrl
	 *            the threadUrl to set
	 */
	public void setThreadUrl(String threadUrl) {
		this.threadUrl = threadUrl;
	}

}

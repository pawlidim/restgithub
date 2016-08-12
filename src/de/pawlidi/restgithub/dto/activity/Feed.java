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

import java.util.List;

import com.google.gson.annotations.SerializedName;

import de.pawlidi.restgithub.dto.RestDTO;

public class Feed extends RestDTO {

	@SerializedName("timeline_url")
	private String timelineUrl;
	@SerializedName("user_url")
	private String userUrl;
	@SerializedName("current_user_public_url")
	private String currentUserPublicUrl;
	@SerializedName("current_user_url")
	private String currentUserUrl;
	@SerializedName("current_user_actor_url")
	private String currentUserActorUrl;
	@SerializedName("current_user_organization_url")
	private String currentUserOrganizationUrl;
	@SerializedName("current_user_organization_urls")
	private String[] currentUserOrganizationUrls;
	@SerializedName("_links")
	private List<Link> links;

	/**
	 * @return the timelineUrl
	 */
	public String getTimelineUrl() {
		return timelineUrl;
	}

	/**
	 * @param timelineUrl
	 *            the timelineUrl to set
	 */
	public void setTimelineUrl(String timelineUrl) {
		this.timelineUrl = timelineUrl;
	}

	/**
	 * @return the userUrl
	 */
	public String getUserUrl() {
		return userUrl;
	}

	/**
	 * @param userUrl
	 *            the userUrl to set
	 */
	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	/**
	 * @return the currentUserPublicUrl
	 */
	public String getCurrentUserPublicUrl() {
		return currentUserPublicUrl;
	}

	/**
	 * @param currentUserPublicUrl
	 *            the currentUserPublicUrl to set
	 */
	public void setCurrentUserPublicUrl(String currentUserPublicUrl) {
		this.currentUserPublicUrl = currentUserPublicUrl;
	}

	/**
	 * @return the currentUserUrl
	 */
	public String getCurrentUserUrl() {
		return currentUserUrl;
	}

	/**
	 * @param currentUserUrl
	 *            the currentUserUrl to set
	 */
	public void setCurrentUserUrl(String currentUserUrl) {
		this.currentUserUrl = currentUserUrl;
	}

	/**
	 * @return the currentUserActorUrl
	 */
	public String getCurrentUserActorUrl() {
		return currentUserActorUrl;
	}

	/**
	 * @param currentUserActorUrl
	 *            the currentUserActorUrl to set
	 */
	public void setCurrentUserActorUrl(String currentUserActorUrl) {
		this.currentUserActorUrl = currentUserActorUrl;
	}

	/**
	 * @return the currentUserOrganizationUrl
	 */
	public String getCurrentUserOrganizationUrl() {
		return currentUserOrganizationUrl;
	}

	/**
	 * @param currentUserOrganizationUrl
	 *            the currentUserOrganizationUrl to set
	 */
	public void setCurrentUserOrganizationUrl(String currentUserOrganizationUrl) {
		this.currentUserOrganizationUrl = currentUserOrganizationUrl;
	}

	/**
	 * @return the currentUserOrganizationUrls
	 */
	public String[] getCurrentUserOrganizationUrls() {
		return currentUserOrganizationUrls;
	}

	/**
	 * @param currentUserOrganizationUrls
	 *            the currentUserOrganizationUrls to set
	 */
	public void setCurrentUserOrganizationUrls(String[] currentUserOrganizationUrls) {
		this.currentUserOrganizationUrls = currentUserOrganizationUrls;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}

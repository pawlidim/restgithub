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

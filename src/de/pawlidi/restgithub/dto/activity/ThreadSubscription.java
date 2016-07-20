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

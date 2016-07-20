package de.pawlidi.restgithub.dto.data;

import de.pawlidi.restgithub.dto.Author;
import de.pawlidi.restgithub.dto.RestDTO;

public class Tag extends RestDTO {

	private String tag;
	private String sha;
	private String url;
	private String message;
	private Author tagger;
	private Object object;

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag
	 *            the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the sha
	 */
	public String getSha() {
		return sha;
	}

	/**
	 * @param sha
	 *            the sha to set
	 */
	public void setSha(String sha) {
		this.sha = sha;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the tagger
	 */
	public Author getTagger() {
		return tagger;
	}

	/**
	 * @param tagger
	 *            the tagger to set
	 */
	public void setTagger(Author tagger) {
		this.tagger = tagger;
	}

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * @param object
	 *            the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

}

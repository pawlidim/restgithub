package de.pawlidi.restgithub.dto.data;

import java.util.List;

import de.pawlidi.restgithub.dto.Author;
import de.pawlidi.restgithub.dto.RestDTO;

public class Commit extends RestDTO {

	private String sha;
	private String url;
	private Author author;
	private Author committer;
	private String message;
	private Tree tree;
	private List<Tree> parents;

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
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * @return the committer
	 */
	public Author getCommitter() {
		return committer;
	}

	/**
	 * @param committer
	 *            the committer to set
	 */
	public void setCommitter(Author committer) {
		this.committer = committer;
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
	 * @return the tree
	 */
	public Tree getTree() {
		return tree;
	}

	/**
	 * @param tree
	 *            the tree to set
	 */
	public void setTree(Tree tree) {
		this.tree = tree;
	}

	/**
	 * @return the parents
	 */
	public List<Tree> getParents() {
		return parents;
	}

	/**
	 * @param parents
	 *            the parents to set
	 */
	public void setParents(List<Tree> parents) {
		this.parents = parents;
	}

}

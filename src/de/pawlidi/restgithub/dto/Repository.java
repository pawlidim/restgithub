package de.pawlidi.restgithub.dto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Repository implements Serializable {

	private Long id;
	private RepositoryOwner owner;
	private String name;
	@SerializedName("full_name")
	private String fullName;
	private String description;
	@SerializedName("private")
	private Boolean privateRepository;
	private Boolean fork;
	private String url;
	@SerializedName("html_url")
	private String urlHTML;
	@SerializedName("archive_url")
	private String urlArchive;
	@SerializedName("assignees_url")
	private String urlAssigneess;

	//
	// "blobs_url":
	// "http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
	// "branches_url":
	// "http://api.github.com/repos/octocat/Hello-World/branches{/branch}",
	// "clone_url": "https://github.com/octocat/Hello-World.git",
	// "collaborators_url":
	// "http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
	// "comments_url":
	// "http://api.github.com/repos/octocat/Hello-World/comments{/number}",
	// "commits_url":
	// "http://api.github.com/repos/octocat/Hello-World/commits{/sha}",
	// "compare_url":
	// "http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
	// "contents_url":
	// "http://api.github.com/repos/octocat/Hello-World/contents/{+path}",
	// "contributors_url":
	// "http://api.github.com/repos/octocat/Hello-World/contributors",
	// "deployments_url":
	// "http://api.github.com/repos/octocat/Hello-World/deployments",
	// "downloads_url":
	// "http://api.github.com/repos/octocat/Hello-World/downloads",
	// "events_url": "http://api.github.com/repos/octocat/Hello-World/events",
	// "forks_url": "http://api.github.com/repos/octocat/Hello-World/forks",
	// "git_commits_url":
	// "http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
	// "git_refs_url":
	// "http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
	// "git_tags_url":
	// "http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
	// "git_url": "git:github.com/octocat/Hello-World.git",
	// "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks",
	// "issue_comment_url":
	// "http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
	// "issue_events_url":
	// "http://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
	// "issues_url":
	// "http://api.github.com/repos/octocat/Hello-World/issues{/number}",
	// "keys_url":
	// "http://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
	// "labels_url":
	// "http://api.github.com/repos/octocat/Hello-World/labels{/name}",
	// "languages_url":
	// "http://api.github.com/repos/octocat/Hello-World/languages",
	// "merges_url": "http://api.github.com/repos/octocat/Hello-World/merges",
	// "milestones_url":
	// "http://api.github.com/repos/octocat/Hello-World/milestones{/number}",
	// "mirror_url": "git:git.example.com/octocat/Hello-World",
	// "notifications_url":
	// "http://api.github.com/repos/octocat/Hello-World/notifications{?since,
	// all, participating}",
	// "pulls_url":
	// "http://api.github.com/repos/octocat/Hello-World/pulls{/number}",
	// "releases_url":
	// "http://api.github.com/repos/octocat/Hello-World/releases{/id}",
	// "ssh_url": "git@github.com:octocat/Hello-World.git",
	// "stargazers_url":
	// "http://api.github.com/repos/octocat/Hello-World/stargazers",
	// "statuses_url":
	// "http://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
	// "subscribers_url":
	// "http://api.github.com/repos/octocat/Hello-World/subscribers",
	// "subscription_url":
	// "http://api.github.com/repos/octocat/Hello-World/subscription",
	// "svn_url": "https://svn.github.com/octocat/Hello-World",
	// "tags_url": "http://api.github.com/repos/octocat/Hello-World/tags",
	// "teams_url": "http://api.github.com/repos/octocat/Hello-World/teams",
	// "trees_url":
	// "http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
	// "homepage": "https://github.com",
	// "language": null,
	// "forks_count": 9,
	// "stargazers_count": 80,
	// "watchers_count": 80,
	// "size": 108,
	// "default_branch": "master",
	// "open_issues_count": 0,
	// "has_issues": true,
	// "has_wiki": true,
	// "has_pages": false,
	// "has_downloads": true,
	// "pushed_at": "2011-01-26T19:06:43Z",
	// "created_at": "2011-01-26T19:01:12Z",
	// "updated_at": "2011-01-26T19:14:43Z",
	private RepositoryPermissions permissions;

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
	 * @return the owner
	 */
	public RepositoryOwner getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(RepositoryOwner owner) {
		this.owner = owner;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the privateRepository
	 */
	public Boolean getPrivateRepository() {
		return privateRepository;
	}

	/**
	 * @param privateRepository
	 *            the privateRepository to set
	 */
	public void setPrivateRepository(Boolean privateRepository) {
		this.privateRepository = privateRepository;
	}

	/**
	 * @return the fork
	 */
	public Boolean getFork() {
		return fork;
	}

	/**
	 * @param fork
	 *            the fork to set
	 */
	public void setFork(Boolean fork) {
		this.fork = fork;
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
	 * @return the urlHTML
	 */
	public String getUrlHTML() {
		return urlHTML;
	}

	/**
	 * @param urlHTML
	 *            the urlHTML to set
	 */
	public void setUrlHTML(String urlHTML) {
		this.urlHTML = urlHTML;
	}

	/**
	 * @return the urlArchive
	 */
	public String getUrlArchive() {
		return urlArchive;
	}

	/**
	 * @param urlArchive
	 *            the urlArchive to set
	 */
	public void setUrlArchive(String urlArchive) {
		this.urlArchive = urlArchive;
	}

	/**
	 * @return the urlAssigneess
	 */
	public String getUrlAssigneess() {
		return urlAssigneess;
	}

	/**
	 * @param urlAssigneess
	 *            the urlAssigneess to set
	 */
	public void setUrlAssigneess(String urlAssigneess) {
		this.urlAssigneess = urlAssigneess;
	}

	/**
	 * @return the permissions
	 */
	public RepositoryPermissions getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions
	 *            the permissions to set
	 */
	public void setPermissions(RepositoryPermissions permissions) {
		this.permissions = permissions;
	}

}

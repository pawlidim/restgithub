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

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Repository extends RestDTO {

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
	@SerializedName("blobs_url")
	private String blobsUrl;
	@SerializedName("branches_url")
	private String branchesUrl;
	@SerializedName("clone_url")
	private String cloneUrl;
	@SerializedName("collaborators_url")
	private String collaboratorsUrl;
	@SerializedName("comments_url")
	private String commentsUrl;
	@SerializedName("commits_url")
	private String commitsUrl;
	@SerializedName("compare_url")
	private String compareUrl;
	@SerializedName("contents_url")
	private String contentsUrl;
	@SerializedName("contributors_url")
	private String contributorsUrl;
	@SerializedName("deployments_url")
	private String deploymentsUrl;
	@SerializedName("downloads_url")
	private String downloadsUrl;
	@SerializedName("events_url")
	private String eventsUrl;
	@SerializedName("forks_url")
	private String forksUrl;
	@SerializedName("git_commits_url")
	private String gitCommitsUrl;
	@SerializedName("git_refs_url")
	private String gitRefsUrl;
	@SerializedName("git_tags_url")
	private String gitTagsUrl;
	@SerializedName("git_url")
	private String gitUrl;
	@SerializedName("hooks_url")
	private String hooksUrl;
	@SerializedName("issue_comment_url")
	private String issueCommentUrl;
	@SerializedName("issue_events_url")
	private String issueEventsUrl;
	@SerializedName("issues_url")
	private String issuesUrl;
	@SerializedName("keys_url")
	private String keysUrl;
	@SerializedName("labels_url")
	private String labelsUrl;
	@SerializedName("languages_url")
	private String languagesUrl;
	@SerializedName("merges_url")
	private String mergesUrl;
	@SerializedName("milestones_url")
	private String milestonesUrl;
	@SerializedName("mirror_url")
	private String mirrorUrl;
	@SerializedName("notifications_url")
	private String notificationsUrl;
	@SerializedName("pulls_url")
	private String pullsUrl;
	@SerializedName("releases_url")
	private String releasesUrl;
	@SerializedName("ssh_url")
	private String sshUrl;
	@SerializedName("stargazers_url")
	private String stargazersUrl;
	@SerializedName("statuses_url")
	private String statusesUrl;
	@SerializedName("subscribers_url")
	private String subscribersUrl;
	@SerializedName("subscription_url")
	private String subscriptionUrl;
	@SerializedName("svn_url")
	private String svnUrl;
	@SerializedName("tags_url")
	private String tagsUrl;
	@SerializedName("teams_url")
	private String teamsUrl;
	@SerializedName("trees_url")
	private String treesUrl;
	private String homepage;
	private String language;
	@SerializedName("forks_count")
	private Long forksCount;
	@SerializedName("stargazers_count")
	private Long stargazersCount;
	@SerializedName("watchers_count")
	private Long watchersCount;
	private Long size;
	@SerializedName("default_branch")
	private String defaultBranch;
	@SerializedName("open_issues_count")
	private Long openIssuesCount;
	@SerializedName("has_issues")
	private Boolean hasIssues;
	@SerializedName("has_wiki")
	private Boolean hasWiki;
	@SerializedName("has_pages")
	private Boolean hasPages;
	@SerializedName("has_downloads")
	private Boolean hasDownloads;
	@SerializedName("pushed_at")
	private Date pushed;
	@SerializedName("updated_at")
	private Date updated;
	@SerializedName("created_at")
	private Date created;
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
	 * @return the blobsUrl
	 */
	public String getBlobsUrl() {
		return blobsUrl;
	}

	/**
	 * @param blobsUrl
	 *            the blobsUrl to set
	 */
	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}

	/**
	 * @return the branchesUrl
	 */
	public String getBranchesUrl() {
		return branchesUrl;
	}

	/**
	 * @param branchesUrl
	 *            the branchesUrl to set
	 */
	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}

	/**
	 * @return the cloneUrl
	 */
	public String getCloneUrl() {
		return cloneUrl;
	}

	/**
	 * @param cloneUrl
	 *            the cloneUrl to set
	 */
	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	/**
	 * @return the collaboratorsUrl
	 */
	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}

	/**
	 * @param collaboratorsUrl
	 *            the collaboratorsUrl to set
	 */
	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}

	/**
	 * @return the commentsUrl
	 */
	public String getCommentsUrl() {
		return commentsUrl;
	}

	/**
	 * @param commentsUrl
	 *            the commentsUrl to set
	 */
	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	/**
	 * @return the commitsUrl
	 */
	public String getCommitsUrl() {
		return commitsUrl;
	}

	/**
	 * @param commitsUrl
	 *            the commitsUrl to set
	 */
	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}

	/**
	 * @return the compareUrl
	 */
	public String getCompareUrl() {
		return compareUrl;
	}

	/**
	 * @param compareUrl
	 *            the compareUrl to set
	 */
	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}

	/**
	 * @return the contentsUrl
	 */
	public String getContentsUrl() {
		return contentsUrl;
	}

	/**
	 * @param contentsUrl
	 *            the contentsUrl to set
	 */
	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}

	/**
	 * @return the contributorsUrl
	 */
	public String getContributorsUrl() {
		return contributorsUrl;
	}

	/**
	 * @param contributorsUrl
	 *            the contributorsUrl to set
	 */
	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}

	/**
	 * @return the deploymentsUrl
	 */
	public String getDeploymentsUrl() {
		return deploymentsUrl;
	}

	/**
	 * @param deploymentsUrl
	 *            the deploymentsUrl to set
	 */
	public void setDeploymentsUrl(String deploymentsUrl) {
		this.deploymentsUrl = deploymentsUrl;
	}

	/**
	 * @return the downloadsUrl
	 */
	public String getDownloadsUrl() {
		return downloadsUrl;
	}

	/**
	 * @param downloadsUrl
	 *            the downloadsUrl to set
	 */
	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}

	/**
	 * @return the eventsUrl
	 */
	public String getEventsUrl() {
		return eventsUrl;
	}

	/**
	 * @param eventsUrl
	 *            the eventsUrl to set
	 */
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	/**
	 * @return the forksUrl
	 */
	public String getForksUrl() {
		return forksUrl;
	}

	/**
	 * @param forksUrl
	 *            the forksUrl to set
	 */
	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}

	/**
	 * @return the gitCommitsUrl
	 */
	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}

	/**
	 * @param gitCommitsUrl
	 *            the gitCommitsUrl to set
	 */
	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}

	/**
	 * @return the gitRefsUrl
	 */
	public String getGitRefsUrl() {
		return gitRefsUrl;
	}

	/**
	 * @param gitRefsUrl
	 *            the gitRefsUrl to set
	 */
	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}

	/**
	 * @return the gitTagsUrl
	 */
	public String getGitTagsUrl() {
		return gitTagsUrl;
	}

	/**
	 * @param gitTagsUrl
	 *            the gitTagsUrl to set
	 */
	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}

	/**
	 * @return the gitUrl
	 */
	public String getGitUrl() {
		return gitUrl;
	}

	/**
	 * @param gitUrl
	 *            the gitUrl to set
	 */
	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	/**
	 * @return the hooksUrl
	 */
	public String getHooksUrl() {
		return hooksUrl;
	}

	/**
	 * @param hooksUrl
	 *            the hooksUrl to set
	 */
	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	/**
	 * @return the issueCommentUrl
	 */
	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}

	/**
	 * @param issueCommentUrl
	 *            the issueCommentUrl to set
	 */
	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}

	/**
	 * @return the issueEventsUrl
	 */
	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}

	/**
	 * @param issueEventsUrl
	 *            the issueEventsUrl to set
	 */
	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}

	/**
	 * @return the issuesUrl
	 */
	public String getIssuesUrl() {
		return issuesUrl;
	}

	/**
	 * @param issuesUrl
	 *            the issuesUrl to set
	 */
	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	/**
	 * @return the keysUrl
	 */
	public String getKeysUrl() {
		return keysUrl;
	}

	/**
	 * @param keysUrl
	 *            the keysUrl to set
	 */
	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}

	/**
	 * @return the labelsUrl
	 */
	public String getLabelsUrl() {
		return labelsUrl;
	}

	/**
	 * @param labelsUrl
	 *            the labelsUrl to set
	 */
	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	/**
	 * @return the languagesUrl
	 */
	public String getLanguagesUrl() {
		return languagesUrl;
	}

	/**
	 * @param languagesUrl
	 *            the languagesUrl to set
	 */
	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}

	/**
	 * @return the mergesUrl
	 */
	public String getMergesUrl() {
		return mergesUrl;
	}

	/**
	 * @param mergesUrl
	 *            the mergesUrl to set
	 */
	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}

	/**
	 * @return the milestonesUrl
	 */
	public String getMilestonesUrl() {
		return milestonesUrl;
	}

	/**
	 * @param milestonesUrl
	 *            the milestonesUrl to set
	 */
	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}

	/**
	 * @return the mirrorUrl
	 */
	public String getMirrorUrl() {
		return mirrorUrl;
	}

	/**
	 * @param mirrorUrl
	 *            the mirrorUrl to set
	 */
	public void setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
	}

	/**
	 * @return the notificationsUrl
	 */
	public String getNotificationsUrl() {
		return notificationsUrl;
	}

	/**
	 * @param notificationsUrl
	 *            the notificationsUrl to set
	 */
	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}

	/**
	 * @return the pullsUrl
	 */
	public String getPullsUrl() {
		return pullsUrl;
	}

	/**
	 * @param pullsUrl
	 *            the pullsUrl to set
	 */
	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}

	/**
	 * @return the releasesUrl
	 */
	public String getReleasesUrl() {
		return releasesUrl;
	}

	/**
	 * @param releasesUrl
	 *            the releasesUrl to set
	 */
	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	/**
	 * @return the sshUrl
	 */
	public String getSshUrl() {
		return sshUrl;
	}

	/**
	 * @param sshUrl
	 *            the sshUrl to set
	 */
	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
	}

	/**
	 * @return the stargazersUrl
	 */
	public String getStargazersUrl() {
		return stargazersUrl;
	}

	/**
	 * @param stargazersUrl
	 *            the stargazersUrl to set
	 */
	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}

	/**
	 * @return the statusesUrl
	 */
	public String getStatusesUrl() {
		return statusesUrl;
	}

	/**
	 * @param statusesUrl
	 *            the statusesUrl to set
	 */
	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}

	/**
	 * @return the subscribersUrl
	 */
	public String getSubscribersUrl() {
		return subscribersUrl;
	}

	/**
	 * @param subscribersUrl
	 *            the subscribersUrl to set
	 */
	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}

	/**
	 * @return the subscriptionUrl
	 */
	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}

	/**
	 * @param subscriptionUrl
	 *            the subscriptionUrl to set
	 */
	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}

	/**
	 * @return the svnUrl
	 */
	public String getSvnUrl() {
		return svnUrl;
	}

	/**
	 * @param svnUrl
	 *            the svnUrl to set
	 */
	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}

	/**
	 * @return the tagsUrl
	 */
	public String getTagsUrl() {
		return tagsUrl;
	}

	/**
	 * @param tagsUrl
	 *            the tagsUrl to set
	 */
	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}

	/**
	 * @return the teamsUrl
	 */
	public String getTeamsUrl() {
		return teamsUrl;
	}

	/**
	 * @param teamsUrl
	 *            the teamsUrl to set
	 */
	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}

	/**
	 * @return the treesUrl
	 */
	public String getTreesUrl() {
		return treesUrl;
	}

	/**
	 * @param treesUrl
	 *            the treesUrl to set
	 */
	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}

	/**
	 * @return the homepage
	 */
	public String getHomepage() {
		return homepage;
	}

	/**
	 * @param homepage
	 *            the homepage to set
	 */
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the forksCount
	 */
	public Long getForksCount() {
		return forksCount;
	}

	/**
	 * @param forksCount
	 *            the forksCount to set
	 */
	public void setForksCount(Long forksCount) {
		this.forksCount = forksCount;
	}

	/**
	 * @return the stargazersCount
	 */
	public Long getStargazersCount() {
		return stargazersCount;
	}

	/**
	 * @param stargazersCount
	 *            the stargazersCount to set
	 */
	public void setStargazersCount(Long stargazersCount) {
		this.stargazersCount = stargazersCount;
	}

	/**
	 * @return the watchersCount
	 */
	public Long getWatchersCount() {
		return watchersCount;
	}

	/**
	 * @param watchersCount
	 *            the watchersCount to set
	 */
	public void setWatchersCount(Long watchersCount) {
		this.watchersCount = watchersCount;
	}

	/**
	 * @return the size
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * @return the defaultBranch
	 */
	public String getDefaultBranch() {
		return defaultBranch;
	}

	/**
	 * @param defaultBranch
	 *            the defaultBranch to set
	 */
	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	/**
	 * @return the openIssuesCount
	 */
	public Long getOpenIssuesCount() {
		return openIssuesCount;
	}

	/**
	 * @param openIssuesCount
	 *            the openIssuesCount to set
	 */
	public void setOpenIssuesCount(Long openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}

	/**
	 * @return the hasIssues
	 */
	public Boolean getHasIssues() {
		return hasIssues;
	}

	/**
	 * @param hasIssues
	 *            the hasIssues to set
	 */
	public void setHasIssues(Boolean hasIssues) {
		this.hasIssues = hasIssues;
	}

	/**
	 * @return the hasWiki
	 */
	public Boolean getHasWiki() {
		return hasWiki;
	}

	/**
	 * @param hasWiki
	 *            the hasWiki to set
	 */
	public void setHasWiki(Boolean hasWiki) {
		this.hasWiki = hasWiki;
	}

	/**
	 * @return the hasPages
	 */
	public Boolean getHasPages() {
		return hasPages;
	}

	/**
	 * @param hasPages
	 *            the hasPages to set
	 */
	public void setHasPages(Boolean hasPages) {
		this.hasPages = hasPages;
	}

	/**
	 * @return the hasDownloads
	 */
	public Boolean getHasDownloads() {
		return hasDownloads;
	}

	/**
	 * @param hasDownloads
	 *            the hasDownloads to set
	 */
	public void setHasDownloads(Boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
	}

	/**
	 * @return the pushed
	 */
	public Date getPushed() {
		return pushed;
	}

	/**
	 * @param pushed
	 *            the pushed to set
	 */
	public void setPushed(Date pushed) {
		this.pushed = pushed;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Repository)) {
			return false;
		}
		Repository other = (Repository) obj;
		if (id == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!id.equals(other.getId())) {
			return false;
		}
		if (name == null) {
			if (other.getName() != null) {
				return false;
			}
		} else if (!name.equals(other.getName())) {
			return false;
		}
		if (owner == null) {
			if (other.getOwner() != null) {
				return false;
			}
		} else if (!owner.equals(other.getOwner())) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

}

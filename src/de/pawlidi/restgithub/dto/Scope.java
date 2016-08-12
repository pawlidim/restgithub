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

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author PAWLIDIM
 *
 */
public enum Scope {

	@SerializedName("user")
	USER("user"), @SerializedName("user:email")
	USER_EMAIL("user:email"), @SerializedName("user:follow")
	USER_FOLLOW("user:follow"), @SerializedName("public_repo")
	PUBLIC_REPO("public_repo"), @SerializedName("repo")
	REPO("repo"), @SerializedName("repo_deployment")
	REPO_DEPLOYMENT("repo_deployment"), @SerializedName("repo:status")
	REPO_STATUS("repo:status"), @SerializedName("delete_repo")
	DELETE_REPO("delete_repo"), @SerializedName("notifications")
	NOTIFICATIONS("notifications"), @SerializedName("gist")
	GIST("gist"), @SerializedName("read:repo_hook")
	READ_REPO_HOOK("read:repo_hook"), @SerializedName("write:repo_hook")
	WRITE_REPO_HOOK("write:repo_hook"), @SerializedName("admin:repo_hook")
	ADMIN_REPO_HOOK("admin:repo_hook"), @SerializedName("admin:org_hook")
	ADMIN_ORG_HOOK("admin:org_hook"), @SerializedName("read:org")
	READ_ORG("read:org"), @SerializedName("admin:org")
	ADMIN_ORG("admin:org"), @SerializedName("read:public_key")
	READ_PUBLIC_KEY("read:public_key"), @SerializedName("write:public_key")
	WRITE_PUBLIC_KEY("write:public_key"), @SerializedName("admin:public_key")
	ADMIN_PUBLIC_KEY("admin:public_key"), @SerializedName("read:gpg_key")
	READ_GPG_KEY("read:gpg_key"), @SerializedName("write:gpg_key")
	WRITE_GPG_KEY("write:gpg_key"), @SerializedName("admin:gpg_key")
	ADMIN_GPG_KEY("admin:gpg_key");

	private final String serializedName;

	private Scope(final String serializedName) {
		this.serializedName = serializedName;
	}

	/**
	 * @return the serializedName
	 */
	public String getSerializedName() {
		return serializedName;
	}

	public static Scope getEnumForSerializedName(final String serializedName) {
		if (serializedName != null) {
			for (Scope scope : Scope.values()) {
				if (scope.getSerializedName().equalsIgnoreCase(serializedName)) {
					return scope;
				}
			}
		}
		return null;
	}
}

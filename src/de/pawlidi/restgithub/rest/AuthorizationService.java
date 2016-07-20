package de.pawlidi.restgithub.rest;

import java.util.List;

import de.pawlidi.restgithub.dto.OAuth;
import de.pawlidi.restgithub.dto.Scope;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AuthorizationService {

	@POST("authorizations")
	Call<OAuth> createNewAuthorization(@Header("Authorization") String authorization,
			@Query("scopes") List<String> scopes, @Query("note") String note, @Query("note_url") String noteUrl,
			@Query("client_id") String clientId, @Query("client_secret") String clientSecret,
			@Query("fingerprint") String fingerprint);

	@PUT("authorizations/clients/{client_id}")
	Call<OAuth> getOrCreateAuthorizationForApp(@Header("Authorization") String authorization,
			@Path("client_id") String clientId, @Query("client_secret") String clientSecret,
			@Query("scopes") List<String> scopes, @Query("note") String note, @Query("note_url") String noteUrl,
			@Query("fingerprint") String fingerprint);

	@GET("authorizations")
	Call<List<OAuth>> getAuthorizations(@Header("Authorization") String authorization);

	@GET("applications/grants")
	Call<List<OAuth>> getGrants(@Header("Authorization") String authorization);

	@GET("applications/grants/{id}")
	Call<OAuth> getGrant(@Header("Authorization") String authorization, @Path("id") Long id);

	@GET("authorizations/{id}")
	Call<OAuth> getAuthorization(@Header("Authorization") String authorization, @Path("id") Long id);

	@PATCH("authorizations/{id}")
	Call<OAuth> updateAuthorization(@Header("Authorization") String authorization, @Path("id") Long id);

	@DELETE("authorizations/{id}")
	Call<OAuth> deleteAuthorization(@Header("Authorization") String authorization, @Query("scopes") List<String> scopes,
			@Query("add_scopes") Scope[] addScopes, @Query("remove_scopes") Scope[] removeScopes,
			@Query("note") String note, @Query("note_url") String noteUrl, @Query("fingerprint") String fingerprint);

	@GET("applications/{client_id}/tokens/{access_token}")
	Call<OAuth> checkAuthorization(@Path("client_id") String clientId, @Path("access_token") String token);

	@POST("applications/{client_id}/tokens/{access_token}")
	Call<OAuth> resetAuthorization(@Path("client_id") String clientId, @Path("access_token") String token);

	@DELETE("applications/{client_id}/tokens/{access_token}")
	Call<Response> revokeAuthorization(@Path("client_id") String clientId, @Path("access_token") String token);
}

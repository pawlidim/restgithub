package de.pawlidi.restgithub.rest.utils;

import de.pawlidi.restgithub.rest.converter.EnumConverter;
import de.pawlidi.restgithub.rest.converter.GsonConverter;
import de.pawlidi.restgithub.rest.converter.PrimitiveConverter;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;

/**
 * Factory class for retrofit library.
 * 
 * @author PAWLIDIM
 *
 */
public final class RetrofitFactory {

	private RetrofitFactory() {
		super();
	}

	/**
	 * Creates retrofit service for given base url.
	 * 
	 * @param baseUrl
	 * @return retrofit, null otherwise
	 */
	public static Retrofit createRetrofit(final String baseUrl) {
		if (baseUrl != null && !baseUrl.trim().isEmpty()) {
			Retrofit.Builder builder = new Retrofit.Builder();
			builder.baseUrl(baseUrl);

			// add converter
			addConverter(builder);

			// add client
			addClient(builder);

			return builder.build();
		}
		return null;
	}

	private static void addConverter(Builder builder) {
		builder.addConverterFactory(new PrimitiveConverter());
		builder.addConverterFactory(new EnumConverter());
		builder.addConverterFactory(new GsonConverter());
	}

	private static void addClient(Builder builder) {
		OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
		// add other interceptors

		httpClientBuilder.addInterceptor(new LoggingInterceptor());
		builder.client(httpClientBuilder.build());
	}
}

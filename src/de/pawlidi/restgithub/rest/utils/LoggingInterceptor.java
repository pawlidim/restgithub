package de.pawlidi.restgithub.rest.utils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class LoggingInterceptor implements Interceptor {

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();

		// logger.info(
		// String.format("Sending request %s on %s%n%s", request.url(),
		// chain.connection(), request.headers()));

		// logger.info(String.format("Received response for %s in %.1fms%n%s",
		// response.request().url(), (t2 - t1) / 1e6d,
		// response.headers()));

		Response response = chain.proceed(request);
		return response;
	}

}

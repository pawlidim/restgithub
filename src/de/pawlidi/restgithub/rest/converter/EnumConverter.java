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
package de.pawlidi.restgithub.rest.converter;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import de.pawlidi.restgithub.dto.Scope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * 
 * @author PAWLIDIM
 *
 */
public final class EnumConverter extends Converter.Factory implements IConverter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * retrofit2.Converter.Factory#responseBodyConverter(java.lang.reflect.Type,
	 * java.lang.annotation.Annotation[], retrofit2.Retrofit)
	 */
	@Override
	public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
		if (type.equals(Scope.class)) {
			return new Converter<ResponseBody, Scope>() {
				@Override
				public Scope convert(ResponseBody value) throws IOException {
					return Scope.getEnumForSerializedName(value.string());
				}
			};
		}
		return super.responseBodyConverter(type, annotations, retrofit);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * retrofit2.Converter.Factory#requestBodyConverter(java.lang.reflect.Type,
	 * java.lang.annotation.Annotation[], java.lang.annotation.Annotation[],
	 * retrofit2.Retrofit)
	 */
	@Override
	public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations,
			Annotation[] methodAnnotations, Retrofit retrofit) {
		if (type.equals(Scope.class)) {
			return new Converter<Scope, RequestBody>() {
				@Override
				public RequestBody convert(Scope value) throws IOException {
					return RequestBody.create(MediaType.parse(GIT_HUB_MEDIA_TYPE), "" + value.getSerializedName());
				}
			};
		}
		return super.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
	}

}

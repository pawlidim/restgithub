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
package de.pawlidi.restgithub.rest.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 
 * @author PAWLIDIM
 *
 */
public class ReflectionUtils {

	/**
	 * 
	 * @param collectionType
	 * @return
	 */
	public static Class getCollectionElementType(Type collectionType) {
		if (!(collectionType instanceof ParameterizedType)) {
			return null;
		}
		Type[] typeArguments = ((ParameterizedType) collectionType).getActualTypeArguments();
		if (typeArguments.length == 0) {
			return null;
		}
		Type typeArgument = typeArguments.length == 1 ? typeArguments[0] : typeArguments[1];
		if (typeArgument instanceof ParameterizedType) {
			typeArgument = ((ParameterizedType) typeArgument).getRawType();
		}
		if (!(typeArgument instanceof Class)) {
			return null;
		}
		return (Class) typeArgument;
	}
}

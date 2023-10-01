/*
 * Copyright © 2023 Dominic Heutelbeck (dominic@heutelbeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sapl.server.ce.security.apikey;

import io.sapl.server.ce.security.ClientDetailsService;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

/**
 * Represents an authentication token within the example application.
 */
public class ApiKeyAuthenticationToken extends AbstractAuthenticationToken {
	private final String apiKey;

	public ApiKeyAuthenticationToken(String apiKey) {
		super(List.of(new SimpleGrantedAuthority(ClientDetailsService.CLIENT)));
		this.apiKey = apiKey;
		setAuthenticated(true);
	}

	@Override
	public Object getCredentials() {
		return null;
	}

	@Override
	public Object getPrincipal() {
		return apiKey;
	}
}

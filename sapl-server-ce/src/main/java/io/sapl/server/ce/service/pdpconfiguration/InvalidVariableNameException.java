package io.sapl.server.ce.service.pdpconfiguration;

import lombok.NonNull;

/**
 * {@link Exception} for an invalid name of a {@link Variable}.
 */
public class InvalidVariableNameException extends Exception {
	public InvalidVariableNameException(@NonNull String invalidName) {
		super(String.format("variable name \"%s\" is invalid", invalidName));
	}
}

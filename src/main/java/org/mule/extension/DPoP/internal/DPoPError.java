package org.mule.extension.DPoP.internal;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

public enum DPoPError implements ErrorTypeDefinition<DPoPError> {
	FILE_NOT_FOUND,
	IO_ERROR1,
	INTERNAL_SERVER_ERROR,
	NOT_FOUND,
	FORBIDDEN
}

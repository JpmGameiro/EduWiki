package isel.leic.ps.eduWikiAPI.exceptionHandlers.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.CONFLICT)
data class ConflictException(
        val title: String,
        val detail: String
): Exception(title)

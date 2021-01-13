package database.diagram.demo.domain

import java.time.LocalDateTime

sealed class TranslationChangeName(
        var date:LocalDateTime,
)
class ForwardTranslation(date:LocalDateTime) : TranslationChangeName(date)
class BackwardTranslation(
        forwardTranslation: ForwardTranslation,
        result: String,
        date:LocalDateTime
) : TranslationChangeName(date) {
}
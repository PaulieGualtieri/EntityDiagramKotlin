package database.diagram.demo.domain

sealed class TranslationRole(
        translation: QuestionTranslation
) {
}

class TranslatorRole(translation: QuestionTranslation) : TranslationRole(translation)
class CoordinatorRole(translation: QuestionTranslation) : TranslationRole(translation)
class ManagerRole(translation: QuestionTranslation) : TranslationRole(translation)
class ExpertRole(translation: QuestionTranslation, expertiseDomain:String) : TranslationRole(translation)


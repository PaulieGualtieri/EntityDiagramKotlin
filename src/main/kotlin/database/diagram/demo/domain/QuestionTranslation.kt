package database.diagram.demo.domain

class QuestionTranslation(
        var manager: ManagerRole,
        var coordinator: CoordinatorRole,
        var expert: ExpertRole,
        var sourceLanguage: Language,
        var targetLanguage: Language,
        var finalChoice: TranslationChoice,
        var firstTranslations: Set<TranslationPart>
)
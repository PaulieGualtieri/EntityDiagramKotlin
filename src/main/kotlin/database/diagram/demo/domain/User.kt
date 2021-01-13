package database.diagram.demo.domain

sealed class User(
        var name: String,
        var nativeLanguage: Language
) {
}
class Pilot(name:String, nativeLanguage: Language): User(name,nativeLanguage)
class LanguageUser(name: String,
                   nativeLanguage: Language,
                   var previousTranslations: List<TranslationRole>,
                   knownLanguages:Set<Language>,
                   var currentRoles:Set<Role>) : User(name, nativeLanguage)


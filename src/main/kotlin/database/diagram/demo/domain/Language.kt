package database.diagram.demo.domain

data class Language(val name: String, var users: Set<User>) {
}
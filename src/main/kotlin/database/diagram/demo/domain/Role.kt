package database.diagram.demo.domain

sealed class Role

object Translator : Role()
object Manager : Role()
object Coordinator : Role()
data class Expert(val expertiseDomain: String) : Role()
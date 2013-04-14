package mcClassSys

import scala.language.experimental.macros
import reflect.macros.Context

object NewClassMacros {
	def newClass(): Any = macro newClass_impl

	def newClass_impl(c: Context)(): c.Expr[Any] = {
		import c.universe._
		reify {() => {}}
	}
}
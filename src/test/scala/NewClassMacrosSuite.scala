package mcClassSys

import org.scalatest._
import NewClassMacros._

class NewClassMacrosSuite extends FunSuite {
	test("should create class") {
		var c1 = newClass
		assert(c1 != null)
	}
}
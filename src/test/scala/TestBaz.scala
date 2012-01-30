package com.foo.junit

import org.scalatest.FlatSpec

class TestBaz extends FlatSpec {

	behavior of "TestBaz"

	it should "make sure 1+1=2" in {
		val check=1+1
		assert(check==2)
	}
}

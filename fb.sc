// scala -nc fb.sc

object FizzBuzz extends App {
	for (i <- 1 to 100) {
		var out = ""

		if (i % 3 == 0) out += "Fizz"
		if (i % 5 == 0) out += "Buzz"

		println(if (out == "") i.toString else out)
	}
}

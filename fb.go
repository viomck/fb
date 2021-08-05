package main

import "fmt"

const fbLimit = 100

func main() {
	for i := 1; i <= fbLimit; i++ {
		found := false

		if i % 3 == 0 {
			found = true
			fmt.Printf("Fizz")
		}

		if i % 5 == 0 {
			found = true
			fmt.Printf("Buzz")
		}

		if !found {
			fmt.Printf("%d", i)
		}

		fmt.Printf("\n")
	}
}

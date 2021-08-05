FB_LIMIT = 100

for i in range(1, FB_LIMIT + 1):
	out = ""

	if i % 3 == 0:
		out = "Fizz"
	if i % 5 == 0:
		out += "Buzz"

	if not out:
		out = str(i)

	print(out)

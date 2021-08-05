#include <stdio.h>

int FB_LIMIT = 100;

int main() {
	for (int i = 1; i <= FB_LIMIT; i++) {
		int found = 0;

		if (i % 3 == 0) {
			found = 1;
			printf("Fizz");
		}

		if (i % 5 == 0) {
			found = 1;
			printf("Buzz");
		}

		if (!found) {
			printf("%d", i);
		}

		printf("\n");
	}

	return 0;
}

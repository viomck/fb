<?php

// I have not written PHP in years. This is bound to go well.

$fbLimit = 100;

for ($i = 1; $i <= $fbLimit; $i++) {
	$found = false;

	if ($i % 3 == 0) {
		$found = true;
		echo("Fizz");
	}
	if ($i % 5 == 0) {
		$found = true;
		echo("Buzz");
	}

	if (!$found) {
		echo($i);
	}

	echo("\n");
}

?>

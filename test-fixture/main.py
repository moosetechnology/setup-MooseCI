def add(a, b):
	"""Return the sum of two values."""
	unusedLocalVar = 2
	return a + b


if __name__ == "__main__":
	import sys

	a, b = map(int, sys.stdin.read().split())
	print(add(a, b))

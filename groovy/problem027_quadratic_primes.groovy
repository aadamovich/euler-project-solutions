
def isPrime = { long n ->
  if (n < 0) return false
  if (n == 2) return true
  if (n % 2 == 0) return false
  for (long i = 3; i * i <= n; i += 2) {
    if (n % i == 0) {
      return false
    }
  }
  true
}.memoize()

def formula = { long a, long b, long n ->
  n*n + a*n + b
}


def max = 0
def maxA = 0
def maxB = 0
for (int a = -999; a < 1000; a++) {
  for (int b = -999; b < 1000; b++) {
    long n = 0
    while (isPrime(formula(a, b, n))) {
      n++
    }
    if (n > max) {
      max = n
      maxA = a
      maxB = b
    }
  }
}

println "$max primes"
println "$maxA * $maxB = ${maxA * maxB}"


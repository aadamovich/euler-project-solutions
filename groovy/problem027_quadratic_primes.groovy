
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Euler published the remarkable quadratic formula:
//
// n² + n + 41
// 
// It turns out that the formula will produce 40 primes for the consecutive values n = 0 to 39. 
// However, when n = 40, 40² + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41² + 41 + 41 is clearly divisible by 41.
// 
// Using computers, the incredible formula  n² - 79n + 1601 was discovered, which produces 80 primes for the consecutive values n = 0 to 79. The product of the coefficients, 79 and 1601, is 126479.
//
// Considering quadratics of the form:
//
// n² + an + b, where |a|  1000 and |b|  1000
// 
// where |n| is the modulus/absolute value of n
// e.g. |11| = 11 and |4| = 4
//
// Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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


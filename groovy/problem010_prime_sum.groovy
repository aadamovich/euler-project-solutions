
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def L = 2000000

boolean isPrime(long n) {
  if (n % 2 == 0) return false
  for (long i = 3; i * i <= n; i += 2) {
    if (n % i == 0) {
      return false
    }
  }
  true
}

BigInteger s = 2
for (long i = 3; i < L; i++) {
  if (isPrime(i)) {
    s += i
  }
}

println s
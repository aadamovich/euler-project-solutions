


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


def g = 3
while(true) {
  if (!isPrime(g)) {
    def found = false
    for(long p = 2; p <= g - 2; p++) {
      if (isPrime(p)) {
        for(long s = 1; 2 * s * s <= g - p; s++) {
          if (g == p + 2 * s * s) {
            found = true
            break
          }
        }
      }
      if (found) break
    }
    if (!found) {
      println g
      System.exit(0)
    }
  }
  g += 2
}
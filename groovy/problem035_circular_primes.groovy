

def tenPow(n) {
  def r = 1
  for(int i = 1; i <=n; i++) {
    r *= 10
  }
  r
}

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
}

def isCircularPrime = { long n ->
  if (isPrime(n)) {
    def digits = n.toString().size()
    if (digits > 1) {
      for (int i = 1; i <= digits; i++) {
        def lastDigit = n % 10
        def firstDigits = (long) n / 10
        n = lastDigit * tenPow(digits - 1) + firstDigits
        if (!isPrime(n)) {
          return false
        }      
      }
    }
    return true
  }
  return false
}



def c = 0
for(long i = 2; i < 1000000; i++) {
  if (isCircularPrime(i)) {
    c++
    println i
  }
}

println c


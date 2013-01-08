
// 
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?
//

def pc = 1

boolean isPrime(long n) {
  if (n % 2 == 0) return false
  for (long i = 3; i * i <= n; i += 2) {
    if (n % i == 0) {
      return false
    }
  }
  true
}

def i = 3
while(pc < 10001) {
  if (isPrime(i)) {
    pc++
  }
  i++
}

println i - 1
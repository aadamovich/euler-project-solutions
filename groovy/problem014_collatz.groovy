

def collatz(long n) {
  long L = 1
  while (n != 1) {
    if (n % 2 == 0) {
      n = n >> 1
    } else {
      n = 3*n + 1
    }
    L++
  }
  L
}


long M = 1
long N = -1
for (long i = 999999; i >= 1; i--) {
  long L = collatz(i)
  // println "$i -> $L"
  if (L > M) {
    M = L
    N = i
  }
}

println N
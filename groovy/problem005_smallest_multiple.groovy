
//
//
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//
//

long x = 20
long m = 1

def isMultiple(m, n) {
  for (i = 2; i <= n; i++) {
    if (m % i != 0) {
      return false
    }
  }
  true
}

for (long i = 2; i <= x; i++) {
  if (m % i != 0) {
    prevM = m
    m = m * i
    for (long j = 2; j < i; j++) {
      def changed = false
      while(isMultiple(m, i)) {
        m = m / j
        changed = true
      }
      if (changed) {
        m = m * j
      }
    }    
  }
  println "${i} -> ${m}"
}

println m





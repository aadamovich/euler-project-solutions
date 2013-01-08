
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// The sum of the squares of the first ten natural numbers is,
//
// 1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,
// 
// (1 + 2 + ... + 10)^2 = 55^2 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
// 
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def sumn(n) {
  n*(n+1)/2
}

def summn(m, n) {
  assert n > m
  sumn(n) - sumn(m-1)
}

def s = 0

for(long i = 1; i < 99; i++) {
  s += 2*i*summn(i + 1, 100)
}

s += 2*99*100

println s

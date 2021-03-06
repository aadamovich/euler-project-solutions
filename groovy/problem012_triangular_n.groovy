
////////////////////////////////////////7////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
// 
// 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
// 
// Let us list the factors of the first seven triangle numbers:
// 
//  1: 1
//  3: 1,3
//  6: 1,2,3,6
// 10: 1,2,5,10
// 15: 1,3,5,15
// 21: 1,3,7,21
// 28: 1,2,4,7,14,28
// 
// We can see that 28 is the first triangle number to have over five divisors.
// 
// What is the value of the first triangle number to have over five hundred divisors?
// 
////////////////////////////////////////7////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def sumn(n) {
  (long) n * (n + 1) / 2
}

// Any number can be represented as n = p1^e1 * p2^e2 * ... pk^ek. Number of divisors of n is equal to (e1 + 1)*(e2 + 1)* ... *(ek + 1)

for(long i = 8;;i++) {

  def n = sumn(i)

  // Create a map of divisors p1 -> e1, p2 -> e2, ...
  def ds = [:]
  def d = 2
  while (n != 1) {
    while (n % d == 0) {
      n = (long) n / d
      ds[d] = ds.containsKey(d) ? ds[d] + 1 : 1
    }
    d++
  }

  // Calculate number of divisors.
  def dn = 1
  ds.each { k, v ->
    dn *= v + 1
  }

  // Check if it fits.
  if (dn > 500) {
    println sumn(i)
    System.exit(0)
  }

}



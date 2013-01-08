
//
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
// 
// Find the largest palindrome made from the product of two 3-digit numbers.
//

def n = 997
while (n > 100) {
  def p = "${n}${n.toString().reverse()}".toInteger()
  for (int i = 999; i > 100; i-- ) {
    if (p % i == 0 && "${p / i}".size() == 3) {
      println "${p} = ${i} x ${p/i}"
      System.exit(0)
    }
  }
  n--
}

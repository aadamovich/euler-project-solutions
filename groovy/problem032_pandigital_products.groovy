
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
//
// The product 7254 is unusual, as the identity, 39 x 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.
//
// Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
//
// HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


def isPandigital(String s) {
  def digits = s.toCharArray().collect { it.toString().toInteger() } 
  (s.size() == 9) && (digits == digits.unique()) && (digits.sum() == 45)
}


def s = 0
def p = [] as Set
for(int a = 1; a <= 2000; a++) {
  for(int b = 2000; b > a; b--) {
    int c = a * b
    if (isPandigital("$a$b$c") && !p.contains(c)) {
      s += c
      p << c
      println "$a * $b = $c"
    }
  }
}

println s
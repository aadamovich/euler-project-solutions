
////////////////////////////////////////////////////////////////////////////////
//
// What is the first term in the Fibonacci sequence to contain 1000 digits?
//
////////////////////////////////////////////////////////////////////////////////

BigInteger fa = 1
BigInteger fb = 1
long i = 2
while (fb.toString().size() < 1000) {
  t = fa
  fa = fb
  fb = t + fb
  i++
}

println i
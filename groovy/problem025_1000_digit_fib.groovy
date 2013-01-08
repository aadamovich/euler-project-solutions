
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
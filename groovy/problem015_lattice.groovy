
BigInteger n = 20

def fact(n) {
 BigInteger f = 1
 for(i = 1; i <=n; i++) {
   f *= i
 }
 f
}

def fn = fact(n)
println fact(2*n)/(fn*fn)
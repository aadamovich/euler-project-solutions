

BigInteger f = 1
for(long i = 1; i <= 100; i++) {
  f *= i
}

def s = 0
f.toString().each { c ->
 s += c.toInteger()
}

println s
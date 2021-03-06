
//////////////////////////////////////////////////////////////////////
//
// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// 
// What is the sum of the digits of the number 2^1000?
//
//////////////////////////////////////////////////////////////////////

BigInteger n = Math.pow(2, 1000)

def s = 0
n.toString().each { c ->
 s += c.toInteger()
}

println s
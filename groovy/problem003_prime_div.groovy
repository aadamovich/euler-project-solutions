
///////////////////////////////////////////////////////////////////////// 
//
// The prime factors of 13195 are 5, 7, 13 and 29.
// 
// What is the largest prime factor of the number 600851475143 ?
//
/////////////////////////////////////////////////////////////////////////


def n = 600851475143

def ds = 2
def d = 2
while (n != 1) {
  while (n % d == 0) {
    n = (long) n / d
    ds = d
  }
  d++
}

println ds

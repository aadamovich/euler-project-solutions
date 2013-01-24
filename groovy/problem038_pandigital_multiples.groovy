



def isPandigital(String s) {
  def digits = s.toCharArray().collect { it.toString().toInteger() } 
  (s.size() == 9) && (digits == digits.unique()) && (digits.sum() == 45)
}


def max = 123456789

def i = 1
while(i.toString().size() * 2 <= 9) {
  def x = "$i"
  def j = 2
  while (x.size() < 9) {
    x += "${j * i}"
    j++
  }
  if (isPandigital(x)) {
    if (x.toInteger() > max) {
      max = x.toInteger()
      println "$i x (1, ..., ${j - 1}) = $x"
    }
  }
  i++
}

println max

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. 
// If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. 
// The lexicographic permutations of 0, 1 and 2 are:
// 
//  012   021   102   120   201   210
//
// What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


def permutation = "0123456789".toCharArray()

def nextPermutation(char[] a) {
  int k = a.size() - 2
  while ((k >= 0) && (a[k] >= a[k + 1])) {
    k--
  }
  if (k < 0) {
    return null
  }
  int j = a.size() - 1
  while ((j >= 0) && (j > k) && (a[k] >= a[j])) {
    j--
  }
  if (j < 0) {
    return null
  }
  def tmp = a[k]
  a[k] = a[j]
  a[j] = tmp

  def str = new String(a)
  return (str.substring(0, k + 1) + str.substring(k + 1).reverse()).toCharArray()

}

for(i = 2; i <= 1000000; i++) {
  permutation = nextPermutation(permutation)
  if (!permutation) {
    println "No more permutations!"
    System.exit(1)
  }
}

println new String(permutation)



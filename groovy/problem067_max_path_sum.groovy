
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
// Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), 
// a 15K text file containing a triangle with one-hundred rows.
// 
// NOTE: This is a much more difficult version of Problem 18. It is not possible to try every route to solve this problem, 
// as there are 2^99 altogether! If you could check one trillion (10^12) routes every second it would take over twenty billion years to check them all. 
// There is an efficient algorithm to solve it. ;o)
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


def str = new File('triangle.txt').text

def tri = str.split('\n').collect { line -> line.split(' ').collect { it.toInteger() } }.reverse()

for(int i = 0; i < tri.size() - 1; i++ ) {
  for(int j = 0; j < tri[i].size() - 1; j++ ) {
    tri[i + 1][j] = Math.max(tri[i + 1][j] + tri[i][j], tri[i + 1][j] + tri[i][j + 1])
  }
}

println tri[-1]

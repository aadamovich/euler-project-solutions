
def str = new File('triangle.txt').text

def tri = str.split('\n').collect { line -> line.split(' ').collect { it.toInteger() } }.reverse()

for(int i = 0; i < tri.size() - 1; i++ ) {
  for(int j = 0; j < tri[i].size() - 1; j++ ) {
    tri[i + 1][j] = Math.max(tri[i + 1][j] + tri[i][j], tri[i + 1][j] + tri[i][j + 1])
  }
}

println tri[-1]

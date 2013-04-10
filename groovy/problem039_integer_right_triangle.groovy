

int max = 0
for(int p = 3; p <= 1000; p++) {
  int h = p >> 1 - 1
  int s = 0
  for(int a = 1; a <= h; a++) {
    for(int b = 1; b <= h; b++) {
      long c2 = a*a + b*b
      double c = Math.sqrt(c2)
      if (a + b + c == p) {
        s++;
      }
    }
  }
  if (s > max) {
    max = s
    println p
  }
}
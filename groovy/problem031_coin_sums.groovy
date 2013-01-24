
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
// 
// 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
//
// It is possible to make £2 in the following way:
// 
// 1*£1 + 1*50p + 2*20p + 1*5p + 1*2p + 3*1p
//
// How many different ways can £2 be made using any number of coins?
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// TODO

def coins = [1, 2, 5, 10, 20, 50, 100, 200]

coins = [1, 2, 5, 10, 20, 50, 100, 200]

TARGET=200

matrix = {}
for y in xrange(0, TARGET+1):
    # There is only one way to form a target sum N
    # via 1-cent coins: use N 1-cents!
    matrix[y, 0] = 1  # equivalent to matrix[(y,0)]=1

for y in xrange(0, TARGET+1):
    print y, ":", 1,
    for x in xrange(1, len(coins)):
        matrix[y, x] = 0
        # Is the target big enough to accomodate coins[x]?
        if y>=coins[x]:
            # If yes, then the number of ways to form
            # the target sum are obtained via:
            #
            # (a) the number of ways to form this target
            #     using ONLY coins less than column x
            #     i.e. matrix[y][x-1]
            matrix[y, x] += matrix[y, x-1]
            # plus
            # (b) the number of ways to form this target
            #     when USING the coin of column x
            #     which means for a remainder of y-coins[x]
            #     i.e. matrix[y-coins[x]][x]
            matrix[y, x] += matrix[y-coins[x], x]
        else:
            # if the target is not big enough to allow
            # usage of the coin in column x,
            # then just copy the number of ways from the
            # column to the left (i.e. with smaller coins)
            matrix[y, x] = matrix[y, x-1]
        print matrix[y, x],
    print


def coin_sums(c) {
  if (c.size() == 1) {
    return 1
  }
  def biggestCoin = c.head()
  def smallerCoins = c.tail()
  if (biggestCoin % smallerCoins.tail() == 0) {
    return 1 + coin_sums(smallerCoins)
  }

}

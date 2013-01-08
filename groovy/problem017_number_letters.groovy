
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
//
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
// The use of "and" when writing out numbers is in compliance with British usage.
// 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    words = [ 0: "",      1: "one",     2: "two",     3: "three",     4: "four",      5: "five",     6: "six",      7: "seven",      8: "eight",      9: "nine", 
             10: "ten",  11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen", 15: "fifteen", 16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen",
             20: "twenty", 
             30: "thirty", 
             40: "forty", 
             50: "fifty", 
             60: "sixty", 
             70: "seventy", 
             80: "eighty", 
             90: "ninety", 
            100: "hundred"]


def ninw(n) {
  if (0 <= n && n <= 19) {
    return words[n]
  } else if (20 <= n && n <= 99) {
    def r = n % 10
    return words[n - r] + ( r == 0 ? '' : '-' + ninw(r) )
  } else if (100 <= n && n <= 999) {
    def r = n % 100
    def h = (int) (n - r) / 100
    return words[h] + ' ' + words[100] + ( r == 0 ? '' : " and " + ninw(r) )
  } else if (n == 1000){
    return words[1] + " thousand"
  } else {
    throw new IllegalArgumentException("Unknown number: $n")
  }
}


def len(n) {
  ninw(n).replaceAll('[ -]', '').size()
}

def L = 0
for(int i = 1; i <= 1000; i++) {  
  println ninw(i)
  L += len(i)
}

println L 
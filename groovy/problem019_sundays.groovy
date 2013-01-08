

def date = new GregorianCalendar(1901, Calendar.JANUARY, 1)
def endDate = new GregorianCalendar(2000, Calendar.DECEMBER, 31)

def s = 0
while (date.before(endDate)) {
  s += date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 1 : 0
  date.add(Calendar.MONTH, 1)
}

println s

package part2

assert 1 == (-1).abs()
assert 2 == 2.5.toInteger()
assert 2 == 2.5 as Integer
assert 2 == (int) 2.5
assert 3 == 2.5f.round()
assert 3.142 == Math.PI.round(3)
assert 4 == 4.5f.trunc()
assert 2.718 == Math.E.trunc(3)

assert '2.718'.isNumber()
assert 5 == '5'.toInteger()
assert 5 == '5' as Integer
assert 53 == (int) '5'
assert '6 times' == 6 + ' times'
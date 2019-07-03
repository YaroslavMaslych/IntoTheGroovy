package part1

def nick = 'nerp'
def book = 'Catch-22'
assert "$nick is $book" == 'nerp is Catch-22'
assert '12345' =~ /\d+/
assert 'xxxxx' == '12345'.replaceAll(/\d/, 'x')
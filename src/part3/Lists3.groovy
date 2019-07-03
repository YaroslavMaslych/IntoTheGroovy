package part3

myList = []

myList += 'a'
assert myList == ['a']

myList += ['b', 'c']
assert myList == ['a', 'b', 'c']

myList = []
myList << 'a' << 'b'
assert myList == ['a', 'b']

assert myList - ['b'] == ['a']

assert myList * 2 == ['a', 'b', 'a', 'b']

myList = ['a', 'b', 'c']

assert myList.isCase('a')
assert 'b' in myList

def candidate = 'c'
switch (candidate) {
    case myList: assert true; break
    default: assert false
}

assert ['x', 'a', 'z'].grep(myList) == ['a']

myList = []
if (myList) assert false

def expr = ''
for (i in [1,'*',5]) {
    expr += i
}
assert expr == '1*5'


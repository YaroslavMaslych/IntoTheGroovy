package part3

def list = [1, 2, 3]

assert list.first() == 1
assert list.head() == 1
assert list.tail() == [2, 3]
assert list.last() == 3
assert list.count(2) == 1
assert list.max() == 3
assert list.min() == 1

def even = list.find { item ->
    item % 2 == 0
}
assert even == 2

assert list.every { item -> item < 5 }
assert list.any { item -> item < 2 }

def store = ''
list.each { item ->
    store += item
}
assert store == '123'

store = ''
list.reverseEach { item ->
    store += item
}
assert store == '321'

store = ''
list.eachWithIndex { item, index ->
    store += "$index:$item "
}
assert store == '0:1 1:2 2:3 '

assert list.join('-') == '1-2-3'

result = list.inject(0) { clinks, guests ->
    clinks + guests
}
assert result == 0 + 1 + 2 + 3
assert list.sum() == 6

factorial = list.inject(1) { fac, item ->
    fac * item
}
assert factorial == 1 * 1 * 2 * 3
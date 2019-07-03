package part3

def myMap = [a:1, b:2, c:3]

def store =''
myMap.each { entry ->
    store += entry.key
    store += entry.value
}
assert store == 'a1b2c3'

store = ''
myMap.each { key, value ->
    store += key
    store += value
}
assert store == 'a1b2c3'

store = ''
for (key in myMap.keySet()) {
    store += key
}
assert store == 'abc'

store = ''
for (value in myMap.values()) {
    store += value
}
assert store == '123'
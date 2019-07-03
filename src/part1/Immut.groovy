package part1

import groovy.transform.Immutable

@Immutable
class FixedBook {
    String title
}

def gina = new FixedBook('Magic')
def regina = new FixedBook(title: 'DarkMagic')

assert gina.title == 'Magic'
assert regina.title == 'DarkMagic'

try {
    gina.title = 'Heresy'
    assert false, 'Wish you were here'
} catch (ReadOnlyPropertyException expected) {
    println "Expected Error: '$expected.message'"
}
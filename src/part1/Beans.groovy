package part1

class BookBean {
    String title
}

def groovyBook = new BookBean()

groovyBook.setTitle('GroovyInAction')
assert groovyBook.getTitle() == 'GroovyInAction'

groovyBook.title = 'Groovy conquers'
assert groovyBook.title == 'Groovy conquers'

package part1

class Assertions {
    static void main(String[] args) {
        assert (true)
        assert 1 == 1
        def x = 1
        assert x == 1
        def y = 1; assert y == 1
        def a = 5
        def b = 9
        assert b == a + a - 1
        // assert ('text' * 3 << 'hello').size() == 4 * 3 + 4
        assert x == 'this is definitely the context of x'
    }
}
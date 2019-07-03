package part2

import java.awt.*

println(60 * 60 * 24 * 365).toString()

int secondsPerYear = 60 * 60 * 24 * 365;
println secondsPerYear.toString();

println new Integer(secondsPerYear).toString()

assert "abc" - "a" == "bc"

assert 'ABCDE'.indexOf(67) == 2

//String greeting = readFromConsole()

//def greeting = readFromConsole()

//Integer myInt = new Object()
//println myInt

Point topLeft = new Point(0, 0)
Point botRight = [100, 100]
Point center = [x: 20, y: 50]

assert botRight instanceof Point
assert center instanceof Point

def rect = new Rectangle()
rect.location = [0, 0]
rect.size = [width: 100, height: 100]
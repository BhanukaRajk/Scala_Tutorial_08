case class Point(var x: Int, var y: Int) {
    def +(that: Point): Point = {
       return Point(this.x + that.x, this.y + that.y)
    }

    def move(dx: Int, dy: Int) = {
        this.x = this.x + dx
        this.y = this.y + dy
    }

    def distance(x: Int, y: Int): Double = {
        return scala.math.sqrt(math.pow(this.x - x, 2) + math.pow(this.y - y, 2))
    }

    def invert() = {
        var TEMP = this.y
        this.y = this.x
        this.x = TEMP
    }
}

object Q1 {
    def main(args: Array[String]):Unit = {
        var num1 = Point(3, 5)
        var num2 = Point(1, 4)
    
        println(num1 + num2)

        num1.move(2, 4)
        println(num1)

        num2.move(3, 8)
        println(num2)

        println(num1.distance(2, 3))
        println(num2.distance(4, 5))

        num1.invert()
        println(num1)

        num2.invert()
        println(num2)
    }
    
}
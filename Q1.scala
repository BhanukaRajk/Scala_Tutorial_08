case class Point(var x: Int, var y: Int) {

    // Question 1.a addition
    def +(that: Point): Point = {
       return Point(this.x + that.x, this.y + that.y)
    }

    // Question 1.b change point with given value
    def move(dx: Int, dy: Int) = {
        this.x = this.x + dx
        this.y = this.y + dy
    }

    // Question 1.c get the distance between defined point and given point
    def distance(x: Int, y: Int): Double = {
        return scala.math.sqrt(math.pow(this.x - x, 2) + math.pow(this.y - y, 2))
    }

    // Question 1.d inverse point
    def invert() = {
        var TEMP = this.y
        this.y = this.x
        this.x = TEMP
    }

}

object Q1 {
    def main(args: Array[String]) = {

        // Pre defined two points
        var P1 = Point(3, 5)
        var P2 = Point(1, 4)
    
        // Adding two points
        println("\nNumber1 + Number2 = " + (P1 + P2))

        // Move point 1
        P1.move(2, 4)
        println("\nNew point of P1 = " + P1)

        // Move point 2
        P2.move(3, 8)
        println("New point of P2 = " + P2)

        // Distance calculation
        println("\nDistance from P1 = " + P1.distance(2, 3))
        println("Distance from P2 = " + P2.distance(4, 5))

        // Inverse point of P1
        print("\nInversion of " + P1 + " = ")
        P1.invert()
        println(P1)

        // Inverse point of P2
        print("Inversion of " + P2 + " = ")
        P2.invert()
        println(P2)
    }
    
}
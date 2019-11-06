clear()

drawStage(ColorMaker.white)

val cb = canvasBounds

class Ball {

    val pic1 = scale(0.5, 0.5) -> PicShape.image("C:/Users/Win 10/Pictures/q.png")

    val pic2 = scale(0.5, 0.5) -> PicShape.image("C:/Users/Win 10/Pictures/q.png")

    val pic = picBatch(

        pic1,

        pic2

    )

    pic.setPosition(cb.x + 20, cb.y + 20)

    var vel = Vector2D(2, 10)

    val gravity = Vector2D(0, -0.2)

    def draw() {

        pic.draw()

    }

    def step() {
        vel = vel + gravity

        pic.translate(vel)

        if (pic.collidesWith(stageBorder)) {

            vel = bouncePicVectorOffStage(pic, vel)

        }
        pic.showNext(150)

    }

}

class Ball1 {

    val pic3 = scale(0.5, 0.5) -> PicShape.image("C:/Users/Win 10/Pictures/1.png")

    val pic4 = scale(0.5, 0.5) -> PicShape.image("C:/Users/Win 10/Pictures/1.png")

    val pic1 = picBatch(

        pic3,

        pic4

    )

    pic1.setPosition(cb.x + 190, cb.y + 50)

    var vel1 = Vector2D(2, 10)

    val gravity1 = Vector2D(1, -0.9)

    def draw1() {

        pic1.draw()

    }

    def step1() {
        vel1 = vel1 + gravity1

        pic1.translate(vel1)

        if (pic1.collidesWith(stageBorder)) {

            vel1 = bouncePicVectorOffStage(pic1, vel1)

        }
        pic1.showNext(150)

    }

}
val ball = new Ball()

val ball1 = new Ball1()

ball.draw()
ball1.draw1()

animate {

    ball.step()
    ball1.step1()
}

activateCanvas()
s
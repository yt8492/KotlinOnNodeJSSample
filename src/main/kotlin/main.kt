@JsModule("express")
external fun express(): dynamic

fun main() {
    val app = express()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("Hello, Kotlin/JS!")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}

fun main() {
    val server = Server()
    server.get("/") { _, response ->
        response.message = "Hello world!"
        response.statusCode = 200
    }
    server.post("/") { request, response ->
        response.message = "body: ${request.body}"
        response.statusCode = 200
    }
    server.get("/queryTest") { request, response ->
        val foo = request.queryParameters["foo"]
        val bar = request.queryParameters["bar"]
        response.message = "foo: $foo, bar: $bar"
        response.statusCode = 200
    }
    server.get("/headerTest") { request, response ->
        val hoge = request.headers["hoge"]
        val fuga = request.headers["fuga"]
        response.message = "hoge: $hoge, fuga: $fuga"
        response.statusCode = 200
    }
    server.listen(8080) {
        println("server start")
    }
}

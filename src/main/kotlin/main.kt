fun main() {
    val server = http.createServer { req, res ->
        if (req.method == "POST") {
            val bodyBuilder = StringBuilder()
            req.on("data") { data: Any ->
                bodyBuilder.append(data.toString())
            }
            req.on("end") { ->
                res.write("url: ${req.url}\n")
                res.write("body: ${bodyBuilder.toString()}\n")
                res.end()
            }
        } else {
            res.write("url: ${req.url}\n")
            res.write("method: ${req.method}")
            res.end()
        }
    }
    server.listen(8080)
}

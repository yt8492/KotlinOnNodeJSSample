fun main() {
    val server = http.createServer { req, res ->
        res.write("url: ${req.url}\n")
        res.write("method: ${req.method}")
        res.end()
    }
    server.listen(8080)
}

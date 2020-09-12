data class Request(
    val path: String,
    val method: String,
    val headers: Headers,
    val queryParameters: QueryParameters,
    val body: String
)

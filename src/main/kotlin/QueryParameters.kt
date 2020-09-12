import NodeJS.get
import querystring.ParsedUrlQuery

class QueryParameters(
    private val parsedUrlQuery: ParsedUrlQuery
) {
    operator fun get(name: String): String? {
        return parsedUrlQuery[name] as? String
    }
}
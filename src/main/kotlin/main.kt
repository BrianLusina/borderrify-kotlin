/**
 * @author lusinabrian on 25/11/17.
 * The entry point is a standard main function.
 * Inside it, we access the body of the document and apply a border style.
 */
import kotlin.browser.document

fun main(args: Array<String>) {
    document.body?.style?.border = "5px solid yellow"
}

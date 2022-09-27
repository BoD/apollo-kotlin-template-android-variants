package com.example.apollokotlin

import com.example.apollokotlin.graphql.DebugProductQuery
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun test() {
        // `DebugProductQuery` only exists in the `debug` variant
        // so the `testDebugUnitTest` task will work, but `testReleaseUnitTest` will not compile
        println(DebugProductQuery.OPERATION_DOCUMENT)
    }
}

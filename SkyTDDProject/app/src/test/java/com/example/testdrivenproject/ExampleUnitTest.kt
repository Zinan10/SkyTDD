package com.example.testdrivenproject

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

private const val BOOK_REFERENCE_PREFIX = "BOOK-"

private const val THE_GRUFFALO_REFERENCE = "$BOOK_REFERENCE_PREFIX" + "GRUFF472"
private const val WINNIE_THE_POOH_REFERENCE = "$BOOK_REFERENCE_PREFIX" + "POOH222"
private const val THE_WIND_IN_THE_WILLOWS_REFERENCE = "$BOOK_REFERENCE_PREFIX" + "WILL987"

class ExampleUnitTest : BookService {

    private val books: Map<String, Book> = hashMapOf(
        THE_GRUFFALO_REFERENCE to Book(
            THE_GRUFFALO_REFERENCE,
            "The Gruffalo",
            "A mouse taking a walk in the woods."
        ),
        WINNIE_THE_POOH_REFERENCE to Book(
            WINNIE_THE_POOH_REFERENCE,
            "Winnie The Pooh",
            "In this first volume, we meet all the friends from the Hundred Acre Wood."
        ),
        THE_WIND_IN_THE_WILLOWS_REFERENCE to Book(
            THE_WIND_IN_THE_WILLOWS_REFERENCE,
            "The Wind In The Willows",
            "With the arrival of spring and fine weather outside, " +
                    "the good-natured Mole loses patience with spring cleaning. He flees his underground home, emerging to take in the air and ends up at the river, which he has " +
                    "never seen before. Here he meets Rat (a water vole), who at this time of year spends all his days in, on and close by the river. Rat takes Mole for a ride " +
                    "in his rowing boat. They get along well and spend many more days boating, with Rat teaching Mole the ways of the river."
        )
    )

    override fun retrieveBook(bookReference: String?): Book? {
        return books[bookReference]
    }

    override fun getBookSummary(bookReference: String?): String {
        return ""
    }




}
package com.example.testdrivenproject


interface BookService {

    @Throws(BookNotFoundException::class)
    fun retrieveBook(bookReference: String?): Book?

    @Throws(BookNotFoundException::class)
    fun getBookSummary(bookReference: String?): String?
}
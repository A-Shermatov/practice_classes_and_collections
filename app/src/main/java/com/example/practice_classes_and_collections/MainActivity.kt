package com.example.practice_classes_and_collections


// Task 1
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: String,
    val durationInMinutes: Int,
)

fun main() {
    println("Hello world!")
}
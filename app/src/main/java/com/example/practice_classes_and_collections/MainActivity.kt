package com.example.practice_classes_and_collections


// Task 1
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int,
)

// Task 2
enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING,
}

// Task 3
fun task3(): List<Event> {
    val event1 = Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)
    val events = mutableListOf(event1, event2, event3, event4, event5, event6)
    return events
}

// Task 4
fun task4(events: List<Event>) {
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")
}

// Task 5
fun task5(events: List<Event>) {
    val groupedEvents = events.groupBy { it.dayPart }
    groupedEvents.forEach { (dayPart, events) ->
        println("$dayPart: ${events.size} events")
    }
}

// Task 6
fun task6(events: List<Event>) {
    println("Last event of the day: ${events.last().title}")
}

// Task 7
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun task7(events: List<Event>) {
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

fun main() {
    val events = task3()
    task4(events)
    task5(events)
    task6(events)
    task7(events)
}
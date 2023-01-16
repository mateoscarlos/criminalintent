package com.example.criminalintent

import java.util.Date
import java.util.UUID

data class Crime (val id: UUID = UUID.randomUUID(),
                  var title: String = "",
                  var date: Date = Date(),  // It represents the time at which it was allocated
                  var isSolved: Boolean = false)


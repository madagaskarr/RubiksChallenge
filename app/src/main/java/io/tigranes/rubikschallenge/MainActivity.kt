package io.tigranes.rubikschallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var calendarWeekRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mockList = listOf<CalendarWeekDayModel>(
            CalendarWeekDayModel("22 Sep", "Wednesday"),
            CalendarWeekDayModel("23 Sep", "Thursday"),
            CalendarWeekDayModel("24 Sep", "Friday"),
            CalendarWeekDayModel("25 Sep", "Saturday")
        )

        calendarWeekRecyclerView = findViewById(R.id.calendar_week_recycler_view)
        calendarWeekRecyclerView.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

        calendarWeekRecyclerView.adapter = CalendarWeekViewAdapter(mockList)
    }
}
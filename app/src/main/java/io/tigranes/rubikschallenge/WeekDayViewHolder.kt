package io.tigranes.rubikschallenge

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeekDayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var dateTextView: TextView = itemView.findViewById(R.id.date_text_view)
    private var weekDayTextView: TextView = itemView.findViewById(R.id.week_day_text_view)

    fun bindWeekDayItem(calendarWeekDayModel: CalendarWeekDayModel) {
        dateTextView.text = calendarWeekDayModel.dayAndMonth
        weekDayTextView.text = calendarWeekDayModel.weekDay
    }

}
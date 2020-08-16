package io.tigranes.rubikschallenge

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CalendarWeekViewAdapter(
    private val listOfWeekDays: List<CalendarWeekDayModel>,
    private val calendarWeekDayViewClickListener: CalendarWeekDayViewClickListener
) : RecyclerView.Adapter<WeekDayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekDayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.calendar_week_day_view, parent, false)
        return WeekDayViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfWeekDays.size
    }

    override fun onBindViewHolder(holder: WeekDayViewHolder, position: Int) {
        holder.bindWeekDayItem(listOfWeekDays[position])

        holder.itemView.setOnClickListener {
            calendarWeekDayViewClickListener.clickedOnDay(listOfWeekDays[position])
        }
    }
}
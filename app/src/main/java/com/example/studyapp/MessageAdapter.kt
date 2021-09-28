package com.example.studyapp

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*


class MessageAdapter (val context: Context, val titles: ArrayList<ArrayList<String>>) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {
    class MessageViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemTitle : TextView
        var itemDetail : TextView

        init {
            itemTitle = itemView.findViewById(R.id.subject)
            itemDetail = itemView.findViewById(R.id.content)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout,
            parent,
            false
        )
        return MessageViewHolder(v)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        holder.itemView.apply {
            holder.itemTitle.text = titles[position][0]
            holder.itemDetail.text =titles[position][1]
            card_view.setOnClickListener {  val dialogBuilder = AlertDialog.Builder(context)

                // set message of alert dialog
                dialogBuilder.setMessage(titles[position][2])

                    // positive button text and action
                    .setPositiveButton("OK", DialogInterface.OnClickListener {
                            dialog, id -> dialog.cancel()
                    })


                // create dialog box
                val alert = dialogBuilder.create()
                // set title for alert dialog box
                alert.setTitle(titles[position][0])
                // show alert dialog
                alert.show()
            }

        }
    }

    override fun getItemCount() = titles.size


}
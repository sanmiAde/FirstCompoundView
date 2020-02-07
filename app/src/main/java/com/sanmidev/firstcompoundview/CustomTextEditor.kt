package com.sanmidev.firstcompoundview

import android.content.Context
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.custom_text_editor.view.*

class CustomTextEditor @JvmOverloads
constructor(context: Context, attributeSet: AttributeSet? = null,
            defStyle: Int = 0, defRes: Int = 0)
    : LinearLayout(context, attributeSet, defStyle, defRes){

    init{
        orientation = LinearLayout.HORIZONTAL
        setBackgroundColor(Color.TRANSPARENT)
        val inflater =  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        inflater.inflate(R.layout.custom_text_editor, this)

        input_edit_text.addTextChangedListener(object  : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                checkbox.isChecked = s?.length == 5

            }

        })
    }
}
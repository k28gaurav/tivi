/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.banes.chris.tivi.details.items

import kotlinx.android.synthetic.main.details_rating_item.view.*
import me.banes.chris.tivi.R
import me.banes.chris.tivi.data.entities.TiviShow
import me.banes.chris.tivi.ui.groupieitems.TiviItem
import me.banes.chris.tivi.ui.holders.TiviViewHolder

class RatingItem(private val show: TiviShow) : TiviItem<TiviViewHolder>() {
    override fun getLayout() = R.layout.details_rating_item

    override fun bind(viewHolder: TiviViewHolder, position: Int) {
        viewHolder.itemView.details_rating_label.apply {
            text = show.rating?.let {
                resources.getString(R.string.percentage_format, Math.round(it * 10))
            } ?: "-"
        }
    }

    override fun isClickable() = false

    override fun getSpanSize(spanCount: Int, position: Int) = 1
}
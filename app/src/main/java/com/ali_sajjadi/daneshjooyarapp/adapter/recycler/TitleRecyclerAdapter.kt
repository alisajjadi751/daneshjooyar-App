import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.databinding.TitleRecyclerBinding
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.data.DataTitle

class TitleRecyclerAdapter(
    private val dataTitle: ArrayList<DataTitle>,
    private val context: Context,
    private val itemClickListener: (DataTitle) -> Unit, // Add click listener as a parameter
) : RecyclerView.Adapter<TitleRecyclerAdapter.TitleViewHolder>() {

    private var selectedPosition = RecyclerView.NO_POSITION // پیگیری موقعیت انتخاب شده


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TitleViewHolder(TitleRecyclerBinding.inflate(LayoutInflater.from(context), parent, false))

    override fun getItemCount() = dataTitle.size

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int) {
        holder.setData(dataTitle[position])
    }

    inner class TitleViewHolder(
        private val binding: TitleRecyclerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setData(data: DataTitle) {
            binding.txtTitle.text = data.title
            binding.imgTitle.setImageResource(data.imgTitle)

            if (data.id == selectedPosition) {
                binding.root.setBackgroundResource(R.drawable.back_bottom_recycler_color)
                binding.txtTitle.setTextColor(context.getColor(R.color.white)) // رنگ سفید برای متن
            } else {
                binding.root.setBackgroundResource(R.drawable.back_bottom_recycler)
                binding.txtTitle.setTextColor(context.getColor(R.color.black)) // رنگ مشکی برای متن
            }

            // تنظیم listener برای آیتم
            itemView.setOnClickListener {
                // بررسی این که موقعیت معتبر است
                val previousPosition = selectedPosition
                selectedPosition = adapterPosition

                // Set the click listener for the item

                itemClickListener(data)


                notifyItemChanged(previousPosition)
                notifyItemChanged(selectedPosition)
            }

        }

    }

    fun setSelectedPosition(position: Int) {
        val previousPosition = selectedPosition
        selectedPosition = position
        notifyItemChanged(previousPosition)
        notifyItemChanged(selectedPosition)
    }
}

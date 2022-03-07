import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.model.Affirmation
import com.example.recycleview_sample.R

// MainActivity]の[RecyclerView]用アダプタ Affirmation]データオブジェクトを表示
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // 各データ項目に対応するビューへの参照を提供
    // 複雑なデータ項目には、項目ごとに複数のビューが必要な場合があり
    // ビューホルダーでデータアイテムのすべてのビューにアクセスできるようにする
    // 各データ項目は単なる Affirmation オブジェクトである
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // 新規ビューの作成（レイアウトマネージャから呼び出される）
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // データセットのサイズを返す（レイアウトマネージャによって起動される）
    override fun getItemCount() = dataset.size


    //  ビューの内容を置き換える（レイアウトマネージャから呼び出される）
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
}
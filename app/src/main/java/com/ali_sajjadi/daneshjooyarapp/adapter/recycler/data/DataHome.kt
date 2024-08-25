import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataHome(
    val id: Int,
    val imageResId: Int,
    val title: String,
    val demoVideo: DataDemoVideo,
    val videos: List<DataListVideo>, // لیست ویدیوها
    val info : List<DataInfo>
) : Parcelable

@Parcelize
data class DataListVideo(
    val id: Int,
    val title: String,
    val img: Int, // آدرس یا لینک ویدیو
    val video: DataCourseVideo
) : Parcelable

@Parcelize
data class DataInfo(
    val img:Int,
    val title11: String,
    val title12: String,
    val title21: String,
    val title22: String,
    val title31: String,
    val title32: String,
    val title41: String,
    val title42: String
): Parcelable

@Parcelize
data class DataDemoVideo(
    val demoVideo:Uri
): Parcelable

@Parcelize
data class DataCourseVideo(
    val courseVideo:Uri
):Parcelable


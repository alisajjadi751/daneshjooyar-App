import androidx.fragment.app.Fragment

class ModelListCoursesFragment(
    private val fragment: Fragment
) {

    fun dataList(): ArrayList<DataHome>? {
        return fragment.arguments?.getParcelableArrayList("dataList")
    }

}
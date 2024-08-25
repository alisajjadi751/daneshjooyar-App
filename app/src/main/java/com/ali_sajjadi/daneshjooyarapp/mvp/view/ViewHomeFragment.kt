package com.ali_sajjadi.daneshjooyarapp.mvp.view

import DataCourseVideo
import DataDemoVideo
import DataHome
import DataInfo
import DataListVideo
import TitleRecyclerAdapter
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ali_sajjadi.daneshjooyarapp.R
import com.ali_sajjadi.daneshjooyarapp.adapter.recycler.data.DataTitle
import com.ali_sajjadi.daneshjooyarapp.databinding.FragmentHomeBinding
import com.ali_sajjadi.daneshjooyarapp.ui.fragment.ListCoursesFragment

class ViewHomeFragment(
    private val context: Context
) {

    val binding = FragmentHomeBinding.inflate(LayoutInflater.from(context))

    private val dataTitle = arrayListOf(
        DataTitle(0, "برنامه نویسی موبایل", R.drawable.ic_title1),
        DataTitle(1, "طراحی سایت", R.drawable.ic_title1),
        DataTitle(2, "هوش مصنوعی", R.drawable.ic_title1),
        DataTitle(3, "گیت هاب", R.drawable.ic_title1),
        DataTitle(4, "برنامه نویسی پایتون", R.drawable.ic_title1)
    )

    private val dataMobile = arrayListOf(

        DataHome(
            0,
            R.drawable.img_android,
            "برنامه نویسی اندروید به زبان کاتلین از صفر تا صد",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(
                DataListVideo(
                    0,
                    "مقدمه‌ای بر برنامه‌نویسی اندروید",
                    R.drawable.img_android,
                    DataCourseVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.morur}"))
                ),
                DataListVideo(
                    1,
                    "آموزش نصب Android Studio",
                    R.drawable.img_android,
                    DataCourseVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}"))
                ),
                DataListVideo(
                    2,
                    "اولین برنامه اندروید",
                    R.drawable.img_android,
                    DataCourseVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}"))
                ),
                DataListVideo(
                    3,
                    "معرفی Layoutها در اندروید",
                    R.drawable.img_android,
                    DataCourseVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}"))
                )
            ),
            listOf(
                DataInfo(
                    R.drawable.img_back_info,
                    "4.5 از 5",
                    "امتیاز دانشجویان",
                    "57,703",
                    "تعداد دانشجویان",
                    "697 ساعت",
                    "ساعت آموزش",
                    "26 عدد",
                    "تعداد دوره"
                )
            )
        ),
        DataHome(
            1,
            R.drawable.img_kotlin,
            "دوره رایگان آموزش کاتلین 2024 (ورود به برنامه نویسی موبایل) بهمراه جزوه pdf",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf
                (
                DataListVideo(
                    0,
                    "مقدمه‌ای بر برنامه‌نویسی اندروید",
                    R.drawable.img_tarahi,
                    DataCourseVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}"))
                )
            ),
            listOf()
        ),

        DataHome(
            2, R.drawable.img_amniat, "دوره آموزش امنیت اندروید",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),

        DataHome(
            3, R.drawable.img_jetpack, "کامل ترین آموزش جت پک کامپوز برای طراحی UI در اندروید",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),

        DataHome(
            4,
            R.drawable.img_android_studio,
            "آموزش اندروید استودیو رایگان به همراه تحلیل پروژه واقعی",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        )
    )

    private val dataTarahi = arrayListOf(
        DataHome(
            0, R.drawable.img_tarahi, "دوره جامع طراحی سایت با PHP(مقدماتی تا پیشرفته)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            1, R.drawable.img_tarahi, "دوره جامع طراحی سایت با PHP(مقدماتی تا پیشرفته)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            2, R.drawable.img_tarahi, "دوره جامع طراحی سایت با PHP(مقدماتی تا پیشرفته)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            3, R.drawable.img_tarahi, "دوره جامع طراحی سایت با PHP(مقدماتی تا پیشرفته)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            4, R.drawable.img_tarahi, "دوره جامع طراحی سایت با PHP(مقدماتی تا پیشرفته)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
    )

    private val dataAI = arrayListOf(
        DataHome(
            0, R.drawable.img_ai, "آموزش هوش مصنوعی [مفاهیم مناسب برای شروع Ai✅]",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            1, R.drawable.img_ai, "آموزش هوش مصنوعی [مفاهیم مناسب برای شروع Ai✅]",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            2, R.drawable.img_ai, "آموزش هوش مصنوعی [مفاهیم مناسب برای شروع Ai✅]",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            3, R.drawable.img_ai, "آموزش هوش مصنوعی [مفاهیم مناسب برای شروع Ai✅]",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            4, R.drawable.img_ai, "آموزش هوش مصنوعی [مفاهیم مناسب برای شروع Ai✅]",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
    )

    private val dataGit = arrayListOf(
        DataHome(
            0, R.drawable.img_git, "دوره آموزش Git و GitHub جامع با نسخه 2024",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            1, R.drawable.img_git, "دوره آموزش Git و GitHub جامع با نسخه 2024",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            2, R.drawable.img_git, "دوره آموزش Git و GitHub جامع با نسخه 2024",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            3, R.drawable.img_git, "دوره آموزش Git و GitHub جامع با نسخه 2024",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            4, R.drawable.img_git, "دوره آموزش Git و GitHub جامع با نسخه 2024",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
    )

    private val dataPython = arrayListOf(
        DataHome(
            0,
            R.drawable.img_python,
            " دوره مسترکدر پایتون (۴۵ ساعت آموزش پایتون جامع در کاربردی ترین دوره ی فارسی)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            1,
            R.drawable.img_python,
            " دوره مسترکدر پایتون (۴۵ ساعت آموزش پایتون جامع در کاربردی ترین دوره ی فارسی)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            2,
            R.drawable.img_python,
            " دوره مسترکدر پایتون (۴۵ ساعت آموزش پایتون جامع در کاربردی ترین دوره ی فارسی)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            3,
            R.drawable.img_python,
            " دوره مسترکدر پایتون (۴۵ ساعت آموزش پایتون جامع در کاربردی ترین دوره ی فارسی)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
        DataHome(
            4,
            R.drawable.img_python,
            " دوره مسترکدر پایتون (۴۵ ساعت آموزش پایتون جامع در کاربردی ترین دوره ی فارسی)",
            DataDemoVideo(Uri.parse("android.resource://${context.packageName}/${R.raw.hamim}")),
            listOf(), listOf()
        ),
    )

    private fun setCourse(id: Int) {
        val bundle = Bundle()
        when (id) {
            0 -> {
                bundle.putParcelableArrayList("dataList", ArrayList(dataMobile))
            }

            1 -> {
                bundle.putParcelableArrayList("dataList", ArrayList(dataTarahi))
            }

            2 -> {
                bundle.putParcelableArrayList("dataList", ArrayList(dataAI))
            }

            3 -> {
                bundle.putParcelableArrayList("dataList", ArrayList(dataGit))
            }

            4 -> {
                bundle.putParcelableArrayList("dataList", ArrayList(dataPython))
            }
        }
        val coursesFragment =
            ListCoursesFragment.newInstance(dataList = ArrayList(dataMobile)).apply {
                arguments = bundle
            }


        // جابجایی به فرگمنت CoursesFragment
        val fragmentManager = (context as AppCompatActivity).supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.frameLayout, coursesFragment)

            .commit()
    }

    fun setTitleRecycler() {
        binding.recyclerViewTitle.layoutManager =
            LinearLayoutManager(context, RecyclerView.HORIZONTAL, true)

        val adapter = TitleRecyclerAdapter(dataTitle, context) { dataTitle ->
            setCourse(dataTitle.id)
        }

        binding.recyclerViewTitle.adapter = adapter

        // انتخاب آیتم پیش‌فرض
        adapter.setSelectedPosition(0)  // انتخاب آیتم اول
        setCourse(dataTitle[0].id)  // نمایش محتوای آیتم اول

        // جابجایی اسکرول به آیتم اول
        binding.recyclerViewTitle.scrollToPosition(0)
    }


}

package net.kathir.koinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import net.kathir.koinapp.data.model.ImageModel
import net.kathir.koinapp.databinding.ActivityMainBinding
import net.kathir.koinapp.view.adapter.ImagesAdapter
import net.kathir.koinapp.viewmodel.MainActivityViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainActivityViewModel by viewModel()
    private val adapter = ImagesAdapter()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        )

        configureViewModel()
        configureViews()

        mainViewModel.getImages()
    }

    private fun configureViewModel() {
        mainViewModel.imageResponseLiveData.observe(
                this,
                Observer { onImagesReceived(it.images) })
    }

    private fun configureViews() {
        binding.lifecycleOwner = this

        binding.imagesRecyclerView.adapter = adapter
    }

    private fun onImagesReceived(imageList: ArrayList<ImageModel>) {
        imageList.let {
            Log.d("ARRARY_SIE ","ARRARY_SIE "+ it.size)
            adapter.setData(it)
        }
    }
}

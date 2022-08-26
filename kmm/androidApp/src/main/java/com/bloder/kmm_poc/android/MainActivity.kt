package com.bloder.kmm_poc.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bloder.kmm_poc.presentation.animelist.TopItemsViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: TopItemsViewModel by viewModel()
    private val tv: TextView by lazy { findViewById(R.id.text_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeAiringAnimes()
        fetchAiringAnimes()
    }

    private fun observeAiringAnimes() = lifecycleScope.launch {
        viewModel.airingAnimes.collect {
            tv.text = if (it.isEmpty()) "Loading..." else it.map { item -> item.title }.reduce { acc, topItem -> "$acc $topItem" }
        }
    }

    private fun fetchAiringAnimes() = lifecycleScope.launch {
        viewModel.fetchAiringAnimes()
    }
}

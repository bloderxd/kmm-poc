package com.bloder.kmm_poc.android

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
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

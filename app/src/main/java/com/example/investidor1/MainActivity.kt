package com.example.investidor1

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.app.ActivityCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.investidor1.ui.view.InvestidorScreen
import com.example.investidor1.viewmodel.InvestimentosViewModel
import android.Manifest
import com.example.investidor1.ui.theme.Investidor1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                101
            )
        }

        setContent {
            Investidor1Theme {
                val viewModel: InvestimentosViewModel = viewModel()
                InvestidorScreen(viewModel)
            }

        }
    }
}
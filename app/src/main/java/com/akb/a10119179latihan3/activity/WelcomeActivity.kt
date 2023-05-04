package com.akb.a10119179latihan3.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akb.a10119179latihan3.IntentID.ID_EXTRA_MSG_EXIT
import com.akb.a10119179latihan3.databinding.ActivityWelcomeBinding

//<!--Muhamad Bagus Prakoso-10119179-IF6-->

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intentToLoginCode()
        allActivityFinish()
    }

    private fun allActivityFinish() {
        if (intent.getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish()
        }
    }

    private fun intentToLoginCode() {
        binding.apply {
            btnWalkthroughStart.setOnClickListener {
                val intent = Intent(this@WelcomeActivity, LoginCodeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
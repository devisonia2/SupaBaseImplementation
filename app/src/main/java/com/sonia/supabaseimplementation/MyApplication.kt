package com.sonia.supabaseimplementation

import android.app.Application
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.status.SessionSource
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.storage.Storage
import io.github.jan.supabase.storage.storage

class MyApplication: Application() {
    lateinit var supabaseClient: SupabaseClient

    override fun onCreate() {
        super.onCreate()
        supabaseClient = createSupabaseClient(
            "https://wqzmywcsklmwtcspoccb.supabase.co",
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Indxem15d2Nza2xtd3Rjc3BvY2NiIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ1OTk1MDMsImV4cCI6MjA1MDE3NTUwM30.u5_xHMn5sWGH0K0EwD-C-1pLbFC4Oz0yGG6gK2jYbqw"
        ){
            install(Storage)
        }

        val bucket = supabaseClient.storage.from("test_bucket")
    }
}
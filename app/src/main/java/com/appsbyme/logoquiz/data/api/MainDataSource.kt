package com.appsbyme.logoquiz.data.api

import android.app.Application
import com.appsbyme.logoquiz.data.api.MainApi

class MainDataSource(
		private val mainApi: MainApi,
		private val application: Application
) {
	/**
		private var mSomeData: MediatorLiveData<Resource<ArrayList<SomeModel>>>? = null
	    	fun someTest(): MediatorLiveData<Resource<ArrayList<SomeModel>>> {
		mSomeData = MediatorLiveData()
		mSomeData?.value = Resource.loading(null)

		mainApi.someTest(mSomeQuery).enqueue(object :
		    Callback<JsonObject> {
		    override fun onFailure(call: Call<JsonObject>, t: Throwable) {}

		    override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
		        if (response.isSuccessful && response.body() != null) {
		            val mJSONObject = JSONObject(response.body().toString())

		            try {} catch (e: Exception) {
		                e.printStackTrace()
		            }
		        } else {}
		    }

		})

		return mSomeData!!
	    	}
	*/
}

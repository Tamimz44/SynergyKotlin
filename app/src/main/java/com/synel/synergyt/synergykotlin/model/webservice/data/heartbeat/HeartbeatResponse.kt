package com.synel.synergyt.synergykotlin.model.webservice.data.heartbeat

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.synel.synergyt.synergykotlin.model.webservice.base.BaseResponseBody
import com.synel.synergyt.synergykotlin.model.webservice.data.WSCMD
import com.synel.synergyt.synergykotlin.model.webservice.data.syncemployees.SyncEmployeesResponse

data class HeartbeatResponse(
    override val cmd: Boolean,
    override val commands: List<HeartBeatCommand>
) : BaseResponseBody() {
    override val type = WSCMD.UNKNOWN

    companion object {
        fun fromJson(json: String): HeartbeatResponse {
            return Gson().fromJson(json, HeartbeatResponse::class.java)
        }
    }

    fun toJson(): String {
        return Gson().toJson(this)
    }
}
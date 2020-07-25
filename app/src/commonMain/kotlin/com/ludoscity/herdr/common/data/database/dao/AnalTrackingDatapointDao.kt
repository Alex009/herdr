package com.ludoscity.herdr.common.data.database.dao

import com.ludoscity.herdr.common.data.AnalTrackingDatapoint
import com.ludoscity.herdr.common.data.database.HerdrDatabase


class AnalTrackingDatapointDao(database: HerdrDatabase) {

    private val db = database.analTrackingDatapointQueries

    internal fun insert(item: AnalTrackingDatapoint) {
        db.insertOrReplace(item)
    }

    internal fun updateUploadCompleted(id: Long) {
        db.updateUploadCompleted(id)
    }

    internal fun delete(analTrackingDatapoint: AnalTrackingDatapoint) {
        db.deleteById(analTrackingDatapoint.id)
    }

    internal fun select(): List<AnalTrackingDatapoint> = db.selectAll().executeAsList()
}
/*
 *     Copyright (c) 2020. f8full https://github.com/f8full
 *     Herdr is a privacy conscious multiplatform mobile data collector
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ludoscity.herdr.common.domain.usecase.analytics

import com.ludoscity.herdr.common.Platform
import com.ludoscity.herdr.common.data.AnalTrackingDatapoint
import com.ludoscity.herdr.common.domain.usecase.base.BaseUseCaseInput

class SaveAnalyticsDatapointUseCaseInput(
        batteryChargePercentage: Long? = null,
        description: String

) :
    BaseUseCaseInput {
    val toSave: AnalTrackingDatapoint = AnalTrackingDatapoint(
            -1,
            Platform.now,
            Platform.app_version,
            Platform.api_level,
            Platform.device_model,
            Platform.language,
            Platform.country,
            batteryChargePercentage,
            description,
            0L,
            Platform.nowString
    )

    override fun validate(): Boolean {
        return true
    }
}
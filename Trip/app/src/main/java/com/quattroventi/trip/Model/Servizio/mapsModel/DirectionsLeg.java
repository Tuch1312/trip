/*
 * Copyright 2014 Google Inc. All rights reserved.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.quattroventi.trip.Model.Servizio.mapsModel;


import java.io.Serializable;
import java.util.Date;

/**
 * A component of a Directions API result.
 *
 * <p>See <a href="https://developers.google.com/maps/documentation/directions/intro#Legs">the Legs
 * documentation</a> for more detail.
 */
public class DirectionsLeg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Contains an array of steps denoting information about each separate step of this leg of the
     * journey.
     */
    public DirectionsStep[] steps;

    /**
     * The total distance covered by this leg.
     */
    public Distance distance;

    /**
     * The total duration of this leg.
     */
    public Duration duration;

    /**
     * The total duration of this leg, taking into account current traffic conditions. The duration in
     * traffic will only be returned if all of the following are true:
     *
     * <ol>
     * <li>The directions request includes a departureTime parameter set to a value within a few
     * minutes of the current time.
     * <li>The request includes a valid Maps for Work client and signature parameter.
     * <li>Traffic conditions are available for the requested route.
     * <li>The directions request does not include stopover waypoints.
     * </ol>
     */
    public Duration duration_in_traffic;

    /**
     * The estimated time of arrival for this leg. This property is only returned for transit
     * directions.
     */
    public Date arrival_time;

    /**
     * The estimated time of departure for this leg. The departureTime is only available for transit
     * directions.
     */
    public Date departure_time;

    /**
     * The latitude/longitude coordinates of the origin of this leg. Because the Directions API
     * calculates directions between locations by using the nearest transportation option (usually a
     * road) at the start and end points, startLocation may be different from the provided origin of
     * this leg if, for example, a road is not near the origin.
     */
    public LatLng start_location;

    /**
     * The latitude/longitude coordinates of the given destination of this leg. Because the Directions
     * API calculates directions between locations by using the nearest transportation option (usually
     * a road) at the start and end points, endLocation may be different than the provided destination
     * of this leg if, for example, a road is not near the destination.
     */
    public LatLng end_location;

    /**
     * The human-readable address (typically a street address) reflecting the start location of this
     * leg.
     */
    public String start_address;

    /**
     * The human-readable address (typically a street address) reflecting the end location of this
     * leg.
     */
    public String end_address;

    public String toString() {
        StringBuilder sb =
                new StringBuilder(
                        String.format(
                                "[Directions_leg: \"%s\" -> \"%s\" (%s -> %s)",
                                start_address, end_address, start_location, end_location));
        if (departure_time != null) {
            sb.append(", departure_time=").append(departure_time);
        }
        if (arrival_time != null) {
            sb.append(", arrival_time=").append(arrival_time);
        }
        if (duration_in_traffic != null) {
            sb.append(", duration_in_traffic=").append(duration_in_traffic);
        }
        sb.append(", duration=").append(duration);
        sb.append(", distance=").append(distance);
        sb.append(": ").append(steps.length).append(" steps]");
        return sb.toString();
    }
}

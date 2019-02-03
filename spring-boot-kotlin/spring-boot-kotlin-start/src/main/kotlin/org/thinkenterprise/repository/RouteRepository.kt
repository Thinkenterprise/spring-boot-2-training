package org.thinkenterprise.repository

import org.springframework.data.repository.CrudRepository
import org.thinkenterprise.domain.Route

interface RouteRepository : CrudRepository<Route, Long> {

	fun findByDeparture(departure: String): Iterable<Route>

}
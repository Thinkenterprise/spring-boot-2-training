package org.thinkenterprise.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.annotation.Generated

@Entity 
data class Route (@Id @Generated val id: Long, val departure: String) {
	 private constructor(): this(0, "")
}
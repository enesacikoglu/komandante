package com.hasanozgan.komandante.eventstore.exposed.dao

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import java.util.*

class Event(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object : UUIDEntityClass<Event>(Events)

    var canonicalName by Events.canonicalName
    var values by Events.values
    var publishedOn = Events.publishedOn
    var version = Events.version
    var aggregateID = Events.aggregateID
}
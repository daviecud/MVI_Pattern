package com.dwc.mvi_pattern.util

interface EntityMapper<Entity, DomainModel> {
    fun mapFromEntity(entity: Entity): DomainModel //map to DomainModel
    fun mapToEntity(domainModel: DomainModel): Entity //map away from DomainModel
}
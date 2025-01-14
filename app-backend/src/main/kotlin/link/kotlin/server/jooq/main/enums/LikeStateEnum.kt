/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.enums


import link.kotlin.server.jooq.main.Public

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class LikeStateEnum(@get:JvmName("literal") public val literal: String) : EnumType {
    LIKE("LIKE"),
    DISLIKE("DISLIKE"),
    NEUTRAL("NEUTRAL");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "like_state_enum"
    override fun getLiteral(): String = literal
}

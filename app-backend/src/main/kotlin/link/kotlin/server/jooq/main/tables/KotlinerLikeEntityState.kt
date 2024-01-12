/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.OffsetDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.enums.LikeStateEnum
import link.kotlin.server.jooq.main.keys.KOTLINER_LIKE_ENTITY_STATE_PKEY
import link.kotlin.server.jooq.main.keys.KOTLINER_LIKE_ENTITY_STATE__KOTLINER_LIKE_ENTITY_STATE_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.tables.Kotliner.KotlinerPath
import link.kotlin.server.jooq.main.tables.records.KotlinerLikeEntityStateRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerLikeEntityState(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, KotlinerLikeEntityStateRecord>?,
    parentPath: InverseForeignKey<out Record, KotlinerLikeEntityStateRecord>?,
    aliased: Table<KotlinerLikeEntityStateRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<KotlinerLikeEntityStateRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of
         * <code>public.kotliner_like_entity_state</code>
         */
        val KOTLINER_LIKE_ENTITY_STATE: KotlinerLikeEntityState = KotlinerLikeEntityState()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KotlinerLikeEntityStateRecord> = KotlinerLikeEntityStateRecord::class.java

    /**
     * The column <code>public.kotliner_like_entity_state.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<KotlinerLikeEntityStateRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_like_entity_state.entity_id</code>.
     */
    val ENTITY_ID: TableField<KotlinerLikeEntityStateRecord, Long?> = createField(DSL.name("entity_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_like_entity_state.like_state</code>.
     */
    val LIKE_STATE: TableField<KotlinerLikeEntityStateRecord, LikeStateEnum?> = createField(DSL.name("like_state"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(LikeStateEnum::class.java), this, "")

    /**
     * The column <code>public.kotliner_like_entity_state.adjustment</code>.
     */
    val ADJUSTMENT: TableField<KotlinerLikeEntityStateRecord, Int?> = createField(DSL.name("adjustment"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.kotliner_like_entity_state.created</code>.
     */
    val CREATED: TableField<KotlinerLikeEntityStateRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.kotliner_like_entity_state.updated</code>.
     */
    val UPDATED: TableField<KotlinerLikeEntityStateRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<KotlinerLikeEntityStateRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<KotlinerLikeEntityStateRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<KotlinerLikeEntityStateRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.kotliner_like_entity_state</code> table
     * reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kotliner_like_entity_state</code> table
     * reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kotliner_like_entity_state</code> table reference
     */
    constructor(): this(DSL.name("kotliner_like_entity_state"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, KotlinerLikeEntityStateRecord>?, parentPath: InverseForeignKey<out Record, KotlinerLikeEntityStateRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, KOTLINER_LIKE_ENTITY_STATE, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class KotlinerLikeEntityStatePath : KotlinerLikeEntityState, Path<KotlinerLikeEntityStateRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, KotlinerLikeEntityStateRecord>?, parentPath: InverseForeignKey<out Record, KotlinerLikeEntityStateRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<KotlinerLikeEntityStateRecord>): super(alias, aliased)
        override fun `as`(alias: String): KotlinerLikeEntityStatePath = KotlinerLikeEntityStatePath(DSL.name(alias), this)
        override fun `as`(alias: Name): KotlinerLikeEntityStatePath = KotlinerLikeEntityStatePath(alias, this)
        override fun `as`(alias: Table<*>): KotlinerLikeEntityStatePath = KotlinerLikeEntityStatePath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<KotlinerLikeEntityStateRecord> = KOTLINER_LIKE_ENTITY_STATE_PKEY
    override fun getReferences(): List<ForeignKey<KotlinerLikeEntityStateRecord, *>> = listOf(KOTLINER_LIKE_ENTITY_STATE__KOTLINER_LIKE_ENTITY_STATE_KOTLINER_ID_FKEY)

    private lateinit var _kotliner: KotlinerPath

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): KotlinerPath {
        if (!this::_kotliner.isInitialized)
            _kotliner = KotlinerPath(this, KOTLINER_LIKE_ENTITY_STATE__KOTLINER_LIKE_ENTITY_STATE_KOTLINER_ID_FKEY, null)

        return _kotliner;
    }

    val kotliner: KotlinerPath
        get(): KotlinerPath = kotliner()
    override fun `as`(alias: String): KotlinerLikeEntityState = KotlinerLikeEntityState(DSL.name(alias), this)
    override fun `as`(alias: Name): KotlinerLikeEntityState = KotlinerLikeEntityState(alias, this)
    override fun `as`(alias: Table<*>): KotlinerLikeEntityState = KotlinerLikeEntityState(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): KotlinerLikeEntityState = KotlinerLikeEntityState(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): KotlinerLikeEntityState = KotlinerLikeEntityState(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): KotlinerLikeEntityState = KotlinerLikeEntityState(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): KotlinerLikeEntityState = KotlinerLikeEntityState(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): KotlinerLikeEntityState = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): KotlinerLikeEntityState = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): KotlinerLikeEntityState = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): KotlinerLikeEntityState = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): KotlinerLikeEntityState = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): KotlinerLikeEntityState = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): KotlinerLikeEntityState = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): KotlinerLikeEntityState = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): KotlinerLikeEntityState = where(DSL.notExists(select))
}
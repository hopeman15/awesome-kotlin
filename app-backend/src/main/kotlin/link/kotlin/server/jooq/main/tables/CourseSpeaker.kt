/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.COURSE_SPEAKER_PKEY
import link.kotlin.server.jooq.main.keys.COURSE_SPEAKER__COURSE_SPEAKER_COURSE_ID_FKEY
import link.kotlin.server.jooq.main.keys.COURSE_SPEAKER__COURSE_SPEAKER_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.tables.Course.CoursePath
import link.kotlin.server.jooq.main.tables.Kotliner.KotlinerPath
import link.kotlin.server.jooq.main.tables.records.CourseSpeakerRecord

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
open class CourseSpeaker(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CourseSpeakerRecord>?,
    parentPath: InverseForeignKey<out Record, CourseSpeakerRecord>?,
    aliased: Table<CourseSpeakerRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CourseSpeakerRecord>(
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
         * The reference instance of <code>public.course_speaker</code>
         */
        val COURSE_SPEAKER: CourseSpeaker = CourseSpeaker()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CourseSpeakerRecord> = CourseSpeakerRecord::class.java

    /**
     * The column <code>public.course_speaker.course_id</code>.
     */
    val COURSE_ID: TableField<CourseSpeakerRecord, Long?> = createField(DSL.name("course_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.course_speaker.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<CourseSpeakerRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CourseSpeakerRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CourseSpeakerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CourseSpeakerRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.course_speaker</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.course_speaker</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.course_speaker</code> table reference
     */
    constructor(): this(DSL.name("course_speaker"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CourseSpeakerRecord>?, parentPath: InverseForeignKey<out Record, CourseSpeakerRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, COURSE_SPEAKER, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class CourseSpeakerPath : CourseSpeaker, Path<CourseSpeakerRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CourseSpeakerRecord>?, parentPath: InverseForeignKey<out Record, CourseSpeakerRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<CourseSpeakerRecord>): super(alias, aliased)
        override fun `as`(alias: String): CourseSpeakerPath = CourseSpeakerPath(DSL.name(alias), this)
        override fun `as`(alias: Name): CourseSpeakerPath = CourseSpeakerPath(alias, this)
        override fun `as`(alias: Table<*>): CourseSpeakerPath = CourseSpeakerPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<CourseSpeakerRecord> = COURSE_SPEAKER_PKEY
    override fun getReferences(): List<ForeignKey<CourseSpeakerRecord, *>> = listOf(COURSE_SPEAKER__COURSE_SPEAKER_COURSE_ID_FKEY, COURSE_SPEAKER__COURSE_SPEAKER_KOTLINER_ID_FKEY)

    private lateinit var _course: CoursePath

    /**
     * Get the implicit join path to the <code>public.course</code> table.
     */
    fun course(): CoursePath {
        if (!this::_course.isInitialized)
            _course = CoursePath(this, COURSE_SPEAKER__COURSE_SPEAKER_COURSE_ID_FKEY, null)

        return _course;
    }

    val course: CoursePath
        get(): CoursePath = course()

    private lateinit var _kotliner: KotlinerPath

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): KotlinerPath {
        if (!this::_kotliner.isInitialized)
            _kotliner = KotlinerPath(this, COURSE_SPEAKER__COURSE_SPEAKER_KOTLINER_ID_FKEY, null)

        return _kotliner;
    }

    val kotliner: KotlinerPath
        get(): KotlinerPath = kotliner()
    override fun `as`(alias: String): CourseSpeaker = CourseSpeaker(DSL.name(alias), this)
    override fun `as`(alias: Name): CourseSpeaker = CourseSpeaker(alias, this)
    override fun `as`(alias: Table<*>): CourseSpeaker = CourseSpeaker(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CourseSpeaker = CourseSpeaker(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CourseSpeaker = CourseSpeaker(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CourseSpeaker = CourseSpeaker(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): CourseSpeaker = CourseSpeaker(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): CourseSpeaker = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): CourseSpeaker = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): CourseSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): CourseSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): CourseSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): CourseSpeaker = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): CourseSpeaker = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): CourseSpeaker = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): CourseSpeaker = where(DSL.notExists(select))
}

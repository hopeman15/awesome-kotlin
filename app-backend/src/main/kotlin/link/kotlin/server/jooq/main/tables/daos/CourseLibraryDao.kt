/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.daos


import kotlin.collections.List

import link.kotlin.server.jooq.main.tables.CourseLibrary
import link.kotlin.server.jooq.main.tables.records.CourseLibraryRecord

import org.jooq.Configuration
import org.jooq.Record2
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CourseLibraryDao(configuration: Configuration?) : DAOImpl<CourseLibraryRecord, link.kotlin.server.jooq.main.tables.pojos.CourseLibrary, Record2<Long?, Long?>>(CourseLibrary.COURSE_LIBRARY, link.kotlin.server.jooq.main.tables.pojos.CourseLibrary::class.java, configuration) {

    /**
     * Create a new CourseLibraryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: link.kotlin.server.jooq.main.tables.pojos.CourseLibrary): Record2<Long?, Long?> = compositeKeyRecord(o.courseId, o.libraryId)

    /**
     * Fetch records that have <code>course_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfCourseId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.CourseLibrary> = fetchRange(CourseLibrary.COURSE_LIBRARY.COURSE_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>course_id IN (values)</code>
     */
    fun fetchByCourseId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.CourseLibrary> = fetch(CourseLibrary.COURSE_LIBRARY.COURSE_ID, *values.toTypedArray())

    /**
     * Fetch records that have <code>library_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfLibraryId(lowerInclusive: Long?, upperInclusive: Long?): List<link.kotlin.server.jooq.main.tables.pojos.CourseLibrary> = fetchRange(CourseLibrary.COURSE_LIBRARY.LIBRARY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>library_id IN (values)</code>
     */
    fun fetchByLibraryId(vararg values: Long): List<link.kotlin.server.jooq.main.tables.pojos.CourseLibrary> = fetch(CourseLibrary.COURSE_LIBRARY.LIBRARY_ID, *values.toTypedArray())
}

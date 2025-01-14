/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Company(
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var url: String? = null,
    var logo: String? = null,
    var version: Long? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Company = other as Company
        if (this.id == null) {
            if (o.id != null)
                return false
        }
        else if (this.id != o.id)
            return false
        if (this.name == null) {
            if (o.name != null)
                return false
        }
        else if (this.name != o.name)
            return false
        if (this.description == null) {
            if (o.description != null)
                return false
        }
        else if (this.description != o.description)
            return false
        if (this.url == null) {
            if (o.url != null)
                return false
        }
        else if (this.url != o.url)
            return false
        if (this.logo == null) {
            if (o.logo != null)
                return false
        }
        else if (this.logo != o.logo)
            return false
        if (this.version == null) {
            if (o.version != null)
                return false
        }
        else if (this.version != o.version)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.id == null) 0 else this.id.hashCode())
        result = prime * result + (if (this.name == null) 0 else this.name.hashCode())
        result = prime * result + (if (this.description == null) 0 else this.description.hashCode())
        result = prime * result + (if (this.url == null) 0 else this.url.hashCode())
        result = prime * result + (if (this.logo == null) 0 else this.logo.hashCode())
        result = prime * result + (if (this.version == null) 0 else this.version.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Company (")

        sb.append(id)
        sb.append(", ").append(name)
        sb.append(", ").append(description)
        sb.append(", ").append(url)
        sb.append(", ").append(logo)
        sb.append(", ").append(version)

        sb.append(")")
        return sb.toString()
    }
}

package isel.ps.eduwikimobile.domain.single

import android.os.Parcel
import android.os.Parcelable

data class Course (
        val courseId: Int = 0,
        val version: Int = 0,
        val createdBy: String = "",
        val fullName: String = "",
        val shortName: String = "",
        val votes: Int = 0,
        val timestamp: String = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(courseId)
        parcel.writeInt(version)
        parcel.writeString(createdBy)
        parcel.writeString(fullName)
        parcel.writeString(shortName)
        parcel.writeInt(votes)
        parcel.writeString(timestamp)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Course> {
        override fun createFromParcel(parcel: Parcel): Course {
            return Course(parcel)
        }

        override fun newArray(size: Int): Array<Course?> {
            return arrayOfNulls(size)
        }
    }

    override fun toString(): String {
        return "course"
    }

}


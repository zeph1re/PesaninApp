import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pesanin.data.vehicle.Vehicle
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity(tableName = "motor")
data class Motorbike (
    @ColumnInfo(name = "motor_id")
    @PrimaryKey(autoGenerate = true)
    override val id: Int,
    override val vehicleName: String,
    override val quantity: Int,
    override val releaseYear: Date,
    override val color: String,
    override val price: Long,
    val engine : String,
    val suspensionType : String,
    val transmisionType : String
) : Vehicle(id, vehicleName, releaseYear, quantity, color, price) , Parcelable




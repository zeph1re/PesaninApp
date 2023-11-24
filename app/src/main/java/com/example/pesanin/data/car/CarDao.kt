import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.pesanin.data.car.Car
import kotlinx.coroutines.flow.Flow

interface CarDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCar (car: Car)

    @Update
    suspend fun updateCar (quantity: Int)

    @Delete
    suspend fun deleteCar (car : Car)

    @Query("SELECT * FROM car")
    fun getAllCar () : List<Car>

    @Query("SELECT * FROM car where car_id = :id")
    fun getCar (id : Int) : Flow<Car>
}
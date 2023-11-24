# PesaninApp

## Tech Stack

Kotlin
Room Database

## Feature

1. Melihat Stock Kendaraan
2. Penjualan Kendaraan
3. Laporan Penjualan per Kendaraan

How do I setup the Project

1. Set Up Models (Car, Motorbike, and Selling)'

Make Vehicle Open class for Car and Motorbike
```kotlin
open class Vehicle (
    open val id: Int,
    open val vehicleName : String,
    open val releaseYear : Date,
    open val quantity : Int,
    open val color : String,
    open val price : Long
)
```

```kotlin
@Parcelize
@Entity (tableName = "car")
data class Car (
    @ColumnInfo(name = "car_id")
    @PrimaryKey(autoGenerate = true)
    override val id: Int,
    override val vehicleName: String,
    override val quantity: Int,
    override val releaseYear: Date,
    override val color: String,
    override val price: Long,
    val engine : String,
    val capacity : Int,
    val type : String
) : Vehicle(id, vehicleName, releaseYear, quantity, color, price) , Parcelable
```

```kotlin
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
```

```kotlin
@Entity(tableName = "selling")
data class Selling(
    @ColumnInfo(name = "selling_id")
    @PrimaryKey val id : Int,
    val vehicleId : Int
)
```

2. Make Car Dao, Motor Dao, and Selling Dao


```kotlin 
@Dao
interface CarDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCar (car: Car)

    @Update
    suspend fun updateCar (car: Car)

    @Delete
    suspend fun deleteCar (car : Car)

    @Query("SELECT * FROM car")
    fun getAllCar () : Flow<List<Car>>

    @Query("SELECT * FROM car where car_id = :id")
    fun getCar (id : Int) : Flow<Car>
}
```


```kotlin
@Dao
interface MotorDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMotor (motorbike: Motorbike)

    @Update
    suspend fun updateMotor (motorbike: Motorbike)

    @Delete
    suspend fun deleteMotor (motorbike : Motorbike)

    @Query ("SELECT * FROM motor")
    fun getAllMotor () : Flow<List<Motorbike>>

    @Query ("SELECT * FROM motor where motor_id = :id")
    fun getMotor (id : Int) : Flow<Motorbike>
}
```

```kotlin
@Dao
interface SellingDao {

    @Insert
    fun addSellingData( item : Selling)

    @Update
    fun updateSellingData(item : Selling)

    @Query ("SELECT id, vehicleId FROM car as C INNER JOIN  selling as S ON C.car_id = S.vehicleId")
    fun getAllSellingDatas () : Flow<List<Selling>>

    @Query ("SELECT id, vehicleId FROM car as C INNER JOIN  selling as S ON C.car_id = S.vehicleId WHERE id = :id")
    fun getSellingData (id) : Flow<Selling>
}
```









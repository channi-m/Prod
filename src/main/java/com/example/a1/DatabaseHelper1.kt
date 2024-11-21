import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.a1.DobavBd1
import kotlin.reflect.KParameter

class DatabaseHelper1(context: Context) : SQLiteOpenHelper(context, "DobavBd1.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = """
            CREATE TABLE items (
                id INTEGER PRIMARY KEY,
                title TEXT,
                kkal REAL,
                belki REAL,
                zhiri REAL,
                yglevodi REAL
            )
        """.trimIndent()
        db.execSQL(createTable)
        insertInitialData(db)
    }

    private fun insertInitialData(db: SQLiteDatabase) {
        val items = listOf(
            "INSERT INTO items VALUES (1, 'Хлеб пшеничный из муки высшего сорта', 8.0, 1.5, 50.0, 262.0)",
            "INSERT INTO items VALUES (2, 'Хлеб пшеничный из муки 1 сорта', 7.6, 0.9, 49.7, 226.0)",
            "INSERT INTO items VALUES (3, 'Хлеб из ржано-пшеничной муки', 6.8, 1.2, 46.4, 215.0)"
        )
        for (item in items) {
            db.execSQL(item)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS items")
        onCreate(db)
    }
}

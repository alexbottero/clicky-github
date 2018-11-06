import analysis._
import org.scalatest.FunSuite
import org.apache.spark._
import org.apache.log4j._
import org.apache.spark.sql.{Column, DataFrame, SparkSession}
import analysis._

class DataAnalysisTest extends FunSuite {
    test("getArrayColumnIndexer") {
        
         Logger.getLogger("org").setLevel(Level.ERROR)

        val spark = SparkSession.builder().config("spark.master","local").getOrCreate()

        import spark.implicits._

        val someDF = Seq(
            (8, "bat"),
            (64, "mouse"),
            (-27, "horse")
        ).toDF("number", "word")

        

        assert()
    }
}
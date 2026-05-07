package Modelo;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoBD {
    // Singleton instance
    private static MongoBD instance;
    
    // Database name
    private final String databaseName = "P1ProyectoED";
    private MongoClient mongoClient;
    private MongoDatabase database;
    
    // Private constructor for Singleton pattern
    private MongoBD() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            database = mongoClient.getDatabase(databaseName);
            System.out.println("Successful connection to MongoDB");
        } catch (MongoException e) {
            System.out.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
    
    // Constructor with MongoClient parameter (for testing or dependency injection)
    public MongoBD(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }
    
    // Get Singleton instance
    public static MongoBD getInstance() {
        if (instance == null) {
            instance = new MongoBD();
        }
        return instance;
    }
    
    // Get database instance
    public MongoDatabase getDatabase() {
        return database;
    }
    
    // Get collection by name
    public MongoCollection<Document> getCollection(String name) {
        return database.getCollection(name);
    }
}
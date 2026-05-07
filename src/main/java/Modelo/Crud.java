package Modelo;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
public class Crud {
    
    // CREATE -------------------------------------------------------------
    public boolean create(String collectionName, Document doc) {
        try {
            MongoCollection<Document> col = MongoBD.getInstance().getCollection(collectionName);
            col.insertOne(doc);
            return true;
        } catch (MongoException e) {
            System.out.println("Error inserting document: " + e.getMessage());
            return false;
        }
    }

    // READ all -------------------------------------------------------------
    public List<Document> readAll(String collectionName) {
        List<Document> lista = new ArrayList<>();
        try {
            MongoCollection<Document> col = MongoBD.getInstance().getCollection(collectionName);
            col.find().forEach(doc -> lista.add(doc));
        } catch (MongoException e) {
            System.err.println("Error reading documents: " + e.getMessage());
        }
        return lista;
    }

    // READ with filter  ------------------------------------------------------
    public List<Document> readByField(String collectionName, String fieldName, Object value) {
        List<Document> lista = new ArrayList<>();
        try {
            MongoCollection<Document> col =
                    MongoBD.getInstance().getCollection(collectionName);
            col.find(new Document(fieldName, value))
                     .forEach(doc -> lista.add(doc));
        } catch (MongoException e) {
            System.err.println("Error filtering documents: " + e.getMessage());
        }
        return lista;
    }

    public Document readOne(String collectionName, String field, Object value) {
        try {
            MongoCollection<Document> col =
                    MongoBD.getInstance().getCollection(collectionName);
            return col.find(new Document(field, value)).first();
        } catch (MongoException e) {
            return null;
        }
    }
    
    // UPDATE -------------------------------------------------------------
    public boolean update(String collectionName, Document filtro, Document nuevosValores) {
        try {
            MongoCollection<Document> col =
                    MongoBD.getInstance().getCollection(collectionName);
            Document update = new Document("$set", nuevosValores);
            return col.updateOne(filtro, update).getModifiedCount() > 0;
        } catch (MongoException e) {
            System.err.println("Error updating document: " + e.getMessage());
            return false;
        }
    }

    // DELETE --------------------------------------------------------------
    public boolean delete(String collectionName, Document filtro) {
        try {
            MongoCollection<Document> col = MongoBD.getInstance().getCollection(collectionName);
            return col.deleteOne(filtro).getDeletedCount() > 0;
        } catch (MongoException e) {
            System.err.println("Error deleting document: " + e.getMessage());
            return false;
        }
    }

    // DELETE ALL ---------------------------------------------------------
    public boolean deleteMany(String collectionName, Document filtro) {
        try {
            MongoCollection<Document> col = MongoBD.getInstance().getCollection(collectionName);
            col.deleteMany(filtro);
            return true;
        } catch (MongoException e) {
            System.out.println("ERROR DELETE MANY: " + e.getMessage());
            return false;
        }
    }

    // DELETE BD --------------------------------------------------------
    public boolean dropDatabase() {
        try {
            MongoBD.getInstance().getDatabase().drop();
            return true;
        } catch (MongoException e) {
            System.out.println("ERROR DROP DATABASE: " + e.getMessage());
            return false;
        }
    }
}

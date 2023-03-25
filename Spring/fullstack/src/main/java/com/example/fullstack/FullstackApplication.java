package com.example.fullstack;

import com.example.fullstack.Model.Product;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@SpringBootApplication
public class FullstackApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FullstackApplication.class, args);

			String uri="mongodb://localhost:27017/demo";
			ConnectionString connectionString=new ConnectionString(uri);

		CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
		CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
		MongoClientSettings clientSettings = MongoClientSettings.builder()
				.applyConnectionString(connectionString)
				.codecRegistry(codecRegistry)
				.build();

			try(MongoClient mongoClient= MongoClients.create(clientSettings))
			{
			//	mongoClient.getDatabase("test")
				MongoDatabase database= mongoClient.getDatabase("demo");
				MongoCollection userCollection=database.getCollection("product",Product.class);

				Product product=new Product();
				product.setTitle("Book");
				product.setPrice("12.15$");
				product.setImage("book.png");
				product.setPrime(true);
				product.setRating(4);
				product.setReviews(123);

				userCollection.insertOne(product);

			}
	}

}

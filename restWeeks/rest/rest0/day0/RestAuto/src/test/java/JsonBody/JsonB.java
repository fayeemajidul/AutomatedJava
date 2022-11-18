package JsonBody;

public class JsonB {
    public static String AddPlace(){
        return """
                {
                  "location": {
                    "lat": -38.383494,
                    "lng": 33.427362
                  },
                  "accuracy": 50,
                  "name": "Fayeem Crib",
                  "phone_number": "(1) 646 323 0222",
                  "address": "Omaha, New York, 1109",
                  "types": [
                    "Shoppity Shop",
                    "The dawgs"
                  ],
                  "website": "http://google.com",
                  "language": "English-IN"
                }""";
    }
    public static String PutPlace(String place_id) {
        {
            String formatted = String.format("""
                    "place_id": %s,
                        "address":"70 Summer walk, USA",
                        "key":"qaclick123\"""", place_id);

            System.out.println(formatted);
        }
        return place_id;
    }
}

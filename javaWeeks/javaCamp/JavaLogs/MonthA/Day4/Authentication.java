import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

 * Description: Authentication Token:
 * Users are Authenticated, they are given auth tokens.
 * Token expires after an expiryLimit.
 * ExpiryTime resets after request given - ExpiryTime.
 * ---------------------

 * 1) An unexpired token_id can be reset n # of times.
 * 2) A reset issued to non-existent token_id is ignored.
 * 3) Expired token_id can not be reused

 * ---------------------
 * 
 * Expiry Commands:
 * 1: Create Command: 0 -- Generates Token w/ token_id at time T. It's expiry is T+expiryLimit
 * 
 * 2:Reset Command: 1 -- resets the expiry to T+Expiry.
 * 
 * ---------------------
 * Start w/ Empty List, perform Sequence of Request, sorted by ascending their T parameters.
 * 
 * Find # of Tokens that are active after all have been linkedListed.
 */
public class Authentication{
    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands){
        //First check if parameters is valid.
        if(commands == null || commands.isEmpty()){
            return 0;
        }
        Map<Integer,Integer> tokenIdTokenExpiry = new HashMap<>(); // Created a Map for T: T+ExpiryTime.

        //Looping through each token in commands.
        for(List<Integer> token:commands){
            if(token.size() != 3){
                return 0;
            }
            Integer tokenCommand = token.get(0);
            Integer tokenId = token.get(1);
            Integer tokenTime = token.get(2);

            //Checks if you create new token: places tokenID + tokenTime.

            if(tokenCommand == 0){
                tokenIdTokenExpiry.put(tokenId, tokenTime+ expiryLimit);
            }else{
                //Checks if Token is Valid| needs to be reset or removed.
                if(tokenIdTokenExpiry.containsKey(tokenId)){
                    //Reset Token Time
                    if(tokenTime <= tokenIdTokenExpiry.get(tokenId)){
                        tokenIdTokenExpiry.put(tokenId, tokenTime+expiryLimit);
                    }
                    else{
                        tokenIdTokenExpiry.remove(tokenId);
                    }
                }
            }
        }
        //Returns token time of the last token.
        Integer lastTime = commands.get(commands.size()-1).get(2);

        //Returns only valid token time and sorts valid token time.
        return (int)tokenIdTokenExpiry.values().stream().filter(tokenTime -> tokenTime >= lastTime).count();

    }
    
}


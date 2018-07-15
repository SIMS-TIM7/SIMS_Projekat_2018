/***********************************************************************
 * Module:  RecipeState.java
 * Author:  Ivan
 * Purpose: Defines the Interface RecipeState
 ***********************************************************************/

import java.util.*;

/** @pdOid e56e84ec-7f49-4f0c-9d54-1805cb1a71d2 */
public interface RecipeState {
   /** @pdOid ae360348-50c8-4c7e-86ee-f6b596ae13b3 */
   void verify();
   /** @pdOid 5f08f253-673d-42f9-b7d6-d04b248b847e */
   void suspend();
   /** @pdOid 0517aa55-1b7f-4b8a-add0-082a57319e61 */
   void activate();

}
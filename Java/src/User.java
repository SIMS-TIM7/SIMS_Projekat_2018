/***********************************************************************
 * Module:  User.java
 * Author:  Ivan
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 36bafbf2-250e-4696-9f51-d7acb6f20970 */
public class User {
   /** @pdOid 06aec2e7-060b-48e7-8aae-8ed1a26f8425 */
   private UserState state;
   /** @pdOid ebea38b6-0740-44fa-b897-cf01327395a6 */
   private String username;
   /** @pdOid 71ed2f82-625b-43bf-a672-96d4c97efc70 */
   private String password;
   /** @pdOid bfba2b06-9373-4e6d-ad2b-984a8dda105c */
   private String email;
   /** @pdOid e91a4afd-3f81-4dc0-ab29-89424d99b63f */
   private String fullName;
   /** @pdOid 269084ac-5dfc-4a79-9dcf-b0f0ff8b3ce3 */
   private UserRank rank;
   /** @pdOid 317911b3-0872-4cd3-8bdc-641e20fb9aae */
   private ArrayList<Recipe> favorites;
   
   /** @pdRoleInfo migr=no name=Recipe assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Recipe> recipe;
   
   /** @pdOid 1a7ab921-0a33-435e-bdf5-f143c1305d08 */
   public boolean newRecipe() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 9542794b-3836-47c7-82ca-26d013e58389 */
   public boolean deleteRecipe() {
      // TODO: implement
      return false;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Recipe> getRecipe() {
      if (recipe == null)
         recipe = new java.util.HashSet<Recipe>();
      return recipe;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRecipe() {
      if (recipe == null)
         recipe = new java.util.HashSet<Recipe>();
      return recipe.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRecipe */
   public void setRecipe(java.util.Collection<Recipe> newRecipe) {
      removeAllRecipe();
      for (java.util.Iterator iter = newRecipe.iterator(); iter.hasNext();)
         addRecipe((Recipe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRecipe */
   public void addRecipe(Recipe newRecipe) {
      if (newRecipe == null)
         return;
      if (this.recipe == null)
         this.recipe = new java.util.HashSet<Recipe>();
      if (!this.recipe.contains(newRecipe))
      {
         this.recipe.add(newRecipe);
         newRecipe.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRecipe */
   public void removeRecipe(Recipe oldRecipe) {
      if (oldRecipe == null)
         return;
      if (this.recipe != null)
         if (this.recipe.contains(oldRecipe))
         {
            this.recipe.remove(oldRecipe);
            oldRecipe.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRecipe() {
      if (recipe != null)
      {
         Recipe oldRecipe;
         for (java.util.Iterator iter = getIteratorRecipe(); iter.hasNext();)
         {
            oldRecipe = (Recipe)iter.next();
            iter.remove();
            oldRecipe.setUser((User)null);
         }
      }
   }

}
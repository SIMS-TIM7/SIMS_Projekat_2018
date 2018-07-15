/***********************************************************************
 * Module:  Application.java
 * Author:  Ivan
 * Purpose: Defines the Class Application
 ***********************************************************************/

import java.util.*;

/** @pdOid 5fcdf1fe-68b8-4010-9638-65e33a32117b */
public class Application {
   /** @pdOid 56faecb1-d768-4b24-a7d7-cb1c221ff51b */
   private User user;
   /** @pdOid e5ae8373-179a-4edb-a6bc-97a707787de5 */
   private AppState appState;
   
   /** @pdRoleInfo migr=no name=Recipe assc=Association_4 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Recipe> recipes;
   /** @pdRoleInfo migr=no name=User assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<User> users;
   
   public static void main(String[] args) {
	   
   }
   
   /** @pdOid b6a99f90-d40c-4f4f-8893-34e7a3f08c45 */
   public boolean checkLogin() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 2977fd79-960b-4c8d-a84e-c5bc4e3acce2 */
   public boolean addUser() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 27f47fc7-a866-4794-8d93-3537a100d99f */
   public boolean addRecipe() {
      // TODO: implement
      return false;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Recipe> getRecipes() {
      if (recipes == null)
         recipes = new java.util.HashSet<Recipe>();
      return recipes;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRecipes() {
      if (recipes == null)
         recipes = new java.util.HashSet<Recipe>();
      return recipes.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRecipes */
   public void setRecipes(java.util.Collection<Recipe> newRecipes) {
      removeAllRecipes();
      for (java.util.Iterator iter = newRecipes.iterator(); iter.hasNext();)
         addRecipes((Recipe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRecipe */
   public void addRecipes(Recipe newRecipe) {
      if (newRecipe == null)
         return;
      if (this.recipes == null)
         this.recipes = new java.util.HashSet<Recipe>();
      if (!this.recipes.contains(newRecipe))
         this.recipes.add(newRecipe);
   }
   
   /** @pdGenerated default remove
     * @param oldRecipe */
   public void removeRecipes(Recipe oldRecipe) {
      if (oldRecipe == null)
         return;
      if (this.recipes != null)
         if (this.recipes.contains(oldRecipe))
            this.recipes.remove(oldRecipe);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRecipes() {
      if (recipes != null)
         recipes.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<User> getUsers() {
      if (users == null)
         users = new java.util.HashSet<User>();
      return users;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUsers() {
      if (users == null)
         users = new java.util.HashSet<User>();
      return users.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUsers */
   public void setUsers(java.util.Collection<User> newUsers) {
      removeAllUsers();
      for (java.util.Iterator iter = newUsers.iterator(); iter.hasNext();)
         addUsers((User)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUsers(User newUser) {
      if (newUser == null)
         return;
      if (this.users == null)
         this.users = new java.util.HashSet<User>();
      if (!this.users.contains(newUser))
         this.users.add(newUser);
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUsers(User oldUser) {
      if (oldUser == null)
         return;
      if (this.users != null)
         if (this.users.contains(oldUser))
            this.users.remove(oldUser);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUsers() {
      if (users != null)
         users.clear();
   }

}
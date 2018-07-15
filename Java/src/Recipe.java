/***********************************************************************
 * Module:  Recipe.java
 * Author:  Ivan
 * Purpose: Defines the Class Recipe
 ***********************************************************************/

import java.util.*;

/** @pdOid b62a764a-0a12-4c01-874f-de8d34c852df */
public class Recipe {
   /** @pdOid 9a45bd84-f5c7-4d37-a51c-10212e71f4e8 */
   private RecipeState state;
   /** @pdOid 17206a24-3f7d-418c-8bf1-32be8d3a0a6e */
   private String name;
   /** @pdOid 7cf98002-33d1-49d6-a59d-605e83a02633 */
   private int cookingTime;
   /** @pdOid 4e740312-b03a-468a-ac96-5b14295f3f4e */
   private int difficulty;
   /** @pdOid b4756acc-c026-4fcc-b65b-d3abdbf3f4d2 */
   private String instructions;
   /** @pdOid 39e2ba1d-f779-43fd-bb44-5a77f0b8fccd */
   private int upvotes;
   /** @pdOid fb21a0db-8123-4fc3-a812-e2ef81a79573 */
   private int downvotes;
   /** @pdOid bbb56756-1d0b-4c80-85bf-8a938e814d39 */
   private java.util.Date dateCreated;
   /** @pdOid 5f48d246-1e4f-4b72-a3e7-729442c4e833 */
   private ArrayList<String> tags;
   /** @pdOid 1d925345-b316-4040-8beb-9bbed3c5700a */
   private User author;
   
   /** @pdRoleInfo migr=no name=Tool assc=Association_8 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Tool> tool;
   /** @pdRoleInfo migr=no name=Ingredient assc=Association_9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Ingredient> ingredient;
   /** @pdRoleInfo migr=no name=User assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public User user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tool> getTool() {
      if (tool == null)
         tool = new java.util.HashSet<Tool>();
      return tool;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTool() {
      if (tool == null)
         tool = new java.util.HashSet<Tool>();
      return tool.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTool */
   public void setTool(java.util.Collection<Tool> newTool) {
      removeAllTool();
      for (java.util.Iterator iter = newTool.iterator(); iter.hasNext();)
         addTool((Tool)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTool */
   public void addTool(Tool newTool) {
      if (newTool == null)
         return;
      if (this.tool == null)
         this.tool = new java.util.HashSet<Tool>();
      if (!this.tool.contains(newTool))
         this.tool.add(newTool);
   }
   
   /** @pdGenerated default remove
     * @param oldTool */
   public void removeTool(Tool oldTool) {
      if (oldTool == null)
         return;
      if (this.tool != null)
         if (this.tool.contains(oldTool))
            this.tool.remove(oldTool);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTool() {
      if (tool != null)
         tool.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Ingredient> getIngredient() {
      if (ingredient == null)
         ingredient = new java.util.HashSet<Ingredient>();
      return ingredient;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIngredient() {
      if (ingredient == null)
         ingredient = new java.util.HashSet<Ingredient>();
      return ingredient.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIngredient */
   public void setIngredient(java.util.Collection<Ingredient> newIngredient) {
      removeAllIngredient();
      for (java.util.Iterator iter = newIngredient.iterator(); iter.hasNext();)
         addIngredient((Ingredient)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIngredient */
   public void addIngredient(Ingredient newIngredient) {
      if (newIngredient == null)
         return;
      if (this.ingredient == null)
         this.ingredient = new java.util.HashSet<Ingredient>();
      if (!this.ingredient.contains(newIngredient))
         this.ingredient.add(newIngredient);
   }
   
   /** @pdGenerated default remove
     * @param oldIngredient */
   public void removeIngredient(Ingredient oldIngredient) {
      if (oldIngredient == null)
         return;
      if (this.ingredient != null)
         if (this.ingredient.contains(oldIngredient))
            this.ingredient.remove(oldIngredient);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIngredient() {
      if (ingredient != null)
         ingredient.clear();
   }
   /** @pdGenerated default parent getter */
   public User getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            oldUser.removeRecipe(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addRecipe(this);
         }
      }
   }

}
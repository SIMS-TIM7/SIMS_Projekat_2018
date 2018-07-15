/***********************************************************************
 * Module:  UserState.java
 * Author:  Ivan
 * Purpose: Defines the Interface UserState
 ***********************************************************************/

import java.util.*;

/** @pdOid 5d63b7c6-2506-4cff-9e2c-234aaf6b6d4b */
public interface UserState {
   /** @pdOid a79ae4a6-afd8-4a80-9fac-4c8e61b448e2 */
   void verify();
   /** @pdOid ebe4efce-285e-4401-86b1-0a2eddb7549c */
   void activate();
   /** @pdOid 40800433-604e-45e7-978b-6b4770af3e5e */
   void suspend();
   /** @pdOid f8d81597-bce6-4b38-8c27-d53c58b66fba */
   void login();
   /** @pdOid bca8604c-d7da-4fc5-9a8b-acae45c24ce8 */
   void logout();
   /** @pdOid a1d63eac-4ada-4762-9c0a-d6189cd76d84 */
   void register();

}
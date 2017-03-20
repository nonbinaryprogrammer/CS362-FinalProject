/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 20 00:41:08 GMT 2017
 */

package balesh.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import balesh.dominion.Card;
import balesh.dominion.GameState;
import balesh.dominion.Player;
import java.io.ObjectStreamConstants;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.CardName card_CardName1 = Card.CardName.Chancellor;
      Card.getCard(list0, card_CardName1);
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
      player0.discard = gameState0.cards;
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Chapel;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ">t {u");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>((SortedSet<? extends Card>) treeSet0);
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(priorityQueue0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.Chancellor;
      Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        treeSet0.add((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Random.setNextRandom((-1));
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Moat;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card.CardName card_CardName1 = Card.CardName.Chancellor;
      Card.getCard(list0, card_CardName1);
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Thief;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "W,U6I9(:b!q94,");
      player0.numBuys = 1995;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("balesh.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("balesh.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Witch;
      Card.getCard(list0, card_CardName0);
      Card.createCards();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Random.setNextRandom((-1));
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.filter(list0, card_Type0);
      Player player0 = new Player(gameState0, "?}je7bAl!");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      //  // Unstable assertion: assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card card0 = Card.getCard(linkedList0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName.values();
      Card.CardName.values();
      Card.CardName card_CardName0 = Card.CardName.Cellar;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Gold;
      Card.getCard(list0, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.getCard(list0, card_CardName0);
      Object object0 = new Object();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Woodcutter;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Random.setNextRandom((-1));
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Moneylender;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      Player player0 = new Player(gameState0, "?}je7bAl!");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Random.setNextRandom((-1));
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      Player player0 = new Player(gameState0, "?}je7bAl!");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      Player player0 = new Player(gameState0, "?}je7bAl!");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Random.setNextRandom((-1));
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      Player player0 = new Player(gameState0, "?}je7bAl!");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      gameState0.players = gameState0.players;
      Player player1 = new Player(gameState0, "?}je7bAl!");
      player1.playTreasureCard();
      player1.playedCards = list0;
      player1.discard(card0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Witch;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      gameState0.players = gameState0.players;
      Player player1 = new Player(gameState0, "?}je7bAl!");
      player1.playTreasureCard();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Chapel;
      Card.getCard(list0, card_CardName0);
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.CardName card_CardName1 = Card.CardName.Moat;
      Card.getCard(list0, card_CardName1);
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Witch;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      String string0 = "";
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      gameState0.players = gameState0.players;
      Player player1 = new Player(gameState0, "");
      player1.playTreasureCard();
      player1.Trash = gameState0.cards;
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Chancellor;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "t {u");
  }
}
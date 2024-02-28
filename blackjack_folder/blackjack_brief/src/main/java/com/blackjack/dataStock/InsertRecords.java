package com.blackjack.dataStock;

import com.blackjack.Card;
import com.blackjack.Croupier;
import com.blackjack.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecords

{
    //-------Insert For Player
    public static void insesrtPlayerRco( )
    {
        Connection con = DBConnection.getConnection();
        if(con == null)
        {
            return;
        }

        else//insert
        {
            String query = "INSERT INTO player(coins,Player_Value) VALUES(?,?);";
            try(PreparedStatement preparedStatement = con.prepareStatement(query))//Create statement step
            {
                preparedStatement.setInt(1, Player.coins);
                preparedStatement.setInt(2,Player.totalValuePlayer);
                //****execute statement
                preparedStatement.executeUpdate();
                //close the statement
                preparedStatement.close();
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }finally
            {
                //close the connextion
                try
                {
                    con.close();
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    //------Insert For Croupier
    public static void insesrtCroupierRco()
    {
        Connection con = DBConnection.getConnection();
        if(con == null)
        {
            return;
        }

        else//insert
        {
            String query = "INSERT INTO croupier(Croupier_value) VALUES(?);";
            try(PreparedStatement preparedStatement = con.prepareStatement(query))//Create statement step
            {
                preparedStatement.setInt(1, Croupier.totalValueCroupierFinal);
                //****execute statement
                preparedStatement.executeUpdate();
                //close the statement
                preparedStatement.close();
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }finally
            {
                //close the connextion
                try
                {
                    con.close();
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public  static void insertCardPlayer(Card.CardInfo cardInfo)
    {
        Connection con = DBConnection.getConnection();
        if(con == null)
        {
            return;
        }

        else//insert
        {
            String query = "INSERT INTO CardPlayer(card_value,card_type) VALUES(?,?);";
            try(PreparedStatement preparedStatement = con.prepareStatement(query))//Create statement step
            {
                preparedStatement.setInt(1,cardInfo.getCardValue());
                preparedStatement.setString(2,cardInfo.getCardType());
                //****execute statement
                preparedStatement.executeUpdate();
                //close the statement
                preparedStatement.close();
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }finally
            {
                //close the connextion
                try
                {
                    con.close();
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

    }


    public  static void insertCardCroupier(Card.CardInfo cardInfo)
    {
        Connection con = DBConnection.getConnection();
        if(con == null)
        {
            return;
        }

        else//insert
        {
            String query = "INSERT INTO CardCroupier(card_value,card_type) VALUES(?,?);";
            try(PreparedStatement preparedStatement = con.prepareStatement(query))//Create statement step
            {
                preparedStatement.setInt(1,cardInfo.getCardValue());
                preparedStatement.setString(2,cardInfo.getCardType());
                //****execute statement
                preparedStatement.executeUpdate();
                //close the statement
                preparedStatement.close();
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }finally
            {
                //close the connextion
                try
                {
                    con.close();
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }

    }



}

package com.github.zipcodewilmington.casino.games.BlackJack;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class BlackJackPlayer implements PlayerInterface {


    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public void playGame() {
        PlayerInterface.super.playGame();
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
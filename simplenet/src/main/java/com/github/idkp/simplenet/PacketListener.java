package com.github.idkp.simplenet;

import java.util.function.Consumer;

@FunctionalInterface
public interface PacketListener<T> extends Consumer<T> {

    @Override
    void accept(T payload);
}
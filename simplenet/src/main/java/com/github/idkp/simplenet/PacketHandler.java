package com.github.idkp.simplenet;

import java.io.IOException;

public interface PacketHandler {
    <T> void sendPacket(String name, T payload, PacketWriter writer);

    void sendPacket(String name, PacketWriter writer);

    ReadResult attemptToReadPacket(PacketReader reader) throws IOException;

    void registerDataPacket(String name);

    void setEncoder(String packetName, PayloadEncoder<?> encoder);

    void setDecoder(String packetName, PayloadDecoder<?> decoder);

    <T> boolean addPacketReceiveListener(String packetName, String name, PacketReceiveListener<T> listener);

    boolean removePacketReceiveListener(String packetName, String name);

    boolean removePacketReceiveListeners(String packetName);
}
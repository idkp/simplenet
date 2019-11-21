package com.github.idkp.simplenet;

import java.io.Closeable;
import java.nio.channels.SocketChannel;

public interface ActiveConnection extends Closeable {
    <T> void sendPacket(String name, T payload);

    void sendPacket(String name);

    void registerDataPacket(String name);

    void setPacketPayloadEncoder(String packetName, PayloadEncoder<?> encoder);

    void setPacketPayloadDecoder(String packetName, PayloadDecoder<?> decoder);

    <T> boolean addPacketReceiveListener(String packetName, String name, PacketReceiveListener<T> listener);

    boolean removePacketReceiveListener(String packetName, String name);

    boolean removePacketReceiveListeners(String packetName);

    SocketChannel getChannel();
}
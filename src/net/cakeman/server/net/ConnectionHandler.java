package net.cakeman.server.net;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import java.util.logging.Logger;

public class ConnectionHandler extends SimpleChannelHandler {
    private static final Logger logger = Logger.getLogger(ConnectionHandler.class.getName());

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        logger.info("Accepted connection <" + ctx.getChannel().getRemoteAddress() + ">");
    }
}

package com.cczywyc.springfx.aop;

/**
 * static proxy
 *
 * @author wangyc
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        EchoService echoService = new ProxyEchoService(new DefaultEchoService());
        echoService.echo("Hello wyc");
    }
}

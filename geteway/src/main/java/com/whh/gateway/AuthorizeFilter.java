package com.whh.gateway;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
@Order(-1)
public class AuthorizeFilter implements GlobalFilter  {
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1.上下文获取请求
        ServerHttpRequest request = exchange.getRequest();
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        //2.获取authorizaton的参数
        String authorization = queryParams.getFirst("authorization");
        //3.获取参数值是不是admin
        if ("admin".equals(authorization)){
            //4.放行
                  return  chain.filter(exchange);
        }else{
            //5.拦截
            //设置状态码
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();

        }


    }

}

package com.user.api.client;

import java.util.UUID;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("BOOKSERVICE")
@Component
public interface BookClient {

	@RequestMapping(value = "/books/{bookId}/users/{userId}", method = RequestMethod.PUT)
	public void reserveBook(@PathVariable("userId") UUID userId, @PathVariable("bookId") UUID bookId);
}

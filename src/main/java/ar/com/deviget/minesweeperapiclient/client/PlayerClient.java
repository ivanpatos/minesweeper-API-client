package ar.com.deviget.minesweeperapiclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.deviget.minesweeperapiclient.dto.PlayerRequestDto;
import ar.com.deviget.minesweeperapiclient.dto.PlayerResponseDto;

@FeignClient(name = "player", url = "${minesweeper-api.url}")
@RequestMapping(value = "/player", consumes = "application/json", produces = "application/json")
public interface PlayerClient {
	
	@RequestMapping(method = RequestMethod.POST)
    public PlayerResponseDto createPlayer(@RequestBody PlayerRequestDto playerRequestDto);
	
	@RequestMapping(value = "/{idPlayer}", method = RequestMethod.GET)
    public PlayerResponseDto getPlayer(@PathVariable("idPlayer") int idPlayer);

}

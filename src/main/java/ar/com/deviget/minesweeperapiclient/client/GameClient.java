package ar.com.deviget.minesweeperapiclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.deviget.minesweeperapiclient.dto.GameRequestDto;
import ar.com.deviget.minesweeperapiclient.dto.GameResponseDto;

@FeignClient(name = "game", url = "${minesweeper-api.url}")
@RequestMapping(value = "/game", consumes = "application/json", produces = "application/json")
public interface GameClient {
	
	@RequestMapping(method = RequestMethod.POST)
    GameResponseDto createGame(@RequestBody GameRequestDto gameRequestDto);
	
	@RequestMapping(value = "/{idGame}", method = RequestMethod.GET)
	GameResponseDto getGame(@PathVariable("idGame") int idGame);
	
	@RequestMapping(value = "/{idGame}/cell/{idCell}/reveal", method = RequestMethod.PUT)
    GameResponseDto revealCell(@PathVariable("idGame") int idGame, @PathVariable("idCell") int idCell);
	
	@RequestMapping(value = "/{idGame}/cell/{idCell}/flag", method = RequestMethod.PUT)
    GameResponseDto flagCell(@PathVariable("idGame") int idGame, @PathVariable("idCell") int idCell);
	
	@RequestMapping(value = "/{idGame}/pause", method = RequestMethod.PUT)
    GameResponseDto pauseGame(@PathVariable("idGame") int idGame);

}

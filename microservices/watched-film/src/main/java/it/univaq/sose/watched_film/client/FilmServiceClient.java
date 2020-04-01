package it.univaq.sose.watched_film.client;

import it.univaq.sose.watched_film.model.Film;
import org.springframework.cloud.openfeign.FeignClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@FeignClient(name = "film-ws")
public interface FilmServiceClient {
    @GET()
    @Path("/film/{filmId}")
    @Produces(MediaType.APPLICATION_JSON)
    Film getFilmById(@PathParam("filmId") String filmId);
}
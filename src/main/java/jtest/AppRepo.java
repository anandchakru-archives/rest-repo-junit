package jtest;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "app")
public interface AppRepo extends PagingAndSortingRepository<App, Long> {
	@RestResource(path = "by", rel = "by") //	http://localhost:8080/app/search/by?name=jrvite
	List<App> findByAppName(@Param("name") String appName);
}
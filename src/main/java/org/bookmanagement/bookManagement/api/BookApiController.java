package org.bookmanagement.bookManagement.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T16:07:06.265978700+02:00[Europe/Belgrade]")
@Controller
@RequestMapping("${openapi.bookManager.base-path:}")
public class BookApiController implements BookApi {

    private final BookApiDelegate delegate;

    public BookApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BookApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BookApiDelegate() {});
    }

    @Override
    public BookApiDelegate getDelegate() {
        return delegate;
    }

}

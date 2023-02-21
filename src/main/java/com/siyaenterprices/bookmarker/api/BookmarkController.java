package com.siyaenterprices.bookmarker.api;

import com.siyaenterprices.bookmarker.domain.BookmarksDto;
import com.siyaenterprices.bookmarker.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    @ResponseBody
    public BookmarksDto getBookmarks(@RequestParam(name = "page", defaultValue = "1") final Integer page) {
        return bookmarkService.getBookmarks(page);
    }
}

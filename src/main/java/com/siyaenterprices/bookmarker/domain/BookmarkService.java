package com.siyaenterprices.bookmarker.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    /*
        Adding readOnly true so that Hibernate can do some performance optimization as for this method we are not doing any data manipulation
    */
    @Transactional(readOnly = true)
    public BookmarksDto getBookmarks(Integer page) {
        final int pageNo = page < 1 ? 0 : page -1;
        final Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        final Page<BookmarkDto> bookmarkPages = bookmarkRepository.fetchBookmarks(pageable);
        return new BookmarksDto(bookmarkPages);
    }
}

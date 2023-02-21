package com.siyaenterprices.bookmarker.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("SELECT new com.siyaenterprices.bookmarker.domain.BookmarkDto(b.id, b.title, b.url, b.createdAt)" +
            " from Bookmark b")
    Page<BookmarkDto> fetchBookmarks(Pageable pageable);
}

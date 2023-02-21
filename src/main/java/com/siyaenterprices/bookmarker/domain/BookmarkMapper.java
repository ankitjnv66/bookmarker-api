package com.siyaenterprices.bookmarker.domain;

public class BookmarkMapper {

    public static BookmarkDto toBookmarkDto(final Bookmark bookmark) {
        return new BookmarkDto(bookmark.getId(), bookmark.getTitle(), bookmark.getUrl(), bookmark.getCreatedAt());
    }
}

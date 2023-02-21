package com.siyaenterprices.bookmarker;

import com.siyaenterprices.bookmarker.domain.Bookmark;
import com.siyaenterprices.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "test-bookmark1", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark2", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark3", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark4", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark5", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark6", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark7", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark8", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark9", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark10", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark11", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark12", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark13", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark14", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark15", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark16", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark17", "http://testbookmarks.in", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "test-bookmark18", "http://testbookmarks.in", Instant.now()));
    }
}

package hkmu.comps380f.project.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.UUID;

@Entity
public class BookCoverPhoto {
    @Id
    @GeneratedValue
    @ColumnDefault("random_uuid()")
    private UUID id;
    @Column(name = "filename")
    private String name;
    @Column(name = "content_type")
    private String mimeContentType;
    @Column(name = "content")
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] contents;
    @Column(name = "book_id", insertable=false, updatable=false)
    private long bookId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookInfo book;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMimeContentType() {
        return mimeContentType;
    }

    public void setMimeContentType(String mimeContentType) {
        this.mimeContentType = mimeContentType;
    }

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public BookInfo getBook() {
        return book;
    }

    public void setBook(BookInfo book) {
        this.book = book;
    }
}

import React from "react";

function BookDetails({ books }) {
  if (books.length === 0) {
    return <p>No books found.</p>;
  }
  return (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map(book => (
          <li key={book.id}>
            <strong>{book.title}</strong> — {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default BookDetails;

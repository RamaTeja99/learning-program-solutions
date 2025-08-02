import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

const books = [
  { id: 1, title: "React in Action", author: "Mark Tielens Thomas" },
  { id: 2, title: "Learning React", author: "Alex Banks" }
];

const blogs = [
  { id: 1, title: "Getting Started with React", summary: "An introduction to React." },
  { id: 2, title: "Advanced React Patterns", summary: "Hooks, Context, and more." }
];

const courses = [
  { id: 1, name: "React for Beginners", duration: "4 weeks" },
  { id: 2, name: "Fullstack Development", duration: "10 weeks" }
];

function App() {
  const [view, setView] = useState("all"); 
  let content;
  if (view === "books") {
    content = <BookDetails books={books} />;
  } else if (view === "blogs") {
    content = <BlogDetails blogs={blogs} />;
  } else if (view === "courses") {
    content = <CourseDetails courses={courses} />;
  } else {
    content = (
      <>
        <BookDetails books={books} />
        <BlogDetails blogs={blogs} />
        <CourseDetails courses={courses} />
      </>
    );
  }

  return (
    <div style={{ padding: 20, fontFamily: "Arial" }}>
      <h1>Blogger App</h1>
      <div>
        <button onClick={() => setView("all")}>Show All</button>{" "}
        <button onClick={() => setView("books")}>Books</button>{" "}
        <button onClick={() => setView("blogs")}>Blogs</button>{" "}
        <button onClick={() => setView("courses")}>Courses</button>
      </div>
      <hr />
      {content}
      {books.length === 0 ? <p>No books at all.</p> : null}
    </div>
  );
}

export default App;

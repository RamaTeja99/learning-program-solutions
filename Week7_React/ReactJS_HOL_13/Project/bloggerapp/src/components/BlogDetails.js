import React from "react";

function BlogDetails({ blogs }) {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.length === 0 && <p>No blogs found.</p>}
      {blogs.length > 0 && (
        <ul>
          {blogs.map(blog => (
            <li key={blog.id}>{blog.title}: {blog.summary}</li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default BlogDetails;

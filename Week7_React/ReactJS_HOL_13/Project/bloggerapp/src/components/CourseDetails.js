import React from "react";

function CourseDetails({ courses }) {
  if (!courses.length) return null;
  return (
    <div>
      <h2>Course Details</h2>
      <ul>
        {courses.map(course =>
          <li key={course.id}>
            <strong>{course.name}</strong> ({course.duration})
          </li>
        )}
      </ul>
    </div>
  );
}

export default CourseDetails;

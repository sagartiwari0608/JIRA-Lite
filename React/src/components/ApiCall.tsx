// import React from "react";
// import { usePostsInterval } from "../hooks/usePostsInterval"; // adjust the path as needed

// // export default function PostViewer() {
//   const { post, loading } = usePostsInterval();

//   return (
//     <div style={{ padding: "20px", fontFamily: "sans-serif" }}>
//       <h2>Post Viewer (1 Post Per Second)</h2>
//       {loading || !post ? (
//         <p>Loading...</p>
//       ) : (
//         <div>
//           <h3>{post.title}</h3>
//           <p>{post.body}</p>
//           <p>
//             <strong>Post ID:</strong> {post.id}
//           </p>
//         </div>
//       )}
//     </div>
//   );
// }
import React from "react";
import { usePostsSequence } from "../hooks/usePostsInterval";

export default function PostListViewer() {
  const { posts, loading } = usePostsSequence();

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Post Stream (1 every second)</h2>
      {loading && <p>Loading next post...</p>}
      {posts.map((post) => (
        <div
          key={post.id}
          style={{
            marginBottom: "1rem",
            padding: "1rem",
            border: "1px solid #ddd",
            borderRadius: "8px",
            background: "#f9f9f9",
          }}
        >
          <h3>{post.title}</h3>
          <p>{post.body}</p>
          <small style={{ color: "#666" }}>Post ID: {post.id}</small>
        </div>
      ))}

    </div>
  );
}

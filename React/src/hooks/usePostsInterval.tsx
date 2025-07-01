import { useEffect, useState } from "react";

export function usePostsSequence() {
  const [posts, setPosts] = useState([]);      // accumulated posts
  const [loading, setLoading] = useState(false);
  const [currentId, setCurrentId] = useState(1);

  useEffect(() => {
    let interval;

    const fetchPost = async (id) => {
      try {
        const res = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`);
        const data = await res.json();
        setPosts((prevPosts) => [...prevPosts, data]); // append new post
      } catch (err) {
        console.error("Error fetching post:", err);
      } finally {
        // setLoading(false);
      }
    };

    if (currentId <= 10) {
      setLoading(true);
      fetchPost(currentId); // fetch the first post immediately

      interval = setInterval(() => {
        setCurrentId((prevId) => {
          const nextId = prevId + 1;
          if (nextId <= 10) {
            fetchPost(nextId);
            return nextId;
          } else {
            clearInterval(interval);
            setLoading(false);
            return prevId;
          }
        });
      }, 1000);
    }

    return () => clearInterval(interval);
  }, []);

  return { posts, loading };
}

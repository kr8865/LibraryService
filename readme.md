| Feature                    | Algorithm / DS                       | Where                   |
| -------------------------- | ------------------------------------ | ----------------------- |
| Find a book by ID          | **HashMap lookup**                   | `Library`               |
| Search books by title      | **Linear search / substring search** | `Library`               |
| Search sorted books        | **Binary Search**                    | `Library`               |
| Sort books by title/author | **Merge Sort / Collections.sort**    | `Library`               |
| Recently returned books    | **Stack**                            | `Library`               |
| Borrowing queue            | **Queue**                            | `Library`               |
| Book reservation           | **Queue**                            | `Book`                  |
| Most borrowed books        | **HashMap + sorting/heap**           | `Library`               |
| Recommended books          | **Graph + BFS/DFS**                  | `RecommendationService` |
| Due-date priority          | **PriorityQueue / min-heap**         | `Library`               |
| User's borrowed books      | **HashSet / ArrayList**              | `User`                  |

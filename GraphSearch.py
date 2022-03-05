from __future__ import annotations

from queue import Queue


class Graph:
    def __init__(self) -> None:
        self.vertices: dict[int, list[int]] = {}

    def print_graph(self) -> None:
        #Builds visual representation of the search
        for i in self.vertices:
            print(i, " : ", " -> ".join([str(j) for j in self.vertices[i]]))

    def add_edge(self, from_vertex: int, to_vertex: int) -> None:
        #Add an edge in between two vertices 
        if from_vertex in self.vertices:
            self.vertices[from_vertex].append(to_vertex)
        else:
            self.vertices[from_vertex] = [to_vertex]

    def bfs(self, start_vertex: int) -> set[int]:
        
        # initialize set for storing already visited vertices
        visited = set()

        # create a first in first out queue to store all the vertices for BFS
        queue: Queue = Queue()

        # mark the source node as visited and enqueue it
        visited.add(start_vertex)
        queue.put(start_vertex)

        while not queue.empty():
            vertex = queue.get()

            # loop through all adjacent vertex and enqueue it if not yet visited
            for adjacent_vertex in self.vertices[vertex]:
                if adjacent_vertex not in visited:
                    queue.put(adjacent_vertex)
                    visited.add(adjacent_vertex)
        return visited



    #Note: Iterative DFS using stack
    #Same process as BFS except that we visit the adjacent elements in the stack before moving
    #To the next branch of graph.
    def depth_first_search(graph: dict, start: str) -> set[str]:
        
        explored, stack = set(start), [start]

        while stack:
            v = stack.pop()
            explored.add(v)
            
            for adj in reversed(graph[v]):
                if adj not in explored:
                    stack.append(adj)
        return explored



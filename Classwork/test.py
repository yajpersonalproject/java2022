import csv
import heapq

# read in graph from csv file
graph = {}
with open('facebook_clean_data.csv', 'r') as file:
    reader = csv.reader(file)
    next(reader)  # skip header row
    for nodes in reader:
        node1, node2, weight = map(int, nodes)
        if node1 not in graph:
            graph[node1] = {}
        if node2 not in graph:
            graph[node2] = {}
        graph[node1][node2] = weight
        graph[node2][node1] = weight

# define Dijkstra's algorithm
def dijkstra(graph, start):
    distances = {node: float('inf') for node in graph}
    distances[start] = 0

    pq = [(0, start)]
    while pq:
        (dist, curr) = heapq.heappop(pq)
        if dist > distances[curr]:
            continue
        for neighbor, weight in graph[curr].items():
            distance = dist + weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(pq, (distance, neighbor))

    return distances

# find shortest path between two nodes
node1, node2 = 1, 2
distances = dijkstra(graph, node1)
path = [node2]
while path[-1] != node1:
    prev_node = min(graph[path[-1]], key=lambda x: distances[x])
    path.append(prev_node)
path.reverse()

print(f"The shortest path between node {node1} and node {node2} is: {path}")

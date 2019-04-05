
public void broadFirstSearch(){
		isVisited=new boolean[vertexSize];
		for(int i=0;i<vertexSize;i++){
			if(!isVisited[i]){
				broadFirstSearch(i);
			}
		}
		isVisited=new boolean[vertexSize];
	}
  
private void broadFirstSearch(int i){
		int u,w;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		System.out.println("访问到了"+i+"顶点");
		isVisited[i]=true;
		queue.add(i);
		while(!queue.isEmpty()){
			u=(Integer)(queue.removeFirst()).intValue();
			w=getFirstNeigbour(u);
			while(w!=-1){
				if(!isVisited[w]){
					System.out.println("访问到了"+w+"顶点");
					isVisited[w]=true;
					queue.add(w);
				}
				w=getNextNeighbour(u, w);
			}
		}
	}

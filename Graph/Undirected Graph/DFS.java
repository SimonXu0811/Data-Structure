public int getFirstNeigbour(int index){
		for(int j=0;j<vertexSize;j++){
			if(matrix[index][j]>0&&matrix[index][j]<MAX_WEIGHT){
				return j;
			}
		}
		return -1;
	}

public int getNextNeighbour(int v,int index){
		for(int j=index+1;j<vertexSize;j++){
			if(matrix[v][j]>0&&matrix[v][j]<MAX_WEIGHT){
				return j;
			}
		}
		return -1;
	}

private void depthFirstSearch(int i){
		isVisited[i]=true;
		int w=getFirstNeigbour(i);
		while(w!=-1){
			if(!isVisited[w]){
				//需要遍历该顶点
				System.out.println("访问到了："+w+"顶点");
				depthFirstSearch(w);
			}
			w=getNextNeighbour(i, w);
		}
	}
	
public void depthFirstSearch(){
		isVisited=new boolean[vertexSize];
		for(int i=0;i<vertexSize;i++){
			if(!isVisited[i]){
				System.out.println("访问到了："+i+"顶点");
				depthFirstSearch(i);
			}
		}
		isVisited=new boolean[vertexSize];
	}

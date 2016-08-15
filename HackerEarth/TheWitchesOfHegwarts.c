#include <stdio.h>
#include <assert.h>
#include <string.h>

int min(a,b) { return a > b ? b : a; }

#define MAX 60108800
int moves[MAX];
void pre(){
    moves[1] = 0;
	moves[0] = 1000000001;
	for(int i=2;i<MAX;i++){
		moves[i] = 1+moves[i-1];
		if(i%2==0)
			moves[i] = min(moves[i], moves[i/2]+1);
		if(i%3==0)
			moves[i] = min(moves[i], moves[i/3]+ 1);
	}
	return;
}
int solve(int N){
	int ans;
	if(N<MAX)
		return moves[N];
	else{
		ans = N-1;
		if(N%2==0)
			ans = min(ans, 1+solve(N/2));
		else
			ans = min(ans, 1+solve(N-1));
		if(N%3==0)
			ans = min(ans, 1+solve(N/3));
		else
			ans = min(ans, 1+solve(N-1));
		return ans;
	}
}
int main(){
	int t, N;
	pre();
	scanf("%d",&t);
	while(t--){
		scanf("%d", &N);
		printf("%d\n",solve(N));
	}
	return 0;
}
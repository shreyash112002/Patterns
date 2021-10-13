#include<stdio.h>

int main()
{
 int a[10][10],b[10][10],c[10][10];
 int r1,r2,c1,c2,i,j,k;
 printf("Enter no of rows and columns for matrix 1");
 scanf("%d %d",&r1,&c1);
 printf("Enter no of rows and columns for matrix 2");
  scanf("%d %d",&r2,&c2);
  if(c1==r2)
  {
  	printf("Enter elements of matrix 1");
   for(i=0;i<r1;i++)
   {
   	for(j=0;j<c1;j++)
   	{
   		scanf("%d",&a[i][j]);
	   }
   }
   printf("Enter elements of matrix 2");
   for(i=0;i<r2;i++)
   {
   	for(j=0;j<c2;j++)
   	{	
   		scanf("%d",&b[i][j]);
	   }
   }
   //Multiplication
   for(i=0;i<r1;i++)
   {
   	for(j=0;j<c2;j++)
   	{
   		c[i][j]=0;
   		for(k=0;k<c1;k++)
   		{
   			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		   }
	   }
   }
   printf("Multiplication is ");
   for(i=0;i<r1;i++)
   {
   	for(j=0;j<c2;j++)
   	{
   		printf("%d\t",c[i][j]);
	   }
	   printf("\n");
	   
   }
  }
  else 
  {
  	printf("Multiplication is not possible");
  }
	
}

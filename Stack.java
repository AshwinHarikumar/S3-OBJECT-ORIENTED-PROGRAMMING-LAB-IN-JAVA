import java.util.*;
public class Stack
{
int[] Stack;
int top;
int n;

public Stack(int n){
this.n=n;
this.Stack= new int[this.n];
this.top=-1;}
public void push(int item){
if (top>=n-1){
System.out.println("Stack overflow");}
else{
Stack[++top]=item;
System.out.println("pushed element "+item);
}}
public void pop()
{
if(top==-1)
System.out.println("Stack underflow");
else
{
int item=Stack[top--];
System.out.println("poped element is "+item);
}}
public void display(){
if (top==-1){
System.out.println("Stack empty");}
else
{
System.out.print("Stack elements are");
for (int i=top;i>=0;i--){
System.out.println("\n"+Stack[i]);}}}
public static void main (String args[]){
boolean x=true;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size :");
int size=sc.nextInt();
Stack Stack =new Stack(size);
while(x){
System.out.println("\n Stack operations");
System.out.println("\n 1 for push \n 2 for pop \n 3 for display \n 4 for exit \n enter your choice \n");
int choice=sc.nextInt();
switch(choice){
case 1: System.out.println("Enter the element to be pushed");
int item =sc.nextInt();
Stack.push(item);
break;
case 2: Stack.pop();
break;
case 3: Stack.display();
break;
case 4: System.out.println("Exiting the Stack");
x=false;
break;
default: System.out.println("Invalid choice");
}}}}


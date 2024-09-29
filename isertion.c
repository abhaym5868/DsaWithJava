#include <stdio.h>
#include <stdlib.h>

// Define the maximum size of the stack and queue
#define MAX 5

// Stack implementation
typedef struct Stack {
    int data[MAX];
    int top;
} Stack;

void initStack(Stack *s) {
    s->top = -1;
}

int isStackFull(Stack *s) {
    return s->top == MAX - 1;
}

int isStackEmpty(Stack *s) {
    return s->top == -1;
}

void push(Stack *s, int value) {
    if (isStackFull(s)) {
        printf("Stack is full. Cannot push %d.\n", value);
    } else {
        s->data[++(s->top)] = value;
        printf("%d pushed onto stack.\n", value);
    }
}

// Queue implementation
typedef struct Queue {
    int data[MAX];
    int front, rear;
} Queue;

void initQueue(Queue *q) {
    q->front = q->rear = -1;
}

int isQueueFull(Queue *q) {
    return (q->rear + 1) % MAX == q->front;
}

int isQueueEmpty(Queue *q) {
    return q->front == -1;
}

void enqueue(Queue *q, int value) {
    if (isQueueFull(q)) {
        printf("Queue is full. Cannot enqueue %d.\n", value);
    } else {
        if (q->front == -1) q->front = 0;
        q->rear = (q->rear + 1) % MAX;
        q->data[q->rear] = value;
        printf("%d enqueued into queue.\n", value);
    }
}

// Linked list implementation
typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node* createNode(int value) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insertAtEnd(Node **head, int value) {
    Node *newNode = createNode(value);
    if (*head == NULL) {
        *head = newNode;
    } else {
        Node *temp = *head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
    printf("%d inserted into linked list.\n", value);
}

void displayLinkedList(Node *head) {
    Node *temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

// Main function
int main() {
    Stack stack;
    initStack(&stack);
    push(&stack, 10);
    push(&stack, 20);
    push(&stack, 30);

    Queue queue;
    initQueue(&queue);
    enqueue(&queue, 40);
    enqueue(&queue, 50);
    enqueue(&queue, 60);

    Node *linkedList = NULL;
    insertAtEnd(&linkedList, 70);
    insertAtEnd(&linkedList, 80);
    insertAtEnd(&linkedList, 90);

    printf("Linked list contents:\n");
    displayLinkedList(linkedList);

    return 0;
}
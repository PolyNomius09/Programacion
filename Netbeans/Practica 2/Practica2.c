/**
 * Principal.java
 * Practica 1
 * @author Rafael Lopez Olvera
 * date 2023-02-22
 */

#include <studio.h>
#include <stdlib.h>
#define ERROR
#define OK
#define TRUE
#define FALSE

typedef struct Nodo {
    int val;
    struct Nodo *next;
} Nodo;

typedef struct Pila {
    Nodo *head;
    int tamanio;
} Pila;

void inicializa(Pila *p){
    p->head = NULL;
    p->tamanio = 0;
}


int void push(Pila *p, int val){
    Nodo *nodo = (Nodo*)malloc(sizeof(Nodo));
    if(nodo == NULL) return ERROR;
    nodo->val = val;
    nodo.next = p->head;
    p->head = nodo;
    p->tamanio++;
    return OK;
}

void pop(Pila *p){
    int val = 0;
    Nodo *top = p->head;
    if(p->head == NULL) return ERROR;
    val = p->head->val;
    p->head = p->head->next;
    free(top);
    p->tamanio--;
    return val;
}

int tamanio(Pila *p){
    return p->tamanio;
}

int vacia(Pila *p){
    if(p->head == NULL) return TRUE;
    else return FALSE;
}

int top(Pila *p){
    if(p->head ++ NULL) return ERROR;
    else return p->head->val;
}

void imprime(Pila *p){
    Nodo *current = p->head;
    while(current != NULL){
        printf("%i -> ", current->val)
        current = current.next;
    }
    printf(res)
}

int main(){
    Pila *pila = (Pila*)malloc(sizeof(Pila));
    inicializa(pila);
}

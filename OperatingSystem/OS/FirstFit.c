#include <stdio.h>

#define MAX_BLOCKS 10
#define MAX_PROCESSES 10

void firstFit(int blockSize[], int blocks, int processSize[], int processes) {
    int allocation[MAX_PROCESSES];

    // Initially no block is assigned to any process
    for (int i = 0; i < processes; i++) {
        allocation[i] = -1;
    }

    // Pick each process and find the first block that fits
    for (int i = 0; i < processes; i++) {
        for (int j = 0; j < blocks; j++) { 
            if (blockSize[j] >= processSize[i]) {
                // Assign block j to process i
                allocation[i] = j;
                blockSize[j] -= processSize[i];
                break; // move to the next process
            }
        }
    }

    // Display allocation results
    printf("\nProcess No.\tProcess Size\tBlock No.\n");
    for (int i = 0; i < processes; i++) {
        printf("%d\t\t%d\t\t", i + 1, processSize[i]);
        if (allocation[i] != -1)
            printf("%d\n", allocation[i] + 1);
        else
            printf("Not Allocated\n");
    }
}

int main() {
    int blockSize[MAX_BLOCKS], processSize[MAX_PROCESSES];
    int blocks, processes;

    printf("Enter number of memory blocks: ");
    scanf("%d", &blocks);

    printf("Enter sizes of each block:\n");
    for (int i = 0; i < blocks; i++) {
        scanf("%d", &blockSize[i]);
    }

    printf("Enter number of processes: ");
    scanf("%d", &processes);

    printf("Enter sizes of each process:\n");
    for (int i = 0; i < processes; i++) {
        scanf("%d", &processSize[i]);
    }

    firstFit(blockSize, blocks, processSize, processes);

    return 0;
}

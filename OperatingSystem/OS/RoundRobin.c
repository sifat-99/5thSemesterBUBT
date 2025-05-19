#include <stdio.h>

struct Process {
    int pid;       // Process ID
    int bt;        // Burst Time
    int rt;        // Remaining Time (time left to execute)
    int ct;        // Completion Time
    int tat;       // Turnaround Time (ct - at)
    int wt;        // Waiting Time (tat - bt)
};

int main() {
    int n, time_quantum;

    // Input for number of processes and time quantum
    printf("Enter number of processes: ");
    scanf("%d", &n);
    printf("Enter time quantum: ");
    scanf("%d", &time_quantum);

    struct Process p[n];

    // Input for Burst Time of each process
    for (int i = 0; i < n; i++) {
        p[i].pid = i + 1;
        printf("Enter Burst Time for Process %d: ", p[i].pid);
        scanf("%d", &p[i].bt);
        p[i].rt = p[i].bt;  // Remaining time equals burst time initially
    }

    int time = 0;
    int completed = 0;

    // Round Robin Scheduling
    while (completed < n) {
        for (int i = 0; i < n; i++) {
            // If the process hasn't finished yet
            if (p[i].rt > 0) {
                int time_slice = (p[i].rt < time_quantum) ? p[i].rt : time_quantum;  // Execute for time quantum or the remaining time
                p[i].rt -= time_slice;
                time += time_slice;

                // If process finishes
                if (p[i].rt == 0) {
                    p[i].ct = time;
                    p[i].tat = p[i].ct;  // Turnaround Time = Completion Time (since all arrive at time 0)
                    p[i].wt = p[i].tat - p[i].bt;
                    completed++;
                }
            }
        }
    }

    // Output results
    float total_tat = 0, total_wt = 0;
    printf("\nPID\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++) {
        total_tat += p[i].tat;
        total_wt += p[i].wt;
        printf("%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turnaround Time = %.2f", total_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", total_wt / n);

    return 0;
}

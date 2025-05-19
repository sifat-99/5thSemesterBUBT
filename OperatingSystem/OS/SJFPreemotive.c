#include <stdio.h>

struct Process {
    int pid;
    int at;    // Arrival Time
    int bt;    // Burst Time
    int rt;    // Remaining Time
    int ct;    // Completion Time
    int tat;   // Turnaround Time
    int wt;    // Waiting Time
    int done;
};

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    struct Process p[n];

    // Input: AT and BT
    for (int i = 0; i < n; i++) {
        p[i].pid = i + 1;
        printf("Enter Arrival Time and Burst Time for Process %d: ", p[i].pid);
        scanf("%d%d", &p[i].at, &p[i].bt);
        p[i].rt = p[i].bt;  // Remaining time initially equals burst time
        p[i].done = 0;
    }

    int time = 0, completed = 0;
    int min_rt, idx;

    while (completed < n) {
        min_rt = 9999;
        idx = -1;

        // Find process with shortest remaining time at current time
        for (int i = 0; i < n; i++) {
            if (p[i].at <= time && p[i].done == 0 && p[i].rt < min_rt && p[i].rt > 0) {
                min_rt = p[i].rt;
                idx = i;
            }
        }

        if (idx != -1) {
            p[idx].rt--;
            time++;

            if (p[idx].rt == 0) {
                p[idx].ct = time;
                p[idx].tat = p[idx].ct - p[idx].at;
                p[idx].wt = p[idx].tat - p[idx].bt;
                p[idx].done = 1;
                completed++;
            }
        } else {
            time++;  // CPU idle
        }
    }

    // Output results
    float total_tat = 0, total_wt = 0;
    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++) {
        total_tat += p[i].tat;
        total_wt += p[i].wt;
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turnaround Time = %.2f", total_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", total_wt / n);

    return 0;
}

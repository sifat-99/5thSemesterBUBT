#include <stdio.h>

struct Process {
    int pid, at, bt, ct, tat, wt, completed;
};

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    struct Process p[n];

    // Input: Arrival Time and Burst Time
    for (int i = 0; i < n; i++) {
        p[i].pid = i + 1;
        printf("Enter Arrival Time and Burst Time for Process %d: ", p[i].pid);
        scanf("%d%d", &p[i].at, &p[i].bt);
        p[i].completed = 0;
    }

    int time = 0, completed = 0;

    while (completed < n) {
        int idx = -1;
        int min_bt = 9999;

        // Find process with min burst time among arrived and not completed
        for (int i = 0; i < n; i++) {
            if (p[i].at <= time && p[i].completed == 0 && p[i].bt < min_bt) {
                min_bt = p[i].bt;
                idx = i;
            }
        }

        if (idx != -1) {
            time += p[idx].bt;
            p[idx].ct = time;
            p[idx].tat = p[idx].ct - p[idx].at;
            p[idx].wt = p[idx].tat - p[idx].bt;
            p[idx].completed = 1;
            completed++;
        } else {
            time++; // CPU idle
        }
    }

    // Output Table
    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    float total_tat = 0, total_wt = 0;
    for (int i = 0; i < n; i++) {
        total_tat += p[i].tat;
        total_wt += p[i].wt;
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turnaround Time = %.2f", total_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", total_wt / n);

    return 0;
}

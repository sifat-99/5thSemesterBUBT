#include <stdio.h>

struct Process
{
    int pid;
    int at;       // Arrival Time
    int burstTime;       // Burst Time
    int remainingTime;       // Remaining Time
    int ct;       // Completion Time
    int tat;      // Turnaround Time
    int wt;       // Waiting Time
    int priority; // Higher number = higher priority
    int done;     // Completion flag
};

int main()
{
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    struct Process p[n];

    // Input section
    for (int i = 0; i < n; i++)
    {
        p[i].pid = i + 1;
        printf("Enter Arrival Time, Burst Time, and Priority for Process %d: ", p[i].pid);
        scanf("%d%d%d", &p[i].at, &p[i].burstTime, &p[i].priority);
        p[i].remainingTime = p[i].burstTime;
        p[i].done = 0;
    }

    int time = 0, completed = 0;
    int idx = -1;

    while (completed < n)
    {
        int max_priority = -1;
        idx = -1;

        // Select process with the highest priority available at current time
        for (int i = 0; i < n; i++)
        {
            if (p[i].at <= time && p[i].done == 0 && p[i].remainingTime > 0)
            {
                if (p[i].priority > max_priority)
                {
                    max_priority = p[i].priority;
                    idx = i;
                }
                // If two processes have same priority, break tie using arrival time
                else if (p[i].priority == max_priority && idx != -1 && p[i].at < p[idx].at)
                {
                    idx = i;
                }
            }
        }

        if (idx != -1)
        {
            p[idx].remainingTime--;
            time++;

            if (p[idx].remainingTime == 0)
            {
                p[idx].ct = time;
                p[idx].tat = p[idx].ct - p[idx].at;
                p[idx].wt = p[idx].tat - p[idx].burstTime;
                p[idx].done = 1;
                completed++;
            }
        }
        else
        {
            time++; // CPU idle
        }
    }

    // Output
    float total_tat = 0, total_wt = 0;
    printf("\nPID\tAT\tBT\tPR\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++)
    {
        total_tat += p[i].tat;
        total_wt += p[i].wt;
        printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].burstTime, p[i].priority,
               p[i].ct, p[i].tat, p[i].wt);
    }

    printf("\nAverage Turnaround Time = %.2f", total_tat / n);
    printf("\nAverage Waiting Time = %.2f\n", total_wt / n);

    return 0;
}

#include <stdio.h>

int main() {
    int dep = 0, deposit, with, op;

    while(1) {
        printf("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &op);
        
        switch(op) {
            case 1:
                printf("Enter the amount: ");
                scanf("%d", &deposit);
                dep += deposit;
                printf("Balance = %d\n", dep);
                break;

            case 2:
                printf("Enter the amount: ");
                scanf("%d", &with);
                if(dep >= with) {
                    dep -= with;
                    printf("Balance = %d\n", dep);
                } else {
                    printf("Insufficient balance!\n");
                }
                break;

            case 3:
                printf("Your balance is %d\n", dep);
                break;

            case 4:
                printf("Thank you\n");
                return 0;  // Exit the program
                
            default:
                printf("Invalid choice! Please enter 1-4\n");
        }
    }

    return 0;
}

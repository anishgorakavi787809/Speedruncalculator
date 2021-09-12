
#include <iostream>
#include <cstdlib>


using namespace std;
int main()
{
    int ans = 0;
    while (true)
    {


        system("cls");
        string userinput;
        cout << "plus or + is addition\n";
        cout << "- or minus is subtraction\n";
        cout << " * or multiply is subtraction\n";
        cout << "/ or divide is subtraction\n";
        cout << "% or modulo is subtraction\n";
        cout << "ans is ans followed by operator then number\n";
        cin >> userinput;

        if (userinput == "plus" || userinput == "+") {

            int x;
            int y;
            system("cls");
            try {
                cout << "What's the first number";
                cin >> x;
                cout << "What's the second number";
                cin >> y;

                int z = x + y;
                ans = z;
                printf("%d+%d = %d", x, y, z);
                cout << "\n";

                // Note only windows
                system("PAUSE");
            }

            catch (int e ){
                cout << "Error";
            }
        }
        if (userinput == "minus" || userinput == "-") {

            int x;
            int y;
            system("cls");
            try {
                cout << "What's the first number";
                cin >> x;
                cout << "What's the second number";
                cin >> y;

                int z = x - y;
                ans = z;
                printf("%d-%d = %d", x, y, z);
                cout << "\n";

                // Note only windows
                system("PAUSE");
            }

            catch (int e) {
                cout << "Error";
            }
        }

        if (userinput == "multiply" || userinput == "*") {

            int x;
            int y;
            system("cls");
            try {
                cout << "What's the first number";
                cin >> x;
                cout << "What's the second number";
                cin >> y;

                int z = x * y;
                ans = z;
                printf("%d*%d = %d", x, y, z);
                cout << "\n";

                // Note only windows
                system("PAUSE");
            }

            catch (int e) {
                cout << "Error";
            }
        }

        if (userinput == "divide" || userinput == "/") {

            int x;
            int y;
            while (true) {
                system("cls");
                try {
                    cout << "What's the first number";
                    cin >> x;
                    cout << "What's the second number";
                    cin >> y;

                    int z = x / y;
                    ans = z;
                    printf("%d/%d = %d", x, y, z);
                    cout << "\n";

                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }
        }

        if (userinput == "modulo" || userinput == "%") {
            system("cls");
            int x;
            int y;
            try {
                cout << "What's the first number";
                cin >> x;
                cout << "What's the second number";
                cin >> y;

                int z = x % y;
                ans = z;
                
                cout << x << "%" << y << "=" << z << "\n";

                // Note only windows
                system("PAUSE");
            }

            catch (int e) {
                cout << "Error";
            }
        }

        if (userinput == "ans" && !ans == 0) {
            system("cls");
            string ansinput;
            cout << "type add if you want to add ans + number you choose\n";
            cout << "type subtract if you want to subtract ans - number you choose\n";
            cout << "type multiply if you want to multipy ans * number you choose\n";
            cout << "type divide if you want to divide ans / number you choose\n";
            cout << "type modulo if you want to modulo ans % number you choose\n";
            cout << "Which one do you want to do with ans ?";
            cin >> ansinput;

            if (ansinput == "add" ) {
                system("cls");
               
                int y;
                try {
                   
                    cout << "What's the second number that you will add on top of ans?\n";
                    cin >> y;

                    int z = ans + y;
                   

                    cout << ans << "+" << y << "=" << z << "\n";
                    ans = z;
                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }

            if (ansinput == "subtract") {
                system("cls");

                int y;
                try {

                    cout << "What's the second number that you will subtract on top of ans?\n";
                    cin >> y;

                    int z = ans - y;
                    

                    cout << ans << "-" << y << "=" << z << "\n";
                    ans = z;
                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }

            if (ansinput == "multiply") {
                system("cls");

                int y;
                try {

                    cout << "What's the second number that you will multiply on top of ans?\n";
                    cin >> y;

                    int z = ans * y;
                   

                    cout << ans << "*" << y << "=" << z << "\n";
                    ans = z;
                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }
            if (ansinput == "divide") {
                system("cls");

                int y;
                try {

                    cout << "What's the second number that you will divide on top of ans?\n";
                    cin >> y;

                    int z = ans / y;
                    

                    cout << ans << "/" << y << "=" << z << "\n";
                    ans = z;
                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }

            if (ansinput == "modulo") {
                system("cls");

                int y;
                try {

                    cout << "What's the second number that you will do modulo on top of ans?\n";
                    cin >> y;

                    int z = ans % y;
                    

                    cout << ans << "%" << y << "=" << z << "\n";
                    ans = z;
                    // Note only windows
                    system("PAUSE");
                }

                catch (int e) {
                    cout << "Error";
                }
            }

        }

        else if (userinput == "ans" && ans == 0) {
        cout << "You need to fill up ans\n";
        system("PAUSE");
}

    }
    return 0;
} 

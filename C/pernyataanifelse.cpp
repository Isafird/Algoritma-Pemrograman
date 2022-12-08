#include <stdio.h>
#include <conio.h>
#include <iostream>
using namespace std;

main()
{
    double tot_beli, potongan = 0, jum_bayar = 0;

    cout << "total pembelian rp. ";
    cin >> tot_beli;

    if (tot_beli >= 50000)
        potongan = 0.2 * tot_beli;
    else
        potongan = 0.5 * tot_beli;

    cout << "besarnya potongan rp. " << potongan << endl;
    jum_bayar = tot_beli - potongan;
    cout << "jumlah yang harus dibayarkan rp. " << jum_bayar;

    getch();
}
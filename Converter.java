public class Converter {

    public static double getExchangeRate(String sourceCurrency, String targetCurrency) {
        if (sourceCurrency.equals("USD") && targetCurrency.equals("LIRA")) {
            return 27.41; // 1 USD = 27.41 EUR
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("DONG")) {
            return 24305.00; // 1 USD = 24,305 DONG
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("POUND")) {
            return 0.82; //1 USD = 0.82 POUNDS
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("KRONA")) {
            return 10.90; //1 USD = 10.90 KRONA
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("FRANC")) {
            return 0.91; //1 USD = 0.91 FRANC
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("RIYAL")) {
            return 3.75; //1 USD = 3.75 RIYAL
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("RAND")) {
            return 18.87; //1 USD = 18.87 RAND
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("RUPEE")) {
            return 133.01; //1 USD = 133.01 RUPEE
        }  else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("DONG")) {
            return 886.61; // 1 LIRA = 886.61 DONG
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("POUND")) {
            return 0.030; //1 LIRA = 0.030 POUNDS
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("KRONA")) {
            return 0.40; //1 LIRA = 0.40 KRONA
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("FRANC")) {
            return 0.033; //1 LIRA = 0.033 FRANC
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("RIYAL")) {
            return 0.14; //1 LIRA = 0.14 RIYAL
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("RAND")) {
            return 0.69; //1 LIRA = 0.69 RAND
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("RUPEE")) {
            return 4.85; //1 LIRA = 4.85 RUPEE
        } else if (sourceCurrency.equals("LIRA") && targetCurrency.equals("USD")) {
            return 0.036; //1 LIRA = 0.036 USD
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("POUND")) {
            return 0.000034; //1 DONG = 0.000034 POUNDS
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("KRONA")) {
            return 0.00045; //1 DONG = 0.00045 KRONA
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("FRANC")) {
            return 0.000038; //1 DONG = 0.000038 FRANC
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("RIYAL")) {
            return 0.00015; //1 DONG = 0.00015 RIYAL
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("RAND")) {
            return 0.00078; //1 DONG = 0.00078 RAND
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("RUPEE")) {
            return 0.0055; //1 DONG = 0.0055 RUPEE
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("USD")) {
            return 0.000041; //1 DONG = 0.000041 USD
        } else if (sourceCurrency.equals("DONG") && targetCurrency.equals("LIRA")) {
            return 0.0011; //1 DONG = 0.0011 LIRA
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("KRONA")) {
            return 13.31; //1 POUND = 13.31 KRONA
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("FRANC")) {
            return 1.12; //1 POUND = 1.12 FRANC
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("RIYAL")) {
            return 4.58; //1 POUND = 4.58 RIYAL
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("RAND")) {
            return 23.06; //1 POUND = 23.06 RAND
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("RUPEE")) {
            return 162.38; //1 POUND = 162.38 RUPEE
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("USD")) {
            return 1.22; //1 POUND = 1.22 USD
        } else if (sourceCurrency.equals("POUND") && targetCurrency.equals("LIRA")) {
            return 33.46; //1 POUND = 33.46 LIRA
        }else if (sourceCurrency.equals("POUND") && targetCurrency.equals("DONG")) {
            return 29775.08; //1 POUND = 29775.08 DONG
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("FRANC")) {
            return 0.084; //1 KRONA = 0.084 FRANC
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("RIYAL")) {
            return 0.34; //1 KRONA = 0.34 RIYAL
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("RAND")) {
            return 1.73; //1 KRONA = 1.73 RAND
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("RUPEE")) {
            return 12.19; //1 KRONA = 12.19 RUPEE
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("USD")) {
            return 0.092; //1 KRONA = 0.092 USD
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("LIRA")) {
            return 2.51; //1 KRONA = 2.51 LIRA
        }else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("DONG")) {
            return 2234.87; //1 KRONA = 2234.87 DONG
        } else if (sourceCurrency.equals("KRONA") && targetCurrency.equals("POUND")) {
            return 0.075; //1 KRONA = 0.075 POUND
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("RIYAL")) {
            return 4.10; //1 FRANC = 4.10 RIYAL
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("RAND")) {
            return 20.65; //1 FRANC = 20.65 RAND
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("RUPEE")) {
            return 145.23; //1 FRANC = 145.23 RUPEE
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("USD")) {
            return 1.09; //1 FRANC = 1.09 USD
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("LIRA")) {
            return 29.95; //1 FRANC = 29.95 LIRA
        }else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("DONG")) {
            return 26648.95; //1 FRANC = 26648.95 DONG
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("POUND")) {
            return 0.90; //1 FRANC = 0.90 POUND
        } else if (sourceCurrency.equals("FRANC") && targetCurrency.equals("KRONA")) {
            return 11.92; //1 FRANC = 11.92 KRONA
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("RAND")) {
            return 5.05; //1 RIYAL = 5.05 RAND
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("RUPEE")) {
            return 35.46; //1 RIYAL = 35.46 RUPEE
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("USD")) {
            return 0.27; //1 RIYAL = 0.27 USD
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("LIRA")) {
            return 7.31; //1 RIYAL = 7.31 LIRA
        }else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("DONG")) {
            return 6505.64; //1 RIYAL = 6505.64 DONG
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("POUND")) {
            return 0.22; //1 RIYAL = 0.22 POUND
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("KRONA")) {
            return 2.91; //1 RIYAL = 2.91 KRONA
        } else if (sourceCurrency.equals("RIYAL") && targetCurrency.equals("FRANC")) {
            return 0.24; // 1 RIYAL = 0.24 FRANC
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("RUPEE")) {
            return 7.03; //1 RAND = 7.03 RUPEE
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("USD")) {
            return 0.053; //1 RAND = 0.053 USD
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("LIRA")) {
            return 1.45; //1 RAND = 1.45 LIRA
        }else if (sourceCurrency.equals("RAND") && targetCurrency.equals("DONG")) {
            return 1289.64; //1 RAND = 1289.64 DONG
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("POUND")) {
            return 0.043; //1 RAND = 0.043 POUND
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("KRONA")) {
            return 0.58; //1 RAND = 0.58 KRONA
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("FRANC")) {
            return 0.048; // 1 RAND = 0.048 FRANC
        } else if (sourceCurrency.equals("RAND") && targetCurrency.equals("RIYAL")) {
            return 0.20; // 1 RAND = 0.20 RIYAL
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("USD")) {
            return 0.0075; //1 RUPEE = 0.0075 USD
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("LIRA")) {
            return 0.21; //1 RUPEE = 0.21 LIRA
        }else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("DONG")) {
            return 183.47; //1 RUPEE = 183.47 DONG
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("POUND")) {
            return 0.0062; //1 RUPEE = 0.0062 POUND
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("KRONA")) {
            return 0.082; //1 RUPEE = 0.082 KRONA
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("FRANC")) {
            return 0.0069; // 1 RUPEE = 0.0069 FRANC
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("RIYAL")) {
            return 0.028; // 1 RUPEE = 0.028 RIYAL
        } else if (sourceCurrency.equals("RUPEE") && targetCurrency.equals("RAND")) {
            return 0.14; //1 RUPEE = 0.14 RAND
        } else {
            return -1.0; // Invalid Currency Method
        }
    }
    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

}

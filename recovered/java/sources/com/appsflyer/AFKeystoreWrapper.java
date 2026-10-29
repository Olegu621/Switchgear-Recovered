            package com.appsflyer;

            import android.content.Context;
            import android.security.keystore.KeyGenParameterSpec;
            import java.io.IOException;
            import java.math.BigInteger;
            import java.security.KeyPairGenerator;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.cert.CertificateException;
            import java.util.Calendar;
            import java.util.Enumeration;
            import javax.security.auth.x500.X500Principal;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 136 */   public class AFKeystoreWrapper {
                public KeyStore getMonetizationNetwork;
                private Context getRevenue;
                public final Object getMediationNetwork = new Object();
                public String getCurrencyIso4217Code = HttpUrl.FRAGMENT_ENCODE_SET;
                public int AFAdRevenueData = 0;

                public AFKeystoreWrapper(Context context) {
/* 11 */            this.getRevenue = context;
/* 22 */            AFLogger.afInfoLog("Initialising KeyStore..");
                    try {
/* 27 */                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 31 */                this.getMonetizationNetwork = keyStore;
/* 34 */                keyStore.load(null);
                    } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
/* 41 */                AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
                    }
                }

                public final boolean AFAdRevenueData() {
                    boolean z;
                    synchronized (this.getMediationNetwork) {
                        try {
/* 4 */                     KeyStore keyStore = this.getMonetizationNetwork;
/* 6 */                     z = false;
/* 7 */                     if (keyStore != null) {
                                try {
/* 9 */                             Enumeration<String> enumerationAliases = keyStore.aliases();
/* 17 */                            while (enumerationAliases.hasMoreElements()) {
/* 19 */                                String strNextElement = enumerationAliases.nextElement();
/* 25 */                                if (strNextElement != null && AFAdRevenueData(strNextElement)) {
/* 35 */                                    String[] strArrSplit = strNextElement.split(",");
/* 41 */                                    if (strArrSplit.length != 3) {
                                                break;
                                            }
/* 49 */                                    AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(strNextElement));
/* 52 */                                    z = true;
/* 61 */                                    String[] strArrSplit2 = strArrSplit[1].trim().split("=");
/* 74 */                                    String[] strArrSplit3 = strArrSplit[2].trim().split("=");
/* 79 */                                    if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                                break;
                                                break;
                                            }
/* 90 */                                    this.getCurrencyIso4217Code = strArrSplit2[1].trim();
/* 102 */                                   this.AFAdRevenueData = Integer.parseInt(strArrSplit3[1].trim());
                                            break;
                                        }
                                    }
                                } catch (Throwable th) {
/* 110 */                           StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
/* 121 */                           sb.append(th.getClass().getName());
/* 128 */                           AFLogger.afErrorLog(sb.toString(), th);
                                }
                            }
                        } catch (Throwable th2) {
/* 137 */                   throw th2;
                        }
                    }
/* 135 */           return z;
                }

                public final String getCurrencyIso4217Code() {
                    String str;
                    synchronized (this.getMediationNetwork) {
/* 4 */                 str = this.getCurrencyIso4217Code;
                    }
/* 7 */             return str;
                }

                public final String getMonetizationNetwork() {
/* 7 */             StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
                    synchronized (this.getMediationNetwork) {
/* 15 */                sb.append(this.getCurrencyIso4217Code);
/* 18 */                sb.append(",KSAppsFlyerRICounter=");
/* 23 */                sb.append(this.AFAdRevenueData);
                    }
/* 27 */            return sb.toString();
                }

                public final void getRevenue(String str) {
/* 11 */            AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
                    try {
/* 14 */                Calendar calendar = Calendar.getInstance();
/* 18 */                Calendar calendar2 = Calendar.getInstance();
/* 24 */                calendar2.add(1, 5);
                        synchronized (this.getMediationNetwork) {
                            try {
/* 36 */                        if (this.getMonetizationNetwork.containsAlias(str)) {
/* 108 */                           AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                                } else {
/* 77 */                            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
/* 85 */                            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
/* 89 */                            keyPairGenerator.initialize(keyGenParameterSpecBuild);
/* 92 */                            keyPairGenerator.generateKeyPair();
                                }
                            } catch (Throwable th) {
/* 114 */                       throw th;
                            }
                        }
                    } catch (Throwable th2) {
/* 120 */               StringBuilder sb = new StringBuilder("Exception ");
/* 127 */               sb.append(th2.getMessage());
/* 132 */               sb.append(" occurred");
/* 139 */               AFLogger.afErrorLog(sb.toString(), th2);
                    }
                }

/* 137 */       private static boolean AFAdRevenueData(String str) {
/* 138 */           return str.startsWith("com.appsflyer");
                }

/* 142 */       public final int getRevenue() {
                    int i;
                    synchronized (this.getMediationNetwork) {
/* 144 */               i = this.AFAdRevenueData;
                    }
                    return i;
                }
            }

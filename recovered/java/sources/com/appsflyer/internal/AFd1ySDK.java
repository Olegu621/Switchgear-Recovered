            package com.appsflyer.internal;

            import android.content.Context;
            import com.appsflyer.AFLogger;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import kotlin.collections.CollectionsKt;
            import p000.C2103qd;
            import p000.C2122qw;
            import p000.gi0;
            import p000.ji0;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 93 */    public final class AFd1ySDK implements AFc1cSDK {
                private final AFc1hSDK getMonetizationNetwork;

                public AFd1ySDK(AFc1hSDK aFc1hSDK) {
/* 1 */             aFc1hSDK.getClass();
/* 7 */             this.getMonetizationNetwork = aFc1hSDK;
                }

                @Override // com.appsflyer.internal.AFc1cSDK
                public final String AFAdRevenueData(Throwable th, String str) {
                    String str2;
                    File file;
/* 3 */             th.getClass();
/* 6 */             str.getClass();
                    synchronized (this) {
/* 10 */                File fileAFAdRevenueData = AFAdRevenueData();
/* 14 */                str2 = null;
/* 15 */                if (fileAFAdRevenueData != null) {
/* 21 */                    file = new File(fileAFAdRevenueData, "6.17.6");
/* 28 */                    if (!file.exists()) {
/* 30 */                        file.mkdirs();
                            }
                        } else {
/* 37 */                    file = null;
                        }
/* 38 */                if (file != null) {
                            try {
/* 40 */                        AFc1aSDK revenue = AFd1sSDK.getRevenue(th, str);
/* 44 */                        String str3 = revenue.getRevenue;
/* 48 */                        File file2 = new File(file, str3);
/* 55 */                        if (file2.exists()) {
/* 57 */                            AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
/* 63 */                            AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(gi0.m3945b(file2));
/* 67 */                            if (mediationNetwork != null) {
/* 73 */                                mediationNetwork.getMediationNetwork++;
/* 75 */                                revenue = mediationNetwork;
                                    }
                                }
/* 84 */                        gi0.m3946c(file2, revenue.getMonetizationNetwork());
/* 87 */                        str2 = str3;
                            } catch (Exception e) {
/* 112 */                       AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                            }
                        }
                    }
/* 116 */           return str2;
                }

                @Override // com.appsflyer.internal.AFc1cSDK
                public final void getCurrencyIso4217Code(int i, int i2) {
                    File[] fileArrListFiles;
                    synchronized (this) {
                        try {
/* 2 */                     File fileAFAdRevenueData = AFAdRevenueData();
/* 6 */                     if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
/* 16 */                        ArrayList<File> arrayList = new ArrayList();
/* 21 */                        for (File file : fileArrListFiles) {
/* 25 */                            String name = file.getName();
/* 29 */                            name.getClass();
/* 32 */                            int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
/* 36 */                            if (i > mediationNetwork || mediationNetwork > i2) {
/* 41 */                                arrayList.add(file);
                                    }
                                }
/* 57 */                        ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 68 */                        for (File file2 : arrayList) {
/* 76 */                            file2.getClass();
/* 87 */                            arrayList2.add(Boolean.valueOf(ji0.m5827f(file2)));
                                }
                            }
                        } catch (Throwable th) {
/* 94 */                    throw th;
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFc1cSDK
                public final int getMediationNetwork() {
/* 5 */             Iterator<T> it = getRevenue().iterator();
/* 9 */             int i = 0;
/* 14 */            while (it.hasNext()) {
/* 24 */                i += ((AFc1aSDK) it.next()).getMediationNetwork;
                    }
/* 26 */            return i;
                }

                @Override // com.appsflyer.internal.AFc1cSDK
                public final boolean getMonetizationNetwork(String... strArr) {
                    boolean zM5827f;
/* 3 */             strArr.getClass();
                    synchronized (this) {
                        try {
/* 7 */                     File fileAFAdRevenueData = AFAdRevenueData();
/* 11 */                    zM5827f = true;
/* 12 */                    if (fileAFAdRevenueData != null) {
/* 15 */                        if (strArr.length == 0) {
/* 26 */                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
/* 29 */                            zM5827f = ji0.m5827f(fileAFAdRevenueData);
                                } else {
/* 58 */                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(C2103qd.m7775j(", ", 62, strArr)), false, 4, null);
/* 61 */                            File[] fileArrListFiles = fileAFAdRevenueData.listFiles();
/* 65 */                            if (fileArrListFiles != null) {
/* 69 */                                ArrayList<File> arrayList = new ArrayList();
/* 75 */                                for (File file : fileArrListFiles) {
/* 87 */                                    if (!C2103qd.m7772g(strArr, file.getName())) {
/* 89 */                                        arrayList.add(file);
                                            }
                                        }
/* 103 */                               ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 114 */                               for (File file2 : arrayList) {
/* 122 */                                   file2.getClass();
/* 133 */                                   arrayList2.add(Boolean.valueOf(ji0.m5827f(file2)));
                                        }
/* 137 */                               Set setM6195N = CollectionsKt.m6195N(arrayList2);
/* 145 */                               if (setM6195N.isEmpty()) {
/* 149 */                                   setM6195N = Collections.singleton(Boolean.TRUE);
/* 153 */                                   setM6195N.getClass();
                                        }
/* 160 */                               if (setM6195N.size() != 1 || !((Boolean) CollectionsKt.m6199t(setM6195N)).booleanValue()) {
/* 175 */                                   zM5827f = false;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 179 */                   throw th;
                        }
                    }
/* 177 */           return zM5827f;
                }

                @Override // com.appsflyer.internal.AFc1cSDK
                public final List<AFc1aSDK> getRevenue() {
                    List<AFc1aSDK> listM8021i;
                    File[] fileArrListFiles;
                    ArrayList arrayList;
                    synchronized (this) {
                        try {
/* 2 */                     File fileAFAdRevenueData = AFAdRevenueData();
/* 6 */                     listM8021i = null;
/* 7 */                     if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
/* 17 */                        ArrayList arrayList2 = new ArrayList();
/* 23 */                        for (File file : fileArrListFiles) {
                                    try {
/* 27 */                                File[] fileArrListFiles2 = file.listFiles();
/* 31 */                                if (fileArrListFiles2 != null) {
/* 35 */                                    arrayList = new ArrayList();
/* 40 */                                    for (File file2 : fileArrListFiles2) {
/* 44 */                                        AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
/* 46 */                                        file2.getClass();
/* 53 */                                        AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(gi0.m3945b(file2));
/* 57 */                                        if (mediationNetwork != null) {
/* 59 */                                            arrayList.add(mediationNetwork);
                                                }
                                            }
                                        } else {
/* 99 */                                    arrayList = null;
                                        }
                                    } catch (Throwable th) {
/* 96 */                                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                                    }
/* 100 */                           if (arrayList != null) {
/* 102 */                               arrayList2.add(arrayList);
                                    }
                                }
/* 111 */                       listM8021i = C2122qw.m8021i(arrayList2);
                            }
/* 115 */                   if (listM8021i == null) {
/* 117 */                       listM8021i = nd0.f14189a;
                            }
                        } catch (Throwable th2) {
/* 122 */                   throw th2;
                        }
                    }
/* 120 */           return listM8021i;
                }

                @Override // com.appsflyer.internal.AFc1cSDK
/* 94 */        public final boolean getCurrencyIso4217Code() {
/* 95 */            return getMonetizationNetwork(new String[0]);
                }

/* 118 */       private final File AFAdRevenueData() {
/* 120 */           Context context = this.getMonetizationNetwork.getMonetizationNetwork;
                    if (context == null) {
                        return null;
                    }
/* 121 */           File file = new File(context.getFilesDir(), "AFExceptionsCache");
/* 122 */           if (!file.exists()) {
/* 123 */               file.mkdirs();
                    }
                    return file;
                }
            }

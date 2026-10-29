            package com.appsflyer.internal;

            import android.content.Context;
            import android.util.Base64;
            import com.appsflyer.AFLogger;
            import io.sentry.AbstractC1552m4;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.instrumentation.file.C1500g;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStreamWriter;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Charsets;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.C1772ix;
            import p000.C1951n4;
            import p000.C2085pw;
            import p000.C2270uw;
            import p000.fm0;
            import p000.jb1;
            import p000.ji0;
            import p000.oc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 68 */    public final class AFc1vSDK implements AFc1tSDK {
                private final AFc1hSDK AFAdRevenueData;
                private final AFc1qSDK getMediationNetwork;
                private final Map<String, Integer> getMonetizationNetwork;
                private final AFc1rSDK getRevenue;

                public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
/* 1 */             aFc1hSDK.getClass();
/* 4 */             aFc1qSDK.getClass();
/* 10 */            this.AFAdRevenueData = aFc1hSDK;
/* 12 */            this.getMediationNetwork = aFc1qSDK;
/* 85 */            this.getRevenue = new AFc1rSDK(C2085pw.m7566e(new AFc1sSDK("ConversionsCache", C1839a.m6210b(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", C1839a.m6210b(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", C2085pw.m7566e(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
/* 115 */           this.getMonetizationNetwork = oc1.m7132f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
                }

                private static AFc1uSDK AFAdRevenueData(File file) {
                    try {
/* 16 */                InputStreamReader inputStreamReader = new InputStreamReader(AbstractC1417a.m5164b(file, new FileInputStream(file)), Charset.defaultCharset());
                        try {
/* 24 */                    char[] cArr = new char[(int) file.length()];
/* 26 */                    inputStreamReader.read(cArr);
/* 31 */                    AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
/* 38 */                    aFc1uSDK.getMediationNetwork = file.getName();
/* 40 */                    inputStreamReader.close();
/* 43 */                    return aFc1uSDK;
                        } catch (Throwable th) {
                            try {
/* 46 */                        throw th;
                            } catch (Throwable th2) {
/* 48 */                        jb1.m5754n(inputStreamReader, th);
/* 51 */                        throw th2;
                            }
                        }
                    } catch (Exception e) {
/* 65 */                AFLogger.INSTANCE.mo1748e(AFg1cSDK.CACHE, "Error while loading request from cache", e, false, false, true, false);
/* 68 */                return null;
                    }
                }

                private final void getMonetizationNetwork() {
/* 13 */            for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
/* 21 */                String str = aFc1sSDK.AFAdRevenueData;
/* 29 */                Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 31 */                context.getClass();
/* 43 */                File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
/* 51 */                if (file.exists()) {
/* 68 */                    Map<String, Integer> map = this.getMonetizationNetwork;
/* 70 */                    String str2 = aFc1sSDK.AFAdRevenueData;
/* 72 */                    File[] fileArrListFiles = file.listFiles();
/* 83 */                    map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
                        } else {
/* 53 */                    file.mkdirs();
/* 64 */                    this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFc1tSDK
                public final List<AFc1uSDK> getCurrencyIso4217Code() {
/* 14 */            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
/* 19 */            ArrayList arrayList = new ArrayList();
/* 24 */            ArrayList<File> arrayList2 = new ArrayList();
                    try {
/* 31 */                Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 33 */                context.getClass();
/* 47 */                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
/* 53 */                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
/* 55 */                    context2.getClass();
/* 65 */                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                        }
/* 77 */                Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
/* 85 */                while (it.hasNext()) {
/* 93 */                    String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
/* 101 */                   Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
/* 103 */                   context3.getClass();
/* 113 */                   File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
/* 120 */                   if (!file.exists()) {
/* 122 */                       file.mkdirs();
                            }
/* 125 */                   File[] fileArrListFiles = file.listFiles();
/* 129 */                   if (fileArrListFiles == null) {
/* 132 */                       fileArrListFiles = new File[0];
                            }
/* 134 */                   C2270uw.m9141l(arrayList2, fileArrListFiles);
                        }
/* 146 */               for (File file2 : arrayList2) {
/* 182 */                   AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
/* 185 */                   AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(file2);
/* 189 */                   if (aFc1uSDKAFAdRevenueData != null) {
/* 191 */                       arrayList.add(aFc1uSDKAFAdRevenueData);
                            }
                        }
                    } catch (Exception e) {
/* 208 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
                    }
/* 233 */           AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, AbstractC0886en.m3505i(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
/* 236 */           return arrayList;
                }

                @Override // com.appsflyer.internal.AFc1tSDK
                public final String getMediationNetwork(AFc1uSDK aFc1uSDK) {
                    Exception exc;
                    File file;
                    String str;
/* 13 */            aFc1uSDK.getClass();
                    try {
/* 17 */                AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
/* 19 */                aFe1pSDK.getClass();
/* 28 */                Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 30 */                context.getClass();
/* 44 */                File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK));
/* 51 */                if (!file2.exists()) {
/* 53 */                    file2.mkdirs();
                        }
/* 62 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 64 */                AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
/* 84 */                AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1uSDK.getRevenue, false, 4, null);
/* 91 */                String strValueOf = String.valueOf(System.currentTimeMillis());
/* 97 */                file = new File(file2, strValueOf);
                        try {
/* 100 */                   file.createNewFile();
/* 107 */                   String path = file.getPath();
/* 112 */                   FileOutputStream fileOutputStream = new FileOutputStream(path, true);
/* 127 */                   if (AbstractC1552m4.m5357b().mo5092l().isTracingEnabled()) {
/* 144 */                       fileOutputStream = new C1500g(C1500g.m5284c(path != null ? new File(path) : null, fileOutputStream, true));
                            }
/* 152 */                   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.defaultCharset());
                            try {
/* 157 */                       outputStreamWriter.write("version=");
/* 162 */                       outputStreamWriter.write(aFc1uSDK.getCurrencyIso4217Code);
/* 167 */                       outputStreamWriter.write(10);
/* 172 */                       outputStreamWriter.write("url=");
/* 177 */                       outputStreamWriter.write(aFc1uSDK.getRevenue);
/* 180 */                       outputStreamWriter.write(10);
/* 185 */                       outputStreamWriter.write("data=");
/* 197 */                       outputStreamWriter.write(Base64.encodeToString(aFc1uSDK.getMediationNetwork(), 2));
/* 200 */                       outputStreamWriter.write(10);
/* 203 */                       AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
/* 207 */                       outputStreamWriter.write("type=");
/* 214 */                       outputStreamWriter.write(aFe1pSDK2.name());
/* 217 */                       outputStreamWriter.write(10);
/* 220 */                       Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
/* 222 */                       if (map != null && !map.isEmpty()) {
/* 233 */                           outputStreamWriter.write("headers=");
/* 238 */                           Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
/* 240 */                           map2.getClass();
/* 246 */                           String string = new JSONObject(map2).toString();
/* 250 */                           string.getClass();
/* 255 */                           byte[] bytes = string.getBytes(Charsets.UTF_8);
/* 259 */                           bytes.getClass();
/* 266 */                           outputStreamWriter.write(Base64.encodeToString(bytes, 2));
/* 269 */                           outputStreamWriter.write(10);
                                }
/* 277 */                       outputStreamWriter.flush();
/* 280 */                       outputStreamWriter.close();
/* 299 */                       AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
/* 302 */                       AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
/* 304 */                       aFe1pSDK3.getClass();
/* 307 */                       AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
/* 324 */                       Integer numValueOf = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
/* 325 */                       if (numValueOf == null) {
/* 534 */                           return strValueOf;
                                }
/* 327 */                       int iIntValue = numValueOf.intValue();
/* 331 */                       Map<String, Integer> map3 = this.getMonetizationNetwork;
/* 333 */                       AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
/* 337 */                       if (mediationNetwork2 == null || (str = mediationNetwork2.AFAdRevenueData) == null) {
/* 533 */                           throw new UnsupportedOperationException("Cache do not support this type of events");
                                }
/* 343 */                       Integer num = map3.get(str);
/* 356 */                       int iIntValue2 = num != null ? num.intValue() : 0;
/* 357 */                       if (iIntValue2 >= iIntValue) {
/* 360 */                           int i = (iIntValue2 + 1) - iIntValue;
/* 390 */                           AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1pSDK3 + ", removing " + i + " item(s)", false, 4, null);
/* 399 */                           Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
/* 401 */                           context2.getClass();
/* 415 */                           File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK3));
/* 422 */                           if (!file3.exists()) {
/* 424 */                               file3.mkdirs();
                                    }
/* 427 */                           Object[] objArrListFiles = file3.listFiles();
/* 431 */                           if (objArrListFiles != null) {
/* 435 */                               Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t, T t2) {
/* 13 */                                        return C1772ix.m5609a(((File) t).getName(), ((File) t2).getName());
                                            }
                                        };
/* 439 */                               if (objArrListFiles.length != 0) {
/* 443 */                                   objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
/* 448 */                                   if (objArrListFiles.length > 1) {
/* 450 */                                       Arrays.sort(objArrListFiles, comparator);
                                            }
                                        }
/* 453 */                               List listAsList = Arrays.asList(objArrListFiles);
/* 457 */                               listAsList.getClass();
/* 460 */                               List<File> listM6187F = CollectionsKt.m6187F(i, listAsList);
/* 464 */                               if (listM6187F != null) {
/* 474 */                                   for (File file4 : listM6187F) {
/* 482 */                                       file4.delete();
/* 518 */                                       AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                            }
                                        }
                                    }
                                }
/* 522 */                       getMonetizationNetwork();
/* 525 */                       return strValueOf;
                            } catch (Throwable th) {
                                try {
/* 535 */                           throw th;
                                } catch (Throwable th2) {
/* 537 */                           jb1.m5754n(outputStreamWriter, th);
/* 540 */                           throw th2;
                                }
                            }
                        } catch (Exception e) {
/* 321 */                   exc = e;
/* 541 */                   if (file != null) {
/* 543 */                       file.delete();
                            }
/* 560 */                   AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
/* 16 */                    return null;
                        }
                    } catch (Exception e2) {
/* 58 */                exc = e2;
/* 59 */                file = null;
                    }
                }

                @Override // com.appsflyer.internal.AFc1tSDK
                public final void getRevenue() {
                    try {
/* 7 */                 Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 9 */                 context.getClass();
/* 23 */                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
/* 29 */                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
/* 31 */                    context2.getClass();
/* 41 */                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
/* 44 */                    return;
                        }
/* 49 */                Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
/* 57 */                while (it.hasNext()) {
/* 65 */                    String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
/* 73 */                    Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
/* 75 */                    context3.getClass();
/* 88 */                    File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
/* 92 */                    if (fileArrListFiles != null) {
/* 96 */                        for (File file : fileArrListFiles) {
/* 100 */                           AFLogger aFLogger = AFLogger.INSTANCE;
/* 102 */                           AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
/* 128 */                           AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
/* 160 */                           AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
/* 163 */                           file.delete();
                                }
                            }
                        }
/* 173 */               Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
/* 175 */               context4.getClass();
/* 185 */               ji0.m5827f(new File(context4.getFilesDir(), "AFRequestCache"));
/* 188 */               getMonetizationNetwork();
                    } catch (Exception e) {
/* 208 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
                    }
                }

/* 69 */        private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
                    String str;
/* 70 */            AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
                    if (mediationNetwork != null && (str = mediationNetwork.AFAdRevenueData) != null) {
                        return str;
                    }
/* 72 */            C1951n4.m6866q("Cache do not support this type of events");
                    return null;
                }

                @Override // com.appsflyer.internal.AFc1tSDK
/* 211 */       public final boolean getRevenue(String str) {
                    if (str == null) {
                        return false;
                    }
/* 214 */           Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 215 */           context.getClass();
/* 217 */           if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
/* 220 */               Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
/* 221 */               context2.getClass();
/* 223 */               new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                        return true;
                    }
/* 226 */           AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, fm0.m3784j("Deleting ", str, " from cache"), false, 4, null);
/* 229 */           Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
                    while (it.hasNext()) {
/* 231 */               String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
/* 235 */               Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
/* 236 */               context3.getClass();
/* 239 */               File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
/* 240 */               if (file.exists()) {
/* 241 */                   return getMediationNetwork(file);
                        }
                    }
                    return true;
                }

/* 563 */       private final boolean getMediationNetwork(File file) {
                    try {
/* 564 */               file.delete();
/* 565 */               getMonetizationNetwork();
                        return true;
                    } catch (Exception e) {
/* 568 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, fm0.m3784j("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
                        return false;
                    }
                }

/* 568 */       private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
                    Object next;
/* 571 */           Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
                    while (it.hasNext()) {
                        next = it.next();
/* 573 */               if (((AFc1sSDK) next).getMediationNetwork.contains(aFe1pSDK)) {
                            return (AFc1sSDK) next;
                        }
                    }
                    next = null;
                    return (AFc1sSDK) next;
                }

                @Override // com.appsflyer.internal.AFc1tSDK
/* 573 */       public final void getMediationNetwork() {
                    try {
/* 574 */               if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) != 2) {
/* 574 */                   this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
/* 592 */                   Context context = this.AFAdRevenueData.getMonetizationNetwork;
/* 593 */                   context.getClass();
/* 595 */                   if (new File(context.getFilesDir(), "AFRequestCache").exists()) {
/* 598 */                       Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
/* 599 */                       context2.getClass();
/* 601 */                       ji0.m5827f(new File(context2.getFilesDir(), "AFRequestCache"));
/* 604 */                       Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
/* 605 */                       context3.getClass();
/* 607 */                       new File(context3.getFilesDir(), "AFRequestCache").mkdir();
                            }
                        } else {
/* 579 */                   Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
/* 580 */                   context4.getClass();
/* 582 */                   if (!new File(context4.getFilesDir(), "AFRequestCache").exists()) {
/* 585 */                       Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
/* 586 */                       context5.getClass();
/* 588 */                       new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                            }
                        }
/* 608 */               getMonetizationNetwork();
                    } catch (Exception e) {
/* 609 */               AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
                    }
                }
            }

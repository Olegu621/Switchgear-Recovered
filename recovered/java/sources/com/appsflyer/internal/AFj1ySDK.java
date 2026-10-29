            package com.appsflyer.internal;

            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import java.util.Map;
            import java.util.concurrent.ExecutorService;
            import kotlin.Pair;
            import kotlin.text.StringsKt;
            import p000.ds0;
            import p000.oc1;
            import p000.pn1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 627 */   public final class AFj1ySDK extends AFi1cSDK {
                private final AFj1zSDK AFAdRevenueData;
                private final Runnable component2;
                private final AFc1oSDK getCurrencyIso4217Code;
                private final ExecutorService getMonetizationNetwork;
                private String hashCode;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1vSDK {
                    public static final /* synthetic */ int[] getRevenue;

                    static {
/* 6 */                 int[] iArr = new int[AFj1zSDK.values().length];
                        try {
/* 15 */                    iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 33 */                    iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
/* 35 */                getRevenue = iArr;
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
                    String str;
/* 1 */             aFc1oSDK.getClass();
/* 4 */             executorService.getClass();
/* 7 */             aFj1zSDK.getClass();
/* 10 */            runnable.getClass();
/* 13 */            runnable2.getClass();
/* 22 */            int i = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
/* 25 */            if (i == 1) {
/* 44 */                str = "facebook";
                    } else if (i == 2) {
/* 41 */                str = "instagram";
                    } else {
/* 31 */                if (i != 3) {
/* 36 */                    ds0.m3187b();
/* 40 */                    throw null;
                        }
/* 33 */                str = "facebook_lite";
                    }
/* 48 */            super("app", str, aFc1oSDK, runnable);
/* 51 */            this.getCurrencyIso4217Code = aFc1oSDK;
/* 53 */            this.getMonetizationNetwork = executorService;
/* 55 */            this.AFAdRevenueData = aFj1zSDK;
/* 57 */            this.component2 = runnable2;
                }

                /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
  0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
                private final boolean AFAdRevenueData(Context context) {
                    String str;
/* 6 */             if (!getRevenue()) {
/* 17 */                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
/* 5 */                 return false;
                    }
/* 25 */            String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
/* 39 */            String strM6233I = currencyIso4217Code != null ? StringsKt.m6233I(currencyIso4217Code, "fb") : null;
/* 40 */            if (strM6233I == null || strM6233I.length() == 0) {
/* 57 */                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
/* 60 */                strM6233I = null;
                    }
/* 61 */            if (strM6233I == null) {
/* 67 */                String revenue = this.getCurrencyIso4217Code.getRevenue("facebook_application_id");
/* 78 */                strM6233I = revenue != null ? StringsKt.m6233I(revenue, "fb") : null;
/* 79 */                if (strM6233I == null || strM6233I.length() == 0) {
/* 96 */                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
/* 99 */                    strM6233I = null;
                        }
/* 100 */               if (strM6233I == null) {
/* 106 */                   String currencyIso4217Code2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
/* 117 */                   strM6233I = currencyIso4217Code2 != null ? StringsKt.m6233I(currencyIso4217Code2, "fb") : null;
/* 118 */                   if (strM6233I == null || strM6233I.length() == 0) {
/* 135 */                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
/* 138 */                       strM6233I = null;
                            }
/* 139 */                   str = strM6233I != null ? strM6233I : null;
                        }
                    }
/* 143 */           this.hashCode = str;
/* 145 */           if (str == null) {
/* 156 */               AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
/* 5 */                 return false;
                    }
/* 164 */           if (getMediationNetwork(context)) {
/* 179 */               return true;
                    }
/* 175 */           AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
/* 5 */             return false;
                }

                private static boolean component3(Context context) {
                    return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
                }

                private static boolean getCurrencyIso4217Code(Context context) {
                    return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
                }

                private final boolean getMediationNetwork(Context context) {
/* 9 */             int i = AFa1vSDK.getRevenue[this.AFAdRevenueData.ordinal()];
/* 12 */            if (i == 1) {
/* 35 */                return getRevenue(context);
                    }
/* 15 */            if (i == 2) {
/* 30 */                return getCurrencyIso4217Code(context);
                    }
/* 18 */            if (i == 3) {
/* 20 */                return component3(context);
                    }
/* 25 */            ds0.m3187b();
/* 28 */            return false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:71:0x0215  */
                /* JADX WARN: Code duplicated, block: B:74:0x0227  */
                public static final void getRevenue(AFj1ySDK aFj1ySDK, Context context) {
                    Throwable th;
                    Cursor cursor;
                    ContentProviderClient contentProviderClient;
                    Uri uri;
                    String string;
                    String str;
/* 25 */            aFj1ySDK.getClass();
/* 28 */            context.getClass();
/* 35 */            aFj1ySDK.component1 = System.currentTimeMillis();
/* 39 */            aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
/* 46 */            aFj1ySDK.addObserver(new AFj1tSDK.C02871());
/* 49 */            String str2 = aFj1ySDK.hashCode;
/* 51 */            str2.getClass();
                    try {
/* 54 */                AFj1zSDK aFj1zSDK = aFj1ySDK.AFAdRevenueData;
/* 56 */                int[] iArr = AFa1vSDK.getRevenue;
/* 62 */                int i = iArr[aFj1zSDK.ordinal()];
/* 68 */                if (i != 1) {
/* 70 */                    if (i != 2) {
/* 73 */                        if (i != 3) {
/* 136 */                           throw new pn1();
                                }
/* 79 */                        if (component3(context)) {
/* 93 */                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
/* 100 */                           uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str2));
                                } else {
/* 126 */                           AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
/* 129 */                           uri = null;
                                }
                            } else if (getCurrencyIso4217Code(context)) {
/* 155 */                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
/* 162 */                       uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str2));
                            } else {
/* 179 */                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
/* 129 */                       uri = null;
                            }
                        } else if (getRevenue(context)) {
/* 201 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
/* 208 */                   uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str2));
                        } else {
/* 225 */                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
/* 129 */                   uri = null;
                        }
/* 229 */               if (uri != null) {
/* 237 */                   ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                            try {
/* 268 */                       Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
/* 269 */                       if (cursorQuery != null) {
                                    try {
/* 275 */                               if (cursorQuery.moveToFirst()) {
/* 279 */                                   int columnIndex = cursorQuery.getColumnIndex("install_referrer");
/* 284 */                                   if (columnIndex != -1) {
/* 286 */                                       string = cursorQuery.getString(columnIndex);
                                            } else {
/* 326 */                                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.AFAdRevenueData + " provider", false, 4, null);
/* 329 */                                       string = null;
                                            }
/* 330 */                                   if (string != null) {
/* 361 */                                       AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.AFAdRevenueData + " attribution data.", false, 4, null);
/* 364 */                                       Map<String, Object> map = aFj1ySDK.getMediationNetwork;
/* 366 */                                       map.getClass();
/* 373 */                                       map.put("response", "OK");
/* 376 */                                       Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
/* 378 */                                       map2.getClass();
/* 383 */                                       map2.put("referrer", string);
/* 386 */                                       int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
/* 401 */                                       Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
/* 402 */                                       if (lValueOf != null) {
/* 416 */                                           aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                                }
/* 419 */                                       int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
/* 436 */                                       Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
/* 438 */                                       if (numValueOf != null) {
/* 465 */                                           aFj1ySDK.getMediationNetwork.put("meta_custom", oc1.m7132f(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                                }
/* 474 */                                       int i2 = iArr[aFj1ySDK.AFAdRevenueData.ordinal()];
/* 476 */                                       if (i2 == 1) {
/* 495 */                                           str = "com.facebook.katana";
                                                } else if (i2 == 2) {
/* 492 */                                           str = "com.instagram.android";
                                                } else {
/* 481 */                                           if (i2 != 3) {
/* 491 */                                               throw new pn1();
                                                    }
/* 483 */                                           str = "com.facebook.lite";
                                                }
/* 497 */                                       Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
/* 499 */                                       map3.getClass();
/* 512 */                                       map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
/* 515 */                                       Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
/* 517 */                                       map4.getClass();
/* 526 */                                       map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str));
                                            }
/* 529 */                                   cursorQuery.close();
/* 532 */                                   if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 534 */                                       contentProviderClientAcquireUnstableContentProviderClient.close();
                                            }
                                        } else {
/* 547 */                                   AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
/* 550 */                                   if (cursorQuery != null) {
/* 552 */                                       cursorQuery.close();
                                            }
/* 555 */                                   if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 534 */                                       contentProviderClientAcquireUnstableContentProviderClient.close();
                                            }
                                        }
                                    } catch (Throwable th2) {
/* 292 */                               th = th2;
/* 294 */                               cursor = cursorQuery;
/* 295 */                               contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                        try {
/* 595 */                                   AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.AFAdRevenueData.name() + " provider", th, false, false, false, false, 120, null);
/* 598 */                                   if (cursor != null) {
/* 600 */                                       cursor.close();
                                            }
/* 603 */                                   if (contentProviderClient != null) {
/* 605 */                                       contentProviderClient.close();
                                            }
                                        } catch (Throwable th3) {
/* 618 */                                   if (cursor != null) {
/* 620 */                                       cursor.close();
                                            }
/* 623 */                                   if (contentProviderClient != null) {
/* 625 */                                       contentProviderClient.close();
                                            }
/* 628 */                                   throw th3;
                                        }
                                    }
                                } else {
/* 547 */                           AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
/* 550 */                           if (cursorQuery != null) {
/* 552 */                               cursorQuery.close();
                                    }
/* 555 */                           if (contentProviderClientAcquireUnstableContentProviderClient != null) {
/* 534 */                               contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                }
                            } catch (Throwable th4) {
/* 261 */                       th = th4;
/* 263 */                       contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
/* 265 */                       cursor = null;
                            }
                        }
                    } catch (Throwable th5) {
/* 107 */               th = th5;
/* 109 */               cursor = null;
/* 110 */               contentProviderClient = null;
                    }
/* 608 */           aFj1ySDK.getMediationNetwork();
/* 613 */           aFj1ySDK.component2.run();
                }

                @Override // com.appsflyer.internal.AFj1tSDK
                public final void getMonetizationNetwork(Context context) {
/* 1 */             context.getClass();
/* 8 */             if (AFAdRevenueData(context)) {
/* 24 */                this.getMonetizationNetwork.execute(new RunnableC0295g(5, this, context));
                    } else {
/* 12 */                this.component2.run();
                    }
                }

/* 628 */       private static boolean getRevenue(Context context) {
                    return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
                }
            }

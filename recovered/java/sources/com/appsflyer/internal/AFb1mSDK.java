            package com.appsflyer.internal;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFb1mSDK extends AFb1uSDK<String> {
                public AFb1mSDK(Context context, Executor executor) {
/* 9 */             super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.appsflyer.internal.AFb1uSDK
                /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
                public String getRevenue() throws Throwable {
/* 1 */             Cursor cursor = null;
                    try {
/* 6 */                 ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
/* 14 */                StringBuilder sb = new StringBuilder("content://");
/* 19 */                sb.append(this.getMediationNetwork);
/* 37 */                Cursor cursorQuery = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
/* 41 */                if (cursorQuery != null) {
                            try {
/* 47 */                        if (cursorQuery.moveToFirst()) {
/* 53 */                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
/* 57 */                            cursorQuery.close();
/* 60 */                            return string;
                                }
                            } catch (Throwable th) {
/* 61 */                        th = th;
/* 62 */                        cursor = cursorQuery;
/* 71 */                        if (cursor != null) {
/* 73 */                            cursor.close();
                                }
/* 76 */                        throw th;
                            }
                        }
/* 64 */                if (cursorQuery != null) {
/* 66 */                    cursorQuery.close();
                        }
/* 1 */                 return null;
                    } catch (Throwable th2) {
/* 70 */                th = th2;
                    }
                }

                public final String getMediationNetwork() {
/* 5 */             this.AFAdRevenueData.execute(this.getRevenue);
/* 12 */            return (String) super.getMonetizationNetwork();
                }

                @Override // com.appsflyer.internal.AFb1uSDK
                public final /* synthetic */ String getMonetizationNetwork() {
/* 5 */             this.AFAdRevenueData.execute(this.getRevenue);
/* 12 */            return (String) super.getMonetizationNetwork();
                }
            }
